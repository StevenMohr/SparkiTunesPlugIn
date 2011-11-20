/**
 * 
 */
package plugins.media.itunes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import plugins.media.MediaPlayer;
import plugins.media.SongInfo;


/**
 * @author Steven Mohr
 */
public class ITunesMediaPlayerMac implements MediaPlayer {

	@Override
	public SongInfo getCurrentPlayingSong() {
		Runtime rt = Runtime.getRuntime();
		SongInfo songInfo = new SongInfo();
		try {
			String[] args = { "osascript", "-e", "tell app \"iTunes\" to artist of current track as string" };
			Process proc = rt.exec(args);
			InputStream in = proc.getInputStream();
			String artist = new BufferedReader(new InputStreamReader(in)).readLine();

			String[] args2 = { "osascript", "-e", "tell app \"iTunes\" to name of current track as string" };
			proc = rt.exec(args2);
			in = proc.getInputStream();
			String title = new BufferedReader(new InputStreamReader(in)).readLine();

			songInfo.setArtist(artist);
			songInfo.setTitle(title);
		}
		catch (IOException e) {
			return null;
		}
		return songInfo;
	}
}
