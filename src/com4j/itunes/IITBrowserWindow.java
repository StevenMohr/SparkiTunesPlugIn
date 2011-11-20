package com4j.itunes  ;

import com4j.*;

/**
 * IITBrowserWindow Interface
 */
@IID("{C999F455-C4D5-4AA4-8277-F99753699974}")
public interface IITBrowserWindow extends com4j.itunes.IITWindow {
  // Methods:
  /**
   * <p>
   * True if window is in Mini Player mode.
   * </p>
   * <p>
   * Getter method for the COM property "MiniPlayer"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610809344) //= 0x60030000. The runtime will prefer the VTID if present
  @VTID(32)
  boolean miniPlayer();


  /**
   * <p>
   * True if window is in Mini Player mode.
   * </p>
   * <p>
   * Setter method for the COM property "MiniPlayer"
   * </p>
   * @param isMiniPlayer Mandatory boolean parameter.
   */

  @DISPID(1610809344) //= 0x60030000. The runtime will prefer the VTID if present
  @VTID(33)
  void miniPlayer(
    boolean isMiniPlayer);


  /**
   * <p>
   * Returns a collection containing the currently selected track or tracks.
   * </p>
   * <p>
   * Getter method for the COM property "SelectedTracks"
   * </p>
   * @return  Returns a value of type com4j.itunes.IITTrackCollection
   */

  @DISPID(1610809346) //= 0x60030002. The runtime will prefer the VTID if present
  @VTID(34)
  com4j.itunes.IITTrackCollection selectedTracks();


  @VTID(34)
  @ReturnValue(defaultPropertyThrough={com4j.itunes.IITTrackCollection.class})
  com4j.itunes.IITTrack selectedTracks(
    int index);

  /**
   * <p>
   * The currently selected playlist in the Source list.
   * </p>
   * <p>
   * Getter method for the COM property "SelectedPlaylist"
   * </p>
   * @return  Returns a value of type com4j.itunes.IITPlaylist
   */

  @DISPID(1610809347) //= 0x60030003. The runtime will prefer the VTID if present
  @VTID(35)
  com4j.itunes.IITPlaylist selectedPlaylist();


  /**
   * <p>
   * The currently selected playlist in the Source list.
   * </p>
   * <p>
   * Setter method for the COM property "SelectedPlaylist"
   * </p>
   * @param iPlaylist Mandatory java.lang.Object parameter.
   */

  @DISPID(1610809347) //= 0x60030003. The runtime will prefer the VTID if present
  @VTID(36)
  void selectedPlaylist(
    java.lang.Object iPlaylist);


  // Properties:
}
