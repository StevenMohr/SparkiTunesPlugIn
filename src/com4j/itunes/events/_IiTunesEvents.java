package com4j.itunes.events;

import com4j.*;

/**
 * _IiTunesEvents Interface
 */
@IID("{5846EB78-317E-4B6F-B0C3-11EE8C8FEEF2}")
public abstract class _IiTunesEvents {
  // Methods:
  /**
   * <p>
   * Fired when a database change occurs.
   * </p>
   * @param deletedObjectIDs Mandatory java.lang.Object parameter.
   * @param changedObjectIDs Mandatory java.lang.Object parameter.
   */

  @DISPID(1)
  public void onDatabaseChangedEvent(
    java.lang.Object deletedObjectIDs,
    java.lang.Object changedObjectIDs) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Fired when a track has started playing.
   * </p>
   * @param iTrack Mandatory java.lang.Object parameter.
   */

  @DISPID(2)
  public void onPlayerPlayEvent(
    java.lang.Object iTrack) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Fired when a track has stopped playing.
   * </p>
   * @param iTrack Mandatory java.lang.Object parameter.
   */

  @DISPID(3)
  public void onPlayerStopEvent(
    java.lang.Object iTrack) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Fired when information about the currently playing track has changed.
   * </p>
   * @param iTrack Mandatory java.lang.Object parameter.
   */

  @DISPID(4)
  public void onPlayerPlayingTrackChangedEvent(
    java.lang.Object iTrack) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Fired when the iTunes user interface is no longer disabled.
   * </p>
   */

  @DISPID(5)
  public void onUserInterfaceEnabledEvent() {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Fired when calls to the iTunes COM interface will be deferred.
   * </p>
   * @param reason Mandatory com4j.itunes.ITCOMDisabledReason parameter.
   */

  @DISPID(6)
  public void onCOMCallsDisabledEvent(
    com4j.itunes.ITCOMDisabledReason reason) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Fired when calls to the iTunes COM interface will no longer be deferred.
   * </p>
   */

  @DISPID(7)
  public void onCOMCallsEnabledEvent() {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Fired when iTunes is about to quit.
   * </p>
   */

  @DISPID(8)
  public void onQuittingEvent() {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Fired when iTunes is about to prompt the user to quit.
   * </p>
   */

  @DISPID(9)
  public void onAboutToPromptUserToQuitEvent() {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Fired when the sound output volume has changed.
   * </p>
   * @param newVolume Mandatory int parameter.
   */

  @DISPID(10)
  public void onSoundVolumeChangedEvent(
    int newVolume) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}
