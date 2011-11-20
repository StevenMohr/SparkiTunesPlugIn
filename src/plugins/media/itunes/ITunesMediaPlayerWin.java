/**
 * 
 */
package plugins.media.itunes;

import plugins.media.MediaPlayer;
import plugins.media.SongInfo;

import com4j.itunes.ClassFactory;
import com4j.itunes.IITTrack;
import com4j.itunes.IiTunes;


public class ITunesMediaPlayerWin implements MediaPlayer {
	@Override
	public SongInfo getCurrentPlayingSong() {
		IiTunes itunes = ClassFactory.createiTunesApp();
		IITTrack track = itunes.currentTrack();
		SongInfo si = new SongInfo(track.artist(), track.name());
		return si;
	}
}
