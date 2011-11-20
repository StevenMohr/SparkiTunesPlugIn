package com4j.itunes  ;

import com4j.*;

/**
 * IITUserPlaylist Interface
 */
@IID("{0A504DED-A0B5-465A-8A94-50E20D7DF692}")
public interface IITUserPlaylist extends com4j.itunes.IITPlaylist {
  // Methods:
  /**
   * <p>
   * Add the specified file path to the user playlist.
   * </p>
   * @param filePath Mandatory java.lang.String parameter.
   * @return  Returns a value of type com4j.itunes.IITOperationStatus
   */

  @DISPID(1610874880) //= 0x60040000. The runtime will prefer the VTID if present
  @VTID(30)
  com4j.itunes.IITOperationStatus addFile(
    java.lang.String filePath);


  /**
   * <p>
   * Add the specified array of file paths to the user playlist. filePaths can be of type VT_ARRAY|VT_VARIANT, where each entry is a VT_BSTR, or VT_ARRAY|VT_BSTR.  You can also pass a JScript Array object.
   * </p>
   * @param filePaths Mandatory java.lang.Object parameter.
   * @return  Returns a value of type com4j.itunes.IITOperationStatus
   */

  @DISPID(1610874881) //= 0x60040001. The runtime will prefer the VTID if present
  @VTID(31)
  com4j.itunes.IITOperationStatus addFiles(
    java.lang.Object filePaths);


  /**
   * <p>
   * Add the specified streaming audio URL to the user playlist.
   * </p>
   * @param url Mandatory java.lang.String parameter.
   * @return  Returns a value of type com4j.itunes.IITURLTrack
   */

  @DISPID(1610874882) //= 0x60040002. The runtime will prefer the VTID if present
  @VTID(32)
  com4j.itunes.IITURLTrack addURL(
    java.lang.String url);


  /**
   * <p>
   * Add the specified track to the user playlist.  iTrackToAdd is a VARIANT of type VT_DISPATCH that points to an IITTrack.
   * </p>
   * @param iTrackToAdd Mandatory java.lang.Object parameter.
   * @return  Returns a value of type com4j.itunes.IITTrack
   */

  @DISPID(1610874883) //= 0x60040003. The runtime will prefer the VTID if present
  @VTID(33)
  com4j.itunes.IITTrack addTrack(
    java.lang.Object iTrackToAdd);


  /**
   * <p>
   * True if the user playlist is being shared.
   * </p>
   * <p>
   * Getter method for the COM property "Shared"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610874884) //= 0x60040004. The runtime will prefer the VTID if present
  @VTID(34)
  boolean shared();


  /**
   * <p>
   * True if the user playlist is being shared.
   * </p>
   * <p>
   * Setter method for the COM property "Shared"
   * </p>
   * @param isShared Mandatory boolean parameter.
   */

  @DISPID(1610874884) //= 0x60040004. The runtime will prefer the VTID if present
  @VTID(35)
  void shared(
    boolean isShared);


  /**
   * <p>
   * True if this is a smart playlist.
   * </p>
   * <p>
   * Getter method for the COM property "Smart"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610874886) //= 0x60040006. The runtime will prefer the VTID if present
  @VTID(36)
  boolean smart();


  /**
   * <p>
   * The playlist special kind.
   * </p>
   * <p>
   * Getter method for the COM property "SpecialKind"
   * </p>
   * @return  Returns a value of type com4j.itunes.ITUserPlaylistSpecialKind
   */

  @DISPID(1610874887) //= 0x60040007. The runtime will prefer the VTID if present
  @VTID(37)
  com4j.itunes.ITUserPlaylistSpecialKind specialKind();


  /**
   * <p>
   * The parent of this playlist.
   * </p>
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.itunes.IITUserPlaylist
   */

  @DISPID(1610874888) //= 0x60040008. The runtime will prefer the VTID if present
  @VTID(38)
  com4j.itunes.IITUserPlaylist parent();


  /**
   * <p>
   * Creates a new playlist in a folder playlist.
   * </p>
   * @param playlistName Mandatory java.lang.String parameter.
   * @return  Returns a value of type com4j.itunes.IITPlaylist
   */

  @DISPID(1610874889) //= 0x60040009. The runtime will prefer the VTID if present
  @VTID(39)
  com4j.itunes.IITPlaylist createPlaylist(
    java.lang.String playlistName);


  /**
   * <p>
   * Creates a new folder in a folder playlist.
   * </p>
   * @param folderName Mandatory java.lang.String parameter.
   * @return  Returns a value of type com4j.itunes.IITPlaylist
   */

  @DISPID(1610874890) //= 0x6004000a. The runtime will prefer the VTID if present
  @VTID(40)
  com4j.itunes.IITPlaylist createFolder(
    java.lang.String folderName);


  /**
   * <p>
   * The parent of this playlist.
   * </p>
   * <p>
   * Setter method for the COM property "Parent"
   * </p>
   * @param iParentPlayList Mandatory java.lang.Object parameter.
   */

  @DISPID(1610874888) //= 0x60040008. The runtime will prefer the VTID if present
  @VTID(41)
  void parent(
    java.lang.Object iParentPlayList);


  /**
   * <p>
   * Reveal the user playlist in the main browser window.
   * </p>
   */

  @DISPID(1610874892) //= 0x6004000c. The runtime will prefer the VTID if present
  @VTID(42)
  void reveal();


  // Properties:
}
