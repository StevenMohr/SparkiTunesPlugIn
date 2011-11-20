package com4j.itunes  ;

import com4j.*;

/**
 * IITTrackCollection Interface
 */
@IID("{755D76F1-6B85-4CE4-8F5F-F88D9743DCD8}")
public interface IITTrackCollection extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Returns the number of tracks in the collection.
   * </p>
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  int count();


  /**
   * <p>
   * Returns an IITTrack object corresponding to the given fixed index, where the index is independent of the play order (1-based).
   * </p>
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type com4j.itunes.IITTrack
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(8)
  @DefaultMethod
  com4j.itunes.IITTrack item(
    int index);


  /**
   * <p>
   * Returns an IITTrack object corresponding to the given index, where the index is defined by the play order of the playlist containing the track collection (1-based).
   * </p>
   * <p>
   * Getter method for the COM property "ItemByPlayOrder"
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type com4j.itunes.IITTrack
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
  com4j.itunes.IITTrack itemByPlayOrder(
    int index);


  /**
   * <p>
   * Returns an IITTrack object with the specified name.
   * </p>
   * <p>
   * Getter method for the COM property "ItemByName"
   * </p>
   * @param name Mandatory java.lang.String parameter.
   * @return  Returns a value of type com4j.itunes.IITTrack
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(10)
  com4j.itunes.IITTrack itemByName(
    java.lang.String name);


  /**
   * <p>
   * Returns an IEnumVARIANT object which can enumerate the collection.
   * </p>
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(11)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Returns an IITTrack object with the specified persistent ID.
   * </p>
   * <p>
   * Getter method for the COM property "ItemByPersistentID"
   * </p>
   * @param highID Mandatory int parameter.
   * @param lowID Mandatory int parameter.
   * @return  Returns a value of type com4j.itunes.IITTrack
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(12)
  com4j.itunes.IITTrack itemByPersistentID(
    int highID,
    int lowID);


  // Properties:
}
