package plugins.media.itunes;

import static org.junit.Assert.*;

import org.junit.Test;

import plugins.media.MediaPlayer;
import plugins.media.SongInfo;

public class iTunesMediaPlayerMacTest {

	/**
	 * Tests the {@link ITunesMediaPlayerMac}#getCurrentPlayingSong method. First is tells iTunes to
	 * start/pause which will cause iTunes to start if it's not started yet. After that it will retrieve
	 * the current song and checks that the song info is set.
	 */
	@Test
	public void testGetCurrentPlayingSong() {
		Runtime rt = Runtime.getRuntime();
		try {
			String[] args = { "osascript", "-e",
					"tell app \"iTunes\" to playpause" };
			rt.exec(args);
			Thread.sleep(2000);
			MediaPlayer mp = new ITunesMediaPlayerMac();
			SongInfo songInfo = mp.getCurrentPlayingSong();
			assertNotNull(songInfo.getArtist());
			assertNotNull(songInfo.getTitle());
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
}
