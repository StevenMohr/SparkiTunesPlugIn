/**
 * 
 */
package plugins.media.itunes;

import static org.junit.Assert.*;

import org.junit.Test;

import plugins.media.MediaPlayer;

/**
 * @author steven
 * 
 */
public class ITunesMediaPlayerFactoryTest {

	@Test
	public void testGetMediaPlayer() {
		MediaPlayer mp = ITunesMediaPlayerFactory.getITunesMediaPlayer();
		assertNotNull(mp);
		if (System.getProperty("os.name").toLowerCase().equals("windows")) {
			assertTrue(mp instanceof ITunesMediaPlayerWin);
		} else if (System.getProperty("os.name").toLowerCase().equals("mac os x")) {
			assertTrue(mp instanceof ITunesMediaPlayerMac);
		} else {
			fail();
		}
		
	}

}
