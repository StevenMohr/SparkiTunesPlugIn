package com4j.itunes  ;

import com4j.*;

/**
 * IITConvertOperationStatus Interface
 */
@IID("{7063AAF6-ABA0-493B-B4FC-920A9F105875}")
public interface IITConvertOperationStatus extends com4j.itunes.IITOperationStatus {
  // Methods:
  /**
   * <p>
   * Returns the current conversion status.
   * </p>
   * @param trackName Mandatory Holder<java.lang.String> parameter.
   * @param progressValue Mandatory Holder<Integer> parameter.
   * @param maxProgressValue Mandatory Holder<Integer> parameter.
   */

  @DISPID(1610809344) //= 0x60030000. The runtime will prefer the VTID if present
  @VTID(9)
  void getConversionStatus(
    Holder<java.lang.String> trackName,
    Holder<Integer> progressValue,
    Holder<Integer> maxProgressValue);


  /**
   * <p>
   * Stops the current conversion operation.
   * </p>
   */

  @DISPID(1610809345) //= 0x60030001. The runtime will prefer the VTID if present
  @VTID(10)
  void stopConversion();


  /**
   * <p>
   * Returns the name of the track currently being converted.
   * </p>
   * <p>
   * Getter method for the COM property "trackName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610809346) //= 0x60030002. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String trackName();


  /**
   * <p>
   * Returns the current progress value for the track being converted.
   * </p>
   * <p>
   * Getter method for the COM property "progressValue"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610809347) //= 0x60030003. The runtime will prefer the VTID if present
  @VTID(12)
  int progressValue();


  /**
   * <p>
   * Returns the maximum progress value for the track being converted.
   * </p>
   * <p>
   * Getter method for the COM property "maxProgressValue"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610809348) //= 0x60030004. The runtime will prefer the VTID if present
  @VTID(13)
  int maxProgressValue();


  // Properties:
}
