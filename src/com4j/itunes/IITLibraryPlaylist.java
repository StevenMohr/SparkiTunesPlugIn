package com4j.itunes  ;

import com4j.*;

/**
 * IITLibraryPlaylist Interface
 */
@IID("{53AE1704-491C-4289-94A0-958815675A3D}")
public interface IITLibraryPlaylist extends com4j.itunes.IITPlaylist {
  // Methods:
  /**
   * <p>
   * Add the specified file path to the library.
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
   * Add the specified array of file paths to the library. filePaths can be of type VT_ARRAY|VT_VARIANT, where each entry is a VT_BSTR, or VT_ARRAY|VT_BSTR.  You can also pass a JScript Array object.
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
   * Add the specified streaming audio URL to the library.
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
   * Add the specified track to the library.  iTrackToAdd is a VARIANT of type VT_DISPATCH that points to an IITTrack.
   * </p>
   * @param iTrackToAdd Mandatory java.lang.Object parameter.
   * @return  Returns a value of type com4j.itunes.IITTrack
   */

  @DISPID(1610874883) //= 0x60040003. The runtime will prefer the VTID if present
  @VTID(33)
  com4j.itunes.IITTrack addTrack(
    java.lang.Object iTrackToAdd);


  // Properties:
}
