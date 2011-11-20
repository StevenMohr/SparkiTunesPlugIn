package com4j.itunes.events;

import com4j.*;

/**
 * _IITConvertOperationStatusEvents Interface
 */
@IID("{5C47A705-8E8A-45A1-9EED-71C993F0BF60}")
public abstract class _IITConvertOperationStatusEvents {
  // Methods:
  /**
   * <p>
   * Fired when status about the conversion operation has changed.
   * </p>
   * @param trackName Mandatory java.lang.String parameter.
   * @param progressValue Mandatory int parameter.
   * @param maxProgressValue Mandatory int parameter.
   */

  @DISPID(1)
  public void onConvertOperationStatusChangedEvent(
    java.lang.String trackName,
    int progressValue,
    int maxProgressValue) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Fired when the conversion operation has completed.
   * </p>
   */

  @DISPID(2)
  public void onConvertOperationCompleteEvent() {
        throw new UnsupportedOperationException();
  }


  // Properties:
}
