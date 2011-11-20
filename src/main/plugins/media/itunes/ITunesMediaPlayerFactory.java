/**
 * 
 */
package plugins.media.itunes;

import plugins.media.MediaPlayer;

/**
 * Encapsulates the decision which concrete iTunesMediaPlayer implementation is used.
 * 
 * @author steven
 *
 */
public class ITunesMediaPlayerFactory {
	
	/**
	 * Returns a {@link MediaPlayer} implementation based on the Operating System it's running on.
	 * 
	 * @return MediaPlayer implementation.
	 */
	public static MediaPlayer getITunesMediaPlayer(){
		final String osName = System.getProperty("os.name");
		if(osName.equals("windows")) {
			return new ITunesMediaPlayerWin();
		} else if (osName.toLowerCase().equals("mac os x")){
			return new ITunesMediaPlayerMac();
		}
		return null;
	}

}
