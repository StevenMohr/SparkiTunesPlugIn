package com4j.itunes  ;

import com4j.*;

/**
 * IITURLTrack Interface
 */
@IID("{1116E3B5-29FD-4393-A7BD-454E5E327900}")
public interface IITURLTrack extends com4j.itunes.IITTrack {
  // Methods:
  /**
   * <p>
   * The URL of the stream represented by this track.
   * </p>
   * <p>
   * Getter method for the COM property "URL"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610874880) //= 0x60040000. The runtime will prefer the VTID if present
  @VTID(72)
  java.lang.String url();


  /**
   * <p>
   * The URL of the stream represented by this track.
   * </p>
   * <p>
   * Setter method for the COM property "URL"
   * </p>
   * @param url Mandatory java.lang.String parameter.
   */

  @DISPID(1610874880) //= 0x60040000. The runtime will prefer the VTID if present
  @VTID(73)
  void url(
    java.lang.String url);


  /**
   * <p>
   * True if this is a podcast track.
   * </p>
   * <p>
   * Getter method for the COM property "Podcast"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610874882) //= 0x60040002. The runtime will prefer the VTID if present
  @VTID(74)
  boolean podcast();


  /**
   * <p>
   * Update the podcast feed for this track.
   * </p>
   */

  @DISPID(1610874883) //= 0x60040003. The runtime will prefer the VTID if present
  @VTID(75)
  void updatePodcastFeed();


  /**
   * <p>
   * Start downloading the podcast episode that corresponds to this track.
   * </p>
   */

  @DISPID(1610874884) //= 0x60040004. The runtime will prefer the VTID if present
  @VTID(76)
  void downloadPodcastEpisode();


  /**
   * <p>
   * Category for the track.
   * </p>
   * <p>
   * Getter method for the COM property "Category"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610874885) //= 0x60040005. The runtime will prefer the VTID if present
  @VTID(77)
  java.lang.String category();


  /**
   * <p>
   * Category for the track.
   * </p>
   * <p>
   * Setter method for the COM property "Category"
   * </p>
   * @param category Mandatory java.lang.String parameter.
   */

  @DISPID(1610874885) //= 0x60040005. The runtime will prefer the VTID if present
  @VTID(78)
  void category(
    java.lang.String category);


  /**
   * <p>
   * Description for the track.
   * </p>
   * <p>
   * Getter method for the COM property "Description"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610874887) //= 0x60040007. The runtime will prefer the VTID if present
  @VTID(79)
  java.lang.String description();


  /**
   * <p>
   * Description for the track.
   * </p>
   * <p>
   * Setter method for the COM property "Description"
   * </p>
   * @param description Mandatory java.lang.String parameter.
   */

  @DISPID(1610874887) //= 0x60040007. The runtime will prefer the VTID if present
  @VTID(80)
  void description(
    java.lang.String description);


  /**
   * <p>
   * Long description for the track.
   * </p>
   * <p>
   * Getter method for the COM property "LongDescription"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610874889) //= 0x60040009. The runtime will prefer the VTID if present
  @VTID(81)
  java.lang.String longDescription();


  /**
   * <p>
   * Long description for the track.
   * </p>
   * <p>
   * Setter method for the COM property "LongDescription"
   * </p>
   * @param longDescription Mandatory java.lang.String parameter.
   */

  @DISPID(1610874889) //= 0x60040009. The runtime will prefer the VTID if present
  @VTID(82)
  void longDescription(
    java.lang.String longDescription);


  /**
   * <p>
   * Reveal the track in the main browser window.
   * </p>
   */

  @DISPID(1610874891) //= 0x6004000b. The runtime will prefer the VTID if present
  @VTID(83)
  void reveal();


  /**
   * <p>
   * The user or computed rating of the album that this track belongs to (0 to 100).
   * </p>
   * <p>
   * Getter method for the COM property "AlbumRating"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610874892) //= 0x6004000c. The runtime will prefer the VTID if present
  @VTID(84)
  int albumRating();


  /**
   * <p>
   * The user or computed rating of the album that this track belongs to (0 to 100).
   * </p>
   * <p>
   * Setter method for the COM property "AlbumRating"
   * </p>
   * @param rating Mandatory int parameter.
   */

  @DISPID(1610874892) //= 0x6004000c. The runtime will prefer the VTID if present
  @VTID(85)
  void albumRating(
    int rating);


  /**
   * <p>
   * The album rating kind.
   * </p>
   * <p>
   * Getter method for the COM property "AlbumRatingKind"
   * </p>
   * @return  Returns a value of type com4j.itunes.ITRatingKind
   */

  @DISPID(1610874894) //= 0x6004000e. The runtime will prefer the VTID if present
  @VTID(86)
  com4j.itunes.ITRatingKind albumRatingKind();


  /**
   * <p>
   * The track rating kind.
   * </p>
   * <p>
   * Getter method for the COM property "ratingKind"
   * </p>
   * @return  Returns a value of type com4j.itunes.ITRatingKind
   */

  @DISPID(1610874895) //= 0x6004000f. The runtime will prefer the VTID if present
  @VTID(87)
  com4j.itunes.ITRatingKind ratingKind();


  /**
   * <p>
   * Returns a collection of playlists that contain the song that this track represents.
   * </p>
   * <p>
   * Getter method for the COM property "Playlists"
   * </p>
   * @return  Returns a value of type com4j.itunes.IITPlaylistCollection
   */

  @DISPID(1610874896) //= 0x60040010. The runtime will prefer the VTID if present
  @VTID(88)
  com4j.itunes.IITPlaylistCollection playlists();


  @VTID(88)
  @ReturnValue(defaultPropertyThrough={com4j.itunes.IITPlaylistCollection.class})
  com4j.itunes.IITPlaylist playlists(
    int index);

  // Properties:
}
