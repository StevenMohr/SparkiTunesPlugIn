package com4j.itunes  ;

import com4j.*;

/**
 * IITPlaylist Interface
 */
@IID("{3D5E072F-2A77-4B17-9E73-E03B77CCCCA9}")
public interface IITPlaylist extends com4j.itunes.IITObject {
  // Methods:
  /**
   * <p>
   * Delete this playlist.
   * </p>
   */

  @DISPID(1610809344) //= 0x60030000. The runtime will prefer the VTID if present
  @VTID(15)
  void delete();


  /**
   * <p>
   * Start playing the first track in this playlist.
   * </p>
   */

  @DISPID(1610809345) //= 0x60030001. The runtime will prefer the VTID if present
  @VTID(16)
  void playFirstTrack();


  /**
   * <p>
   * Print this playlist.
   * </p>
   * @param showPrintDialog Mandatory boolean parameter.
   * @param printKind Mandatory com4j.itunes.ITPlaylistPrintKind parameter.
   * @param theme Mandatory java.lang.String parameter.
   */

  @DISPID(1610809346) //= 0x60030002. The runtime will prefer the VTID if present
  @VTID(17)
  void print(
    boolean showPrintDialog,
    com4j.itunes.ITPlaylistPrintKind printKind,
    java.lang.String theme);


  /**
   * <p>
   * Search tracks in this playlist for the specified string.
   * </p>
   * @param searchText Mandatory java.lang.String parameter.
   * @param searchFields Mandatory com4j.itunes.ITPlaylistSearchField parameter.
   * @return  Returns a value of type com4j.itunes.IITTrackCollection
   */

  @DISPID(1610809347) //= 0x60030003. The runtime will prefer the VTID if present
  @VTID(18)
  com4j.itunes.IITTrackCollection search(
    java.lang.String searchText,
    com4j.itunes.ITPlaylistSearchField searchFields);


  /**
   * <p>
   * The playlist kind.
   * </p>
   * <p>
   * Getter method for the COM property "Kind"
   * </p>
   * @return  Returns a value of type com4j.itunes.ITPlaylistKind
   */

  @DISPID(1610809348) //= 0x60030004. The runtime will prefer the VTID if present
  @VTID(19)
  com4j.itunes.ITPlaylistKind kind();


  /**
   * <p>
   * The source that contains this playlist.
   * </p>
   * <p>
   * Getter method for the COM property "Source"
   * </p>
   * @return  Returns a value of type com4j.itunes.IITSource
   */

  @DISPID(1610809349) //= 0x60030005. The runtime will prefer the VTID if present
  @VTID(20)
  com4j.itunes.IITSource source();


  /**
   * <p>
   * The total length of all songs in the playlist (in seconds).
   * </p>
   * <p>
   * Getter method for the COM property "Duration"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610809350) //= 0x60030006. The runtime will prefer the VTID if present
  @VTID(21)
  int duration();


  /**
   * <p>
   * True if songs in the playlist are played in random order.
   * </p>
   * <p>
   * Getter method for the COM property "Shuffle"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610809351) //= 0x60030007. The runtime will prefer the VTID if present
  @VTID(22)
  boolean shuffle();


  /**
   * <p>
   * True if songs in the playlist are played in random order.
   * </p>
   * <p>
   * Setter method for the COM property "Shuffle"
   * </p>
   * @param isShuffle Mandatory boolean parameter.
   */

  @DISPID(1610809351) //= 0x60030007. The runtime will prefer the VTID if present
  @VTID(23)
  void shuffle(
    boolean isShuffle);


  /**
   * <p>
   * The total size of all songs in the playlist (in bytes).
   * </p>
   * <p>
   * Getter method for the COM property "Size"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1610809353) //= 0x60030009. The runtime will prefer the VTID if present
  @VTID(24)
  double size();


  /**
   * <p>
   * The playback repeat mode.
   * </p>
   * <p>
   * Getter method for the COM property "SongRepeat"
   * </p>
   * @return  Returns a value of type com4j.itunes.ITPlaylistRepeatMode
   */

  @DISPID(1610809354) //= 0x6003000a. The runtime will prefer the VTID if present
  @VTID(25)
  com4j.itunes.ITPlaylistRepeatMode songRepeat();


  /**
   * <p>
   * The playback repeat mode.
   * </p>
   * <p>
   * Setter method for the COM property "SongRepeat"
   * </p>
   * @param repeatMode Mandatory com4j.itunes.ITPlaylistRepeatMode parameter.
   */

  @DISPID(1610809354) //= 0x6003000a. The runtime will prefer the VTID if present
  @VTID(26)
  void songRepeat(
    com4j.itunes.ITPlaylistRepeatMode repeatMode);


  /**
   * <p>
   * The total length of all songs in the playlist (in MM:SS format).
   * </p>
   * <p>
   * Getter method for the COM property "Time"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610809356) //= 0x6003000c. The runtime will prefer the VTID if present
  @VTID(27)
  java.lang.String time();


  /**
   * <p>
   * True if the playlist is visible in the Source list.
   * </p>
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610809357) //= 0x6003000d. The runtime will prefer the VTID if present
  @VTID(28)
  boolean visible();


  /**
   * <p>
   * Returns a collection of tracks in this playlist.
   * </p>
   * <p>
   * Getter method for the COM property "Tracks"
   * </p>
   * @return  Returns a value of type com4j.itunes.IITTrackCollection
   */

  @DISPID(1610809358) //= 0x6003000e. The runtime will prefer the VTID if present
  @VTID(29)
  com4j.itunes.IITTrackCollection tracks();


  @VTID(29)
  @ReturnValue(defaultPropertyThrough={com4j.itunes.IITTrackCollection.class})
  com4j.itunes.IITTrack tracks(
    int index);

  // Properties:
}
