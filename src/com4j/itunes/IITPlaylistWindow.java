package com4j.itunes  ;

import com4j.*;

/**
 * IITPlaylistWindow Interface
 */
@IID("{349CBB45-2E5A-4822-8E4A-A75555A186F7}")
public interface IITPlaylistWindow extends com4j.itunes.IITWindow {
  // Methods:
  /**
   * <p>
   * Returns a collection containing the currently selected track or tracks.
   * </p>
   * <p>
   * Getter method for the COM property "SelectedTracks"
   * </p>
   * @return  Returns a value of type com4j.itunes.IITTrackCollection
   */

  @DISPID(1610809344) //= 0x60030000. The runtime will prefer the VTID if present
  @VTID(32)
  com4j.itunes.IITTrackCollection selectedTracks();


  @VTID(32)
  @ReturnValue(defaultPropertyThrough={com4j.itunes.IITTrackCollection.class})
  com4j.itunes.IITTrack selectedTracks(
    int index);

  /**
   * <p>
   * The playlist displayed in the window.
   * </p>
   * <p>
   * Getter method for the COM property "Playlist"
   * </p>
   * @return  Returns a value of type com4j.itunes.IITPlaylist
   */

  @DISPID(1610809345) //= 0x60030001. The runtime will prefer the VTID if present
  @VTID(33)
  com4j.itunes.IITPlaylist playlist();


  // Properties:
}
