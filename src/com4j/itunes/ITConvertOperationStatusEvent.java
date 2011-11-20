package com4j.itunes  ;

import com4j.*;

/**
 */
public enum ITConvertOperationStatusEvent implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ITConvertOperationStatusChanged(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ITConvertOperationComplete(2),
  ;

  private final int value;
  ITConvertOperationStatusEvent(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
