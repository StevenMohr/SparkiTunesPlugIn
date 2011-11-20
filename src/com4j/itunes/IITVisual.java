package com4j.itunes  ;

import com4j.*;

/**
 * IITVisual Interface
 */
@IID("{340F3315-ED72-4C09-9ACF-21EB4BDF9931}")
public interface IITVisual extends Com4jObject {
  // Methods:
  /**
   * <p>
   * The name of the the visual plug-in.
   * </p>
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String name();


  // Properties:
}
