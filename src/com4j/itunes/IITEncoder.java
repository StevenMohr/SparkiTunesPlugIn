package com4j.itunes  ;

import com4j.*;

/**
 * IITEncoder Interface
 */
@IID("{1CF95A1C-55FE-4F45-A2D3-85AC6C504A73}")
public interface IITEncoder extends Com4jObject {
  // Methods:
  /**
   * <p>
   * The name of the the encoder.
   * </p>
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String name();


  /**
   * <p>
   * The data format created by the encoder.
   * </p>
   * <p>
   * Getter method for the COM property "Format"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String format();


  // Properties:
}
