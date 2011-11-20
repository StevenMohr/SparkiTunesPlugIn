package com4j.itunes  ;

import com4j.*;

/**
 * IITIPodSource Interface
 */
@IID("{CF4D8ACE-1720-4FB9-B0AE-9877249E89B0}")
public interface IITIPodSource extends com4j.itunes.IITSource {
  // Methods:
  /**
   * <p>
   * Update the contents of the iPod.
   * </p>
   */

  @DISPID(1610874880) //= 0x60040000. The runtime will prefer the VTID if present
  @VTID(19)
  void updateIPod();


  /**
   * <p>
   * Eject the iPod.
   * </p>
   */

  @DISPID(1610874881) //= 0x60040001. The runtime will prefer the VTID if present
  @VTID(20)
  void ejectIPod();


  /**
   * <p>
   * The iPod software version.
   * </p>
   * <p>
   * Getter method for the COM property "SoftwareVersion"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610874882) //= 0x60040002. The runtime will prefer the VTID if present
  @VTID(21)
  java.lang.String softwareVersion();


  // Properties:
}
