package com4j.itunes  ;

import com4j.*;

/**
 */
public enum ITPlayerButtonModifierKey implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  ITPlayerButtonModifierKeyNone(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ITPlayerButtonModifierKeyShift(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ITPlayerButtonModifierKeyControl(2),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  ITPlayerButtonModifierKeyAlt(4),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  ITPlayerButtonModifierKeyCapsLock(8),
  ;

  private final int value;
  ITPlayerButtonModifierKey(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
