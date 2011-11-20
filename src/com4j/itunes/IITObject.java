package com4j.itunes  ;

import com4j.*;

/**
 * IITObject Interface
 */
@IID("{9FAB0E27-70D7-4E3A-9965-B0C8B8869BB6}")
public interface IITObject extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Returns the four IDs that uniquely identify this object.
   * </p>
   * @param sourceID Mandatory Holder<Integer> parameter.
   * @param playlistID Mandatory Holder<Integer> parameter.
   * @param trackID Mandatory Holder<Integer> parameter.
   * @param databaseID Mandatory Holder<Integer> parameter.
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  void getITObjectIDs(
    Holder<Integer> sourceID,
    Holder<Integer> playlistID,
    Holder<Integer> trackID,
    Holder<Integer> databaseID);


  /**
   * <p>
   * The name of the object.
   * </p>
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String name();


  /**
   * <p>
   * The name of the object.
   * </p>
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(9)
  void name(
    java.lang.String name);


  /**
   * <p>
   * The index of the object in internal application order (1-based).
   * </p>
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(10)
  int index();


  /**
   * <p>
   * The source ID of the object.
   * </p>
   * <p>
   * Getter method for the COM property "sourceID"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  int sourceID();


  /**
   * <p>
   * The playlist ID of the object.
   * </p>
   * <p>
   * Getter method for the COM property "playlistID"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(12)
  int playlistID();


  /**
   * <p>
   * The track ID of the object.
   * </p>
   * <p>
   * Getter method for the COM property "trackID"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(13)
  int trackID();


  /**
   * <p>
   * The track database ID of the object.
   * </p>
   * <p>
   * Getter method for the COM property "TrackDatabaseID"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743815) //= 0x60020007. The runtime will prefer the VTID if present
  @VTID(14)
  int trackDatabaseID();


  // Properties:
}
