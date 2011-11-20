package com4j.itunes  ;

import com4j.*;

/**
 * IITAudioCDPlaylist Interface
 */
@IID("{CF496DF3-0FED-4D7D-9BD8-529B6E8A082E}")
public interface IITAudioCDPlaylist extends com4j.itunes.IITPlaylist {
  // Methods:
  /**
   * <p>
   * The artist of the CD.
   * </p>
   * <p>
   * Getter method for the COM property "Artist"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610874880) //= 0x60040000. The runtime will prefer the VTID if present
  @VTID(30)
  java.lang.String artist();


  /**
   * <p>
   * True if this CD is a compilation album.
   * </p>
   * <p>
   * Getter method for the COM property "Compilation"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610874881) //= 0x60040001. The runtime will prefer the VTID if present
  @VTID(31)
  boolean compilation();


  /**
   * <p>
   * The composer of the CD.
   * </p>
   * <p>
   * Getter method for the COM property "Composer"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610874882) //= 0x60040002. The runtime will prefer the VTID if present
  @VTID(32)
  java.lang.String composer();


  /**
   * <p>
   * The total number of discs in this CD's album.
   * </p>
   * <p>
   * Getter method for the COM property "DiscCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610874883) //= 0x60040003. The runtime will prefer the VTID if present
  @VTID(33)
  int discCount();


  /**
   * <p>
   * The index of the CD disc in the source album.
   * </p>
   * <p>
   * Getter method for the COM property "DiscNumber"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610874884) //= 0x60040004. The runtime will prefer the VTID if present
  @VTID(34)
  int discNumber();


  /**
   * <p>
   * The genre of the CD.
   * </p>
   * <p>
   * Getter method for the COM property "Genre"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610874885) //= 0x60040005. The runtime will prefer the VTID if present
  @VTID(35)
  java.lang.String genre();


  /**
   * <p>
   * The year the album was recorded/released.
   * </p>
   * <p>
   * Getter method for the COM property "Year"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610874886) //= 0x60040006. The runtime will prefer the VTID if present
  @VTID(36)
  int year();


  /**
   * <p>
   * Reveal the CD playlist in the main browser window.
   * </p>
   */

  @DISPID(1610874887) //= 0x60040007. The runtime will prefer the VTID if present
  @VTID(37)
  void reveal();


  // Properties:
}
