package plugins.media;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class SongInfoTest {

	private SongInfo siBasic;
	private SongInfo siExtended;

	@SuppressWarnings("unused")
	@Before
	public void begin() {
		siBasic = new SongInfo();
		siExtended = new SongInfo("Hendrik", "I only sing in the shower");
	}

	@Test
	public final void testSongInfoStringString() {
		assertEquals("Hendrik", siExtended.getArtist());
		assertEquals("I only sing in the shower", siExtended.getTitle());
	}

	@Test
	public final void testSongInfo() {
		assertEquals(null, siBasic.getArtist());
		assertEquals(null, siBasic.getTitle());
	}

	@Test
	public final void testGetArtist() {
		assertEquals("Hendrik", siExtended.getArtist());
	}

	@Test
	public final void testSetArtist() {
		testGetArtist();
		siExtended.setArtist("Steven");
		assertEquals("Steven", siExtended.getArtist());

	}

	@Test
	public final void testGetTitle() {
		//siBasic.setInterpret("Steven");
		assertEquals("I only sing in the shower", siExtended.getTitle());
	}

	@Test
	public final void testSetTitle() {
		testGetTitle();
		siExtended.setTitle("Hey");
		assertEquals("Hey", siExtended.getTitle());

	}

}
