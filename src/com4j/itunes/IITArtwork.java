package com4j.itunes  ;

import com4j.*;

/**
 * IITArtwork Interface
 */
@IID("{D0A6C1F8-BF3D-4CD8-AC47-FE32BDD17257}")
public interface IITArtwork extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Delete this piece of artwork from the track.
   * </p>
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  void delete();


  /**
   * <p>
   * Replace existing artwork data with new artwork from an image file.
   * </p>
   * @param filePath Mandatory java.lang.String parameter.
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  void setArtworkFromFile(
    java.lang.String filePath);


  /**
   * <p>
   * Save artwork data to an image file.
   * </p>
   * @param filePath Mandatory java.lang.String parameter.
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
  void saveArtworkToFile(
    java.lang.String filePath);


  /**
   * <p>
   * The format of the artwork.
   * </p>
   * <p>
   * Getter method for the COM property "Format"
   * </p>
   * @return  Returns a value of type com4j.itunes.ITArtworkFormat
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(10)
  com4j.itunes.ITArtworkFormat format();


  /**
   * <p>
   * True if the artwork was downloaded by iTunes.
   * </p>
   * <p>
   * Getter method for the COM property "IsDownloadedArtwork"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  boolean isDownloadedArtwork();


  /**
   * <p>
   * The description for the artwork.
   * </p>
   * <p>
   * Getter method for the COM property "Description"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String description();


  /**
   * <p>
   * The description for the artwork.
   * </p>
   * <p>
   * Setter method for the COM property "Description"
   * </p>
   * @param description Mandatory java.lang.String parameter.
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(13)
  void description(
    java.lang.String description);


  // Properties:
}
