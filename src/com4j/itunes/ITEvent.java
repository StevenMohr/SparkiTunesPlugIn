package com4j.itunes  ;

import com4j.*;

/**
 */
public enum ITEvent implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ITEventDatabaseChanged(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ITEventPlayerPlay(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  ITEventPlayerStop(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  ITEventPlayerPlayingTrackChanged(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  ITEventUserInterfaceEnabled(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  ITEventCOMCallsDisabled(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  ITEventCOMCallsEnabled(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  ITEventQuitting(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  ITEventAboutToPromptUserToQuit(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  ITEventSoundVolumeChanged(10),
  ;

  private final int value;
  ITEvent(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
