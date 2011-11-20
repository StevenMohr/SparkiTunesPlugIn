package com4j.itunes  ;

import com4j.*;

/**
 * IITEncoderCollection Interface
 */
@IID("{8862BCA9-168D-4549-A9D5-ADB35E553BA6}")
public interface IITEncoderCollection extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Returns the number of encoders in the collection.
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
   * Returns an IITEncoder object corresponding to the given index (1-based).
   * </p>
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type com4j.itunes.IITEncoder
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(8)
  @DefaultMethod
  com4j.itunes.IITEncoder item(
    int index);


  /**
   * <p>
   * Returns an IITEncoder object with the specified name.
   * </p>
   * <p>
   * Getter method for the COM property "ItemByName"
   * </p>
   * @param name Mandatory java.lang.String parameter.
   * @return  Returns a value of type com4j.itunes.IITEncoder
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
  com4j.itunes.IITEncoder itemByName(
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
  @VTID(10)
  java.util.Iterator<Com4jObject> iterator();

  // Properties:
}
