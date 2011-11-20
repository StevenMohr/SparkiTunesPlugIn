package com4j.itunes  ;

import com4j.*;

/**
 * IiTunes Interface
 */
@IID("{9DD6680B-3EDC-40DB-A771-E6FE4832E34A}")
public interface IiTunes extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Reposition to the beginning of the current track or go to the previous track if already at start of current track.
   * </p>
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  void backTrack();


  /**
   * <p>
   * Skip forward in a playing track.
   * </p>
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  void fastForward();


  /**
   * <p>
   * Advance to the next track in the current playlist.
   * </p>
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
  void nextTrack();


  /**
   * <p>
   * Pause playback.
   * </p>
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(10)
  void pause();


  /**
   * <p>
   * Play the currently targeted track.
   * </p>
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  void play();


  /**
   * <p>
   * Play the specified file path, adding it to the library if not already present.
   * </p>
   * @param filePath Mandatory java.lang.String parameter.
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(12)
  void playFile(
    java.lang.String filePath);


  /**
   * <p>
   * Toggle the playing/paused state of the current track.
   * </p>
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(13)
  void playPause();


  /**
   * <p>
   * Return to the previous track in the current playlist.
   * </p>
   */

  @DISPID(1610743815) //= 0x60020007. The runtime will prefer the VTID if present
  @VTID(14)
  void previousTrack();


  /**
   * <p>
   * Disable fast forward/rewind and resume playback, if playing.
   * </p>
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(15)
  void resume();


  /**
   * <p>
   * Skip backwards in a playing track.
   * </p>
   */

  @DISPID(1610743817) //= 0x60020009. The runtime will prefer the VTID if present
  @VTID(16)
  void rewind();


  /**
   * <p>
   * Stop playback.
   * </p>
   */

  @DISPID(1610743818) //= 0x6002000a. The runtime will prefer the VTID if present
  @VTID(17)
  void stop();


  /**
   * <p>
   * Start converting the specified file path.
   * </p>
   * @param filePath Mandatory java.lang.String parameter.
   * @return  Returns a value of type com4j.itunes.IITOperationStatus
   */

  @DISPID(1610743819) //= 0x6002000b. The runtime will prefer the VTID if present
  @VTID(18)
  com4j.itunes.IITOperationStatus convertFile(
    java.lang.String filePath);


  /**
   * <p>
   * Start converting the specified array of file paths. filePaths can be of type VT_ARRAY|VT_VARIANT, where each entry is a VT_BSTR, or VT_ARRAY|VT_BSTR.  You can also pass a JScript Array object.
   * </p>
   * @param filePaths Mandatory java.lang.Object parameter.
   * @return  Returns a value of type com4j.itunes.IITOperationStatus
   */

  @DISPID(1610743820) //= 0x6002000c. The runtime will prefer the VTID if present
  @VTID(19)
  com4j.itunes.IITOperationStatus convertFiles(
    java.lang.Object filePaths);


  /**
   * <p>
   * Start converting the specified track.  iTrackToConvert is a VARIANT of type VT_DISPATCH that points to an IITTrack.
   * </p>
   * @param iTrackToConvert Mandatory java.lang.Object parameter.
   * @return  Returns a value of type com4j.itunes.IITOperationStatus
   */

  @DISPID(1610743821) //= 0x6002000d. The runtime will prefer the VTID if present
  @VTID(20)
  com4j.itunes.IITOperationStatus convertTrack(
    java.lang.Object iTrackToConvert);


  /**
   * <p>
   * Start converting the specified tracks.  iTracksToConvert is a VARIANT of type VT_DISPATCH that points to an IITTrackCollection.
   * </p>
   * @param iTracksToConvert Mandatory java.lang.Object parameter.
   * @return  Returns a value of type com4j.itunes.IITOperationStatus
   */

  @DISPID(1610743822) //= 0x6002000e. The runtime will prefer the VTID if present
  @VTID(21)
  com4j.itunes.IITOperationStatus convertTracks(
    java.lang.Object iTracksToConvert);


  /**
   * <p>
   * Returns true if this version of the iTunes type library is compatible with the specified version.
   * </p>
   * @param majorVersion Mandatory int parameter.
   * @param minorVersion Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743823) //= 0x6002000f. The runtime will prefer the VTID if present
  @VTID(22)
  boolean checkVersion(
    int majorVersion,
    int minorVersion);


  /**
   * <p>
   * Returns an IITObject corresponding to the specified IDs.
   * </p>
   * @param sourceID Mandatory int parameter.
   * @param playlistID Mandatory int parameter.
   * @param trackID Mandatory int parameter.
   * @param databaseID Mandatory int parameter.
   * @return  Returns a value of type com4j.itunes.IITObject
   */

  @DISPID(1610743824) //= 0x60020010. The runtime will prefer the VTID if present
  @VTID(23)
  com4j.itunes.IITObject getITObjectByID(
    int sourceID,
    int playlistID,
    int trackID,
    int databaseID);


  /**
   * <p>
   * Creates a new playlist in the main library.
   * </p>
   * @param playlistName Mandatory java.lang.String parameter.
   * @return  Returns a value of type com4j.itunes.IITPlaylist
   */

  @DISPID(1610743825) //= 0x60020011. The runtime will prefer the VTID if present
  @VTID(24)
  com4j.itunes.IITPlaylist createPlaylist(
    java.lang.String playlistName);


  /**
   * <p>
   * Open the specified iTunes Store or streaming audio URL.
   * </p>
   * @param url Mandatory java.lang.String parameter.
   */

  @DISPID(1610743826) //= 0x60020012. The runtime will prefer the VTID if present
  @VTID(25)
  void openURL(
    java.lang.String url);


  /**
   * <p>
   * Go to the iTunes Store home page.
   * </p>
   */

  @DISPID(1610743827) //= 0x60020013. The runtime will prefer the VTID if present
  @VTID(26)
  void gotoMusicStoreHomePage();


  /**
   * <p>
   * Update the contents of the iPod.
   * </p>
   */

  @DISPID(1610743828) //= 0x60020014. The runtime will prefer the VTID if present
  @VTID(27)
  void updateIPod();


  /**
   * @param numElems Mandatory int parameter.
   * @param data Mandatory java.lang.Object parameter.
   * @param names Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610743829) //= 0x60020015. The runtime will prefer the VTID if present
  @VTID(28)
  void authorize(
    int numElems,
    java.lang.Object data,
    Holder<java.lang.String> names);


  /**
   * <p>
   * Exits the iTunes application.
   * </p>
   */

  @DISPID(1610743830) //= 0x60020016. The runtime will prefer the VTID if present
  @VTID(29)
  void quit();


  /**
   * <p>
   * Returns a collection of music sources (music library, CD, device, etc.).
   * </p>
   * <p>
   * Getter method for the COM property "Sources"
   * </p>
   * @return  Returns a value of type com4j.itunes.IITSourceCollection
   */

  @DISPID(1610743831) //= 0x60020017. The runtime will prefer the VTID if present
  @VTID(30)
  com4j.itunes.IITSourceCollection sources();


  @VTID(30)
  @ReturnValue(defaultPropertyThrough={com4j.itunes.IITSourceCollection.class})
  com4j.itunes.IITSource sources(
    int index);

  /**
   * <p>
   * Returns a collection of encoders.
   * </p>
   * <p>
   * Getter method for the COM property "Encoders"
   * </p>
   * @return  Returns a value of type com4j.itunes.IITEncoderCollection
   */

  @DISPID(1610743832) //= 0x60020018. The runtime will prefer the VTID if present
  @VTID(31)
  com4j.itunes.IITEncoderCollection encoders();


  @VTID(31)
  @ReturnValue(defaultPropertyThrough={com4j.itunes.IITEncoderCollection.class})
  com4j.itunes.IITEncoder encoders(
    int index);

  /**
   * <p>
   * Returns a collection of EQ presets.
   * </p>
   * <p>
   * Getter method for the COM property "EQPresets"
   * </p>
   * @return  Returns a value of type com4j.itunes.IITEQPresetCollection
   */

  @DISPID(1610743833) //= 0x60020019. The runtime will prefer the VTID if present
  @VTID(32)
  com4j.itunes.IITEQPresetCollection eqPresets();


  @VTID(32)
  @ReturnValue(defaultPropertyThrough={com4j.itunes.IITEQPresetCollection.class})
  com4j.itunes.IITEQPreset eqPresets(
    int index);

  /**
   * <p>
   * Returns a collection of visual plug-ins.
   * </p>
   * <p>
   * Getter method for the COM property "Visuals"
   * </p>
   * @return  Returns a value of type com4j.itunes.IITVisualCollection
   */

  @DISPID(1610743834) //= 0x6002001a. The runtime will prefer the VTID if present
  @VTID(33)
  com4j.itunes.IITVisualCollection visuals();


  @VTID(33)
  @ReturnValue(defaultPropertyThrough={com4j.itunes.IITVisualCollection.class})
  com4j.itunes.IITVisual visuals(
    int index);

  /**
   * <p>
   * Returns a collection of windows.
   * </p>
   * <p>
   * Getter method for the COM property "Windows"
   * </p>
   * @return  Returns a value of type com4j.itunes.IITWindowCollection
   */

  @DISPID(1610743835) //= 0x6002001b. The runtime will prefer the VTID if present
  @VTID(34)
  com4j.itunes.IITWindowCollection windows();


  @VTID(34)
  @ReturnValue(defaultPropertyThrough={com4j.itunes.IITWindowCollection.class})
  com4j.itunes.IITWindow windows(
    int index);

  /**
   * <p>
   * Returns the sound output volume (0 = minimum, 100 = maximum).
   * </p>
   * <p>
   * Getter method for the COM property "SoundVolume"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743836) //= 0x6002001c. The runtime will prefer the VTID if present
  @VTID(35)
  int soundVolume();


  /**
   * <p>
   * Returns the sound output volume (0 = minimum, 100 = maximum).
   * </p>
   * <p>
   * Setter method for the COM property "SoundVolume"
   * </p>
   * @param volume Mandatory int parameter.
   */

  @DISPID(1610743836) //= 0x6002001c. The runtime will prefer the VTID if present
  @VTID(36)
  void soundVolume(
    int volume);


  /**
   * <p>
   * True if sound output is muted.
   * </p>
   * <p>
   * Getter method for the COM property "Mute"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743838) //= 0x6002001e. The runtime will prefer the VTID if present
  @VTID(37)
  boolean mute();


  /**
   * <p>
   * True if sound output is muted.
   * </p>
   * <p>
   * Setter method for the COM property "Mute"
   * </p>
   * @param isMuted Mandatory boolean parameter.
   */

  @DISPID(1610743838) //= 0x6002001e. The runtime will prefer the VTID if present
  @VTID(38)
  void mute(
    boolean isMuted);


  /**
   * <p>
   * Returns the current player state.
   * </p>
   * <p>
   * Getter method for the COM property "PlayerState"
   * </p>
   * @return  Returns a value of type com4j.itunes.ITPlayerState
   */

  @DISPID(1610743840) //= 0x60020020. The runtime will prefer the VTID if present
  @VTID(39)
  com4j.itunes.ITPlayerState playerState();


  /**
   * <p>
   * Returns the player's position within the currently playing track in seconds.
   * </p>
   * <p>
   * Getter method for the COM property "PlayerPosition"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743841) //= 0x60020021. The runtime will prefer the VTID if present
  @VTID(40)
  int playerPosition();


  /**
   * <p>
   * Returns the player's position within the currently playing track in seconds.
   * </p>
   * <p>
   * Setter method for the COM property "PlayerPosition"
   * </p>
   * @param playerPos Mandatory int parameter.
   */

  @DISPID(1610743841) //= 0x60020021. The runtime will prefer the VTID if present
  @VTID(41)
  void playerPosition(
    int playerPos);


  /**
   * <p>
   * Returns the currently selected encoder (AAC, MP3, AIFF, WAV, etc.).
   * </p>
   * <p>
   * Getter method for the COM property "CurrentEncoder"
   * </p>
   * @return  Returns a value of type com4j.itunes.IITEncoder
   */

  @DISPID(1610743843) //= 0x60020023. The runtime will prefer the VTID if present
  @VTID(42)
  com4j.itunes.IITEncoder currentEncoder();


  /**
   * <p>
   * Returns the currently selected encoder (AAC, MP3, AIFF, WAV, etc.).
   * </p>
   * <p>
   * Setter method for the COM property "CurrentEncoder"
   * </p>
   * @param iEncoder Mandatory com4j.itunes.IITEncoder parameter.
   */

  @DISPID(1610743843) //= 0x60020023. The runtime will prefer the VTID if present
  @VTID(43)
  void currentEncoder(
    com4j.itunes.IITEncoder iEncoder);


  /**
   * <p>
   * True if visuals are currently being displayed.
   * </p>
   * <p>
   * Getter method for the COM property "VisualsEnabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743845) //= 0x60020025. The runtime will prefer the VTID if present
  @VTID(44)
  boolean visualsEnabled();


  /**
   * <p>
   * True if visuals are currently being displayed.
   * </p>
   * <p>
   * Setter method for the COM property "VisualsEnabled"
   * </p>
   * @param isEnabled Mandatory boolean parameter.
   */

  @DISPID(1610743845) //= 0x60020025. The runtime will prefer the VTID if present
  @VTID(45)
  void visualsEnabled(
    boolean isEnabled);


  /**
   * <p>
   * True if the visuals are displayed using the entire screen.
   * </p>
   * <p>
   * Getter method for the COM property "FullScreenVisuals"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743847) //= 0x60020027. The runtime will prefer the VTID if present
  @VTID(46)
  boolean fullScreenVisuals();


  /**
   * <p>
   * True if the visuals are displayed using the entire screen.
   * </p>
   * <p>
   * Setter method for the COM property "FullScreenVisuals"
   * </p>
   * @param isFullScreen Mandatory boolean parameter.
   */

  @DISPID(1610743847) //= 0x60020027. The runtime will prefer the VTID if present
  @VTID(47)
  void fullScreenVisuals(
    boolean isFullScreen);


  /**
   * <p>
   * Returns the size of the displayed visual.
   * </p>
   * <p>
   * Getter method for the COM property "VisualSize"
   * </p>
   * @return  Returns a value of type com4j.itunes.ITVisualSize
   */

  @DISPID(1610743849) //= 0x60020029. The runtime will prefer the VTID if present
  @VTID(48)
  com4j.itunes.ITVisualSize visualSize();


  /**
   * <p>
   * Returns the size of the displayed visual.
   * </p>
   * <p>
   * Setter method for the COM property "VisualSize"
   * </p>
   * @param visualSize Mandatory com4j.itunes.ITVisualSize parameter.
   */

  @DISPID(1610743849) //= 0x60020029. The runtime will prefer the VTID if present
  @VTID(49)
  void visualSize(
    com4j.itunes.ITVisualSize visualSize);


  /**
   * <p>
   * Returns the currently selected visual plug-in.
   * </p>
   * <p>
   * Getter method for the COM property "CurrentVisual"
   * </p>
   * @return  Returns a value of type com4j.itunes.IITVisual
   */

  @DISPID(1610743851) //= 0x6002002b. The runtime will prefer the VTID if present
  @VTID(50)
  com4j.itunes.IITVisual currentVisual();


  /**
   * <p>
   * Returns the currently selected visual plug-in.
   * </p>
   * <p>
   * Setter method for the COM property "CurrentVisual"
   * </p>
   * @param iVisual Mandatory com4j.itunes.IITVisual parameter.
   */

  @DISPID(1610743851) //= 0x6002002b. The runtime will prefer the VTID if present
  @VTID(51)
  void currentVisual(
    com4j.itunes.IITVisual iVisual);


  /**
   * <p>
   * True if the equalizer is enabled.
   * </p>
   * <p>
   * Getter method for the COM property "EQEnabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743853) //= 0x6002002d. The runtime will prefer the VTID if present
  @VTID(52)
  boolean eqEnabled();


  /**
   * <p>
   * True if the equalizer is enabled.
   * </p>
   * <p>
   * Setter method for the COM property "EQEnabled"
   * </p>
   * @param isEnabled Mandatory boolean parameter.
   */

  @DISPID(1610743853) //= 0x6002002d. The runtime will prefer the VTID if present
  @VTID(53)
  void eqEnabled(
    boolean isEnabled);


  /**
   * <p>
   * Returns the currently selected EQ preset.
   * </p>
   * <p>
   * Getter method for the COM property "CurrentEQPreset"
   * </p>
   * @return  Returns a value of type com4j.itunes.IITEQPreset
   */

  @DISPID(1610743855) //= 0x6002002f. The runtime will prefer the VTID if present
  @VTID(54)
  com4j.itunes.IITEQPreset currentEQPreset();


  /**
   * <p>
   * Returns the currently selected EQ preset.
   * </p>
   * <p>
   * Setter method for the COM property "CurrentEQPreset"
   * </p>
   * @param iEQPreset Mandatory com4j.itunes.IITEQPreset parameter.
   */

  @DISPID(1610743855) //= 0x6002002f. The runtime will prefer the VTID if present
  @VTID(55)
  void currentEQPreset(
    com4j.itunes.IITEQPreset iEQPreset);


  /**
   * <p>
   * The name of the current song in the playing stream (provided by streaming server).
   * </p>
   * <p>
   * Getter method for the COM property "CurrentStreamTitle"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743857) //= 0x60020031. The runtime will prefer the VTID if present
  @VTID(56)
  java.lang.String currentStreamTitle();


  /**
   * <p>
   * The URL of the playing stream or streaming web site (provided by streaming server).
   * </p>
   * <p>
   * Getter method for the COM property "CurrentStreamURL"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743858) //= 0x60020032. The runtime will prefer the VTID if present
  @VTID(57)
  java.lang.String currentStreamURL();


  /**
   * <p>
   * Returns the main iTunes browser window.
   * </p>
   * <p>
   * Getter method for the COM property "BrowserWindow"
   * </p>
   * @return  Returns a value of type com4j.itunes.IITBrowserWindow
   */

  @DISPID(1610743859) //= 0x60020033. The runtime will prefer the VTID if present
  @VTID(58)
  com4j.itunes.IITBrowserWindow browserWindow();


  /**
   * <p>
   * Returns the EQ window.
   * </p>
   * <p>
   * Getter method for the COM property "EQWindow"
   * </p>
   * @return  Returns a value of type com4j.itunes.IITWindow
   */

  @DISPID(1610743860) //= 0x60020034. The runtime will prefer the VTID if present
  @VTID(59)
  com4j.itunes.IITWindow eqWindow();


  /**
   * <p>
   * Returns the source that represents the main library.
   * </p>
   * <p>
   * Getter method for the COM property "LibrarySource"
   * </p>
   * @return  Returns a value of type com4j.itunes.IITSource
   */

  @DISPID(1610743861) //= 0x60020035. The runtime will prefer the VTID if present
  @VTID(60)
  com4j.itunes.IITSource librarySource();


  /**
   * <p>
   * Returns the main library playlist in the main library source.
   * </p>
   * <p>
   * Getter method for the COM property "LibraryPlaylist"
   * </p>
   * @return  Returns a value of type com4j.itunes.IITLibraryPlaylist
   */

  @DISPID(1610743862) //= 0x60020036. The runtime will prefer the VTID if present
  @VTID(61)
  com4j.itunes.IITLibraryPlaylist libraryPlaylist();


  /**
   * <p>
   * Returns the currently targeted track.
   * </p>
   * <p>
   * Getter method for the COM property "CurrentTrack"
   * </p>
   * @return  Returns a value of type com4j.itunes.IITTrack
   */

  @DISPID(1610743863) //= 0x60020037. The runtime will prefer the VTID if present
  @VTID(62)
  com4j.itunes.IITTrack currentTrack();


  /**
   * <p>
   * Returns the playlist containing the currently targeted track.
   * </p>
   * <p>
   * Getter method for the COM property "CurrentPlaylist"
   * </p>
   * @return  Returns a value of type com4j.itunes.IITPlaylist
   */

  @DISPID(1610743864) //= 0x60020038. The runtime will prefer the VTID if present
  @VTID(63)
  com4j.itunes.IITPlaylist currentPlaylist();


  /**
   * <p>
   * Returns a collection containing the currently selected track or tracks.
   * </p>
   * <p>
   * Getter method for the COM property "SelectedTracks"
   * </p>
   * @return  Returns a value of type com4j.itunes.IITTrackCollection
   */

  @DISPID(1610743865) //= 0x60020039. The runtime will prefer the VTID if present
  @VTID(64)
  com4j.itunes.IITTrackCollection selectedTracks();


  @VTID(64)
  @ReturnValue(defaultPropertyThrough={com4j.itunes.IITTrackCollection.class})
  com4j.itunes.IITTrack selectedTracks(
    int index);

  /**
   * <p>
   * Returns the version of the iTunes application.
   * </p>
   * <p>
   * Getter method for the COM property "Version"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743866) //= 0x6002003a. The runtime will prefer the VTID if present
  @VTID(65)
  java.lang.String version();


  /**
   * @param options Mandatory int parameter.
   */

  @DISPID(1610743867) //= 0x6002003b. The runtime will prefer the VTID if present
  @VTID(66)
  void setOptions(
    int options);


  /**
   * <p>
   * Start converting the specified file path.
   * </p>
   * @param filePath Mandatory java.lang.String parameter.
   * @return  Returns a value of type com4j.itunes.IITConvertOperationStatus
   */

  @DISPID(1610743868) //= 0x6002003c. The runtime will prefer the VTID if present
  @VTID(67)
  com4j.itunes.IITConvertOperationStatus convertFile2(
    java.lang.String filePath);


  /**
   * <p>
   * Start converting the specified array of file paths. filePaths can be of type VT_ARRAY|VT_VARIANT, where each entry is a VT_BSTR, or VT_ARRAY|VT_BSTR.  You can also pass a JScript Array object.
   * </p>
   * @param filePaths Mandatory java.lang.Object parameter.
   * @return  Returns a value of type com4j.itunes.IITConvertOperationStatus
   */

  @DISPID(1610743869) //= 0x6002003d. The runtime will prefer the VTID if present
  @VTID(68)
  com4j.itunes.IITConvertOperationStatus convertFiles2(
    java.lang.Object filePaths);


  /**
   * <p>
   * Start converting the specified track.  iTrackToConvert is a VARIANT of type VT_DISPATCH that points to an IITTrack.
   * </p>
   * @param iTrackToConvert Mandatory java.lang.Object parameter.
   * @return  Returns a value of type com4j.itunes.IITConvertOperationStatus
   */

  @DISPID(1610743870) //= 0x6002003e. The runtime will prefer the VTID if present
  @VTID(69)
  com4j.itunes.IITConvertOperationStatus convertTrack2(
    java.lang.Object iTrackToConvert);


  /**
   * <p>
   * Start converting the specified tracks.  iTracksToConvert is a VARIANT of type VT_DISPATCH that points to an IITTrackCollection.
   * </p>
   * @param iTracksToConvert Mandatory java.lang.Object parameter.
   * @return  Returns a value of type com4j.itunes.IITConvertOperationStatus
   */

  @DISPID(1610743871) //= 0x6002003f. The runtime will prefer the VTID if present
  @VTID(70)
  com4j.itunes.IITConvertOperationStatus convertTracks2(
    java.lang.Object iTracksToConvert);


  /**
   * <p>
   * True if iTunes will process APPCOMMAND Windows messages.
   * </p>
   * <p>
   * Getter method for the COM property "AppCommandMessageProcessingEnabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743872) //= 0x60020040. The runtime will prefer the VTID if present
  @VTID(71)
  boolean appCommandMessageProcessingEnabled();


  /**
   * <p>
   * True if iTunes will process APPCOMMAND Windows messages.
   * </p>
   * <p>
   * Setter method for the COM property "AppCommandMessageProcessingEnabled"
   * </p>
   * @param isEnabled Mandatory boolean parameter.
   */

  @DISPID(1610743872) //= 0x60020040. The runtime will prefer the VTID if present
  @VTID(72)
  void appCommandMessageProcessingEnabled(
    boolean isEnabled);


  /**
   * <p>
   * True if iTunes will force itself to be the foreground application when it displays a dialog.
   * </p>
   * <p>
   * Getter method for the COM property "ForceToForegroundOnDialog"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743874) //= 0x60020042. The runtime will prefer the VTID if present
  @VTID(73)
  boolean forceToForegroundOnDialog();


  /**
   * <p>
   * True if iTunes will force itself to be the foreground application when it displays a dialog.
   * </p>
   * <p>
   * Setter method for the COM property "ForceToForegroundOnDialog"
   * </p>
   * @param forceToForegroundOnDialog Mandatory boolean parameter.
   */

  @DISPID(1610743874) //= 0x60020042. The runtime will prefer the VTID if present
  @VTID(74)
  void forceToForegroundOnDialog(
    boolean forceToForegroundOnDialog);


  /**
   * <p>
   * Create a new EQ preset.
   * </p>
   * @param eqPresetName Mandatory java.lang.String parameter.
   * @return  Returns a value of type com4j.itunes.IITEQPreset
   */

  @DISPID(1610743876) //= 0x60020044. The runtime will prefer the VTID if present
  @VTID(75)
  com4j.itunes.IITEQPreset createEQPreset(
    java.lang.String eqPresetName);


  /**
   * <p>
   * Creates a new playlist in an existing source.
   * </p>
   * @param playlistName Mandatory java.lang.String parameter.
   * @param iSource Mandatory java.lang.Object parameter.
   * @return  Returns a value of type com4j.itunes.IITPlaylist
   */

  @DISPID(1610743877) //= 0x60020045. The runtime will prefer the VTID if present
  @VTID(76)
  com4j.itunes.IITPlaylist createPlaylistInSource(
    java.lang.String playlistName,
    java.lang.Object iSource);


  /**
   * <p>
   * Retrieves the current state of the player buttons.
   * </p>
   * @param previousEnabled Mandatory Holder<Boolean> parameter.
   * @param playPauseStopState Mandatory Holder<com4j.itunes.ITPlayButtonState> parameter.
   * @param nextEnabled Mandatory Holder<Boolean> parameter.
   */

  @DISPID(1610743878) //= 0x60020046. The runtime will prefer the VTID if present
  @VTID(77)
  void getPlayerButtonsState(
    Holder<Boolean> previousEnabled,
    Holder<com4j.itunes.ITPlayButtonState> playPauseStopState,
    Holder<Boolean> nextEnabled);


  /**
   * <p>
   * Simulate click on a player control button.
   * </p>
   * @param playerButton Mandatory com4j.itunes.ITPlayerButton parameter.
   * @param playerButtonModifierKeys Mandatory int parameter.
   */

  @DISPID(1610743879) //= 0x60020047. The runtime will prefer the VTID if present
  @VTID(78)
  void playerButtonClicked(
    com4j.itunes.ITPlayerButton playerButton,
    int playerButtonModifierKeys);


  /**
   * <p>
   * True if the Shuffle property is writable for the specified playlist.
   * </p>
   * <p>
   * Getter method for the COM property "CanSetShuffle"
   * </p>
   * @param iPlaylist Mandatory java.lang.Object parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743880) //= 0x60020048. The runtime will prefer the VTID if present
  @VTID(79)
  boolean canSetShuffle(
    java.lang.Object iPlaylist);


  /**
   * <p>
   * True if the SongRepeat property is writable for the specified playlist.
   * </p>
   * <p>
   * Getter method for the COM property "CanSetSongRepeat"
   * </p>
   * @param iPlaylist Mandatory java.lang.Object parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743881) //= 0x60020049. The runtime will prefer the VTID if present
  @VTID(80)
  boolean canSetSongRepeat(
    java.lang.Object iPlaylist);


  /**
   * <p>
   * Returns an IITConvertOperationStatus object if there is currently a conversion in progress.
   * </p>
   * <p>
   * Getter method for the COM property "ConvertOperationStatus"
   * </p>
   * @return  Returns a value of type com4j.itunes.IITConvertOperationStatus
   */

  @DISPID(1610743882) //= 0x6002004a. The runtime will prefer the VTID if present
  @VTID(81)
  com4j.itunes.IITConvertOperationStatus convertOperationStatus();


  /**
   * <p>
   * Subscribe to the specified podcast feed URL.
   * </p>
   * @param url Mandatory java.lang.String parameter.
   */

  @DISPID(1610743883) //= 0x6002004b. The runtime will prefer the VTID if present
  @VTID(82)
  void subscribeToPodcast(
    java.lang.String url);


  /**
   * <p>
   * Update all podcast feeds.
   * </p>
   */

  @DISPID(1610743884) //= 0x6002004c. The runtime will prefer the VTID if present
  @VTID(83)
  void updatePodcastFeeds();


  /**
   * <p>
   * Creates a new folder in the main library.
   * </p>
   * @param folderName Mandatory java.lang.String parameter.
   * @return  Returns a value of type com4j.itunes.IITPlaylist
   */

  @DISPID(1610743885) //= 0x6002004d. The runtime will prefer the VTID if present
  @VTID(84)
  com4j.itunes.IITPlaylist createFolder(
    java.lang.String folderName);


  /**
   * <p>
   * Creates a new folder in an existing source.
   * </p>
   * @param folderName Mandatory java.lang.String parameter.
   * @param iSource Mandatory java.lang.Object parameter.
   * @return  Returns a value of type com4j.itunes.IITPlaylist
   */

  @DISPID(1610743886) //= 0x6002004e. The runtime will prefer the VTID if present
  @VTID(85)
  com4j.itunes.IITPlaylist createFolderInSource(
    java.lang.String folderName,
    java.lang.Object iSource);


  /**
   * <p>
   * True if the sound volume control is enabled.
   * </p>
   * <p>
   * Getter method for the COM property "SoundVolumeControlEnabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743887) //= 0x6002004f. The runtime will prefer the VTID if present
  @VTID(86)
  boolean soundVolumeControlEnabled();


  /**
   * <p>
   * The full path to the current iTunes library XML file.
   * </p>
   * <p>
   * Getter method for the COM property "LibraryXMLPath"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743888) //= 0x60020050. The runtime will prefer the VTID if present
  @VTID(87)
  java.lang.String libraryXMLPath();


  /**
   * <p>
   * Returns the high 32 bits of the persistent ID of the specified IITObject.
   * </p>
   * <p>
   * Getter method for the COM property "ITObjectPersistentIDHigh"
   * </p>
   * @param iObject Mandatory java.lang.Object parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1610743889) //= 0x60020051. The runtime will prefer the VTID if present
  @VTID(88)
  int itObjectPersistentIDHigh(
    java.lang.Object iObject);


  /**
   * <p>
   * Returns the low 32 bits of the persistent ID of the specified IITObject.
   * </p>
   * <p>
   * Getter method for the COM property "ITObjectPersistentIDLow"
   * </p>
   * @param iObject Mandatory java.lang.Object parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1610743890) //= 0x60020052. The runtime will prefer the VTID if present
  @VTID(89)
  int itObjectPersistentIDLow(
    java.lang.Object iObject);


  /**
   * <p>
   * Returns the high and low 32 bits of the persistent ID of the specified IITObject.
   * </p>
   * @param iObject Mandatory java.lang.Object parameter.
   * @param highID Mandatory Holder<Integer> parameter.
   * @param lowID Mandatory Holder<Integer> parameter.
   */

  @DISPID(1610743891) //= 0x60020053. The runtime will prefer the VTID if present
  @VTID(90)
  void getITObjectPersistentIDs(
    java.lang.Object iObject,
    Holder<Integer> highID,
    Holder<Integer> lowID);


  // Properties:
}
