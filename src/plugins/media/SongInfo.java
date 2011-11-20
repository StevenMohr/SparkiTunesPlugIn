package plugins.media;

/**
 * Contains all needed information about a song.
 */
public class SongInfo {
	private String artist;
	private String title;

	/***
	 * Create a song information set, with the most basic information we could
	 * possibly provide.
	 * 
	 * @param artist
	 *            the artist's name
	 * @param title
	 *            the song's title
	 */
	public SongInfo(String artist, String title) {
		this.artist = artist;
		this.title = title;
	}

	public SongInfo() {}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
