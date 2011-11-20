package com4j.itunes  ;

import com4j.*;

/**
 * IITFileOrCDTrack Interface
 */
@IID("{00D7FE99-7868-4CC7-AD9E-ACFD70D09566}")
public interface IITFileOrCDTrack extends com4j.itunes.IITTrack {
  // Methods:
  /**
   * <p>
   * The full path to the file represented by this track.
   * </p>
   * <p>
   * Getter method for the COM property "Location"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610874880) //= 0x60040000. The runtime will prefer the VTID if present
  @VTID(72)
  java.lang.String location();


  /**
   * <p>
   * Update this track's information with the information stored in its file.
   * </p>
   */

  @DISPID(1610874881) //= 0x60040001. The runtime will prefer the VTID if present
  @VTID(73)
  void updateInfoFromFile();


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
   * True if playback position is remembered.
   * </p>
   * <p>
   * Getter method for the COM property "RememberBookmark"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610874884) //= 0x60040004. The runtime will prefer the VTID if present
  @VTID(76)
  boolean rememberBookmark();


  /**
   * <p>
   * True if playback position is remembered.
   * </p>
   * <p>
   * Setter method for the COM property "RememberBookmark"
   * </p>
   * @param rememberBookmark Mandatory boolean parameter.
   */

  @DISPID(1610874884) //= 0x60040004. The runtime will prefer the VTID if present
  @VTID(77)
  void rememberBookmark(
    boolean rememberBookmark);


  /**
   * <p>
   * True if track is skipped when shuffling.
   * </p>
   * <p>
   * Getter method for the COM property "ExcludeFromShuffle"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610874886) //= 0x60040006. The runtime will prefer the VTID if present
  @VTID(78)
  boolean excludeFromShuffle();


  /**
   * <p>
   * True if track is skipped when shuffling.
   * </p>
   * <p>
   * Setter method for the COM property "ExcludeFromShuffle"
   * </p>
   * @param excludeFromShuffle Mandatory boolean parameter.
   */

  @DISPID(1610874886) //= 0x60040006. The runtime will prefer the VTID if present
  @VTID(79)
  void excludeFromShuffle(
    boolean excludeFromShuffle);


  /**
   * <p>
   * Lyrics for the track.
   * </p>
   * <p>
   * Getter method for the COM property "Lyrics"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610874888) //= 0x60040008. The runtime will prefer the VTID if present
  @VTID(80)
  java.lang.String lyrics();


  /**
   * <p>
   * Lyrics for the track.
   * </p>
   * <p>
   * Setter method for the COM property "Lyrics"
   * </p>
   * @param lyrics Mandatory java.lang.String parameter.
   */

  @DISPID(1610874888) //= 0x60040008. The runtime will prefer the VTID if present
  @VTID(81)
  void lyrics(
    java.lang.String lyrics);


  /**
   * <p>
   * Category for the track.
   * </p>
   * <p>
   * Getter method for the COM property "Category"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610874890) //= 0x6004000a. The runtime will prefer the VTID if present
  @VTID(82)
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

  @DISPID(1610874890) //= 0x6004000a. The runtime will prefer the VTID if present
  @VTID(83)
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

  @DISPID(1610874892) //= 0x6004000c. The runtime will prefer the VTID if present
  @VTID(84)
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

  @DISPID(1610874892) //= 0x6004000c. The runtime will prefer the VTID if present
  @VTID(85)
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

  @DISPID(1610874894) //= 0x6004000e. The runtime will prefer the VTID if present
  @VTID(86)
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

  @DISPID(1610874894) //= 0x6004000e. The runtime will prefer the VTID if present
  @VTID(87)
  void longDescription(
    java.lang.String longDescription);


  /**
   * <p>
   * The bookmark time of the track (in seconds).
   * </p>
   * <p>
   * Getter method for the COM property "BookmarkTime"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610874896) //= 0x60040010. The runtime will prefer the VTID if present
  @VTID(88)
  int bookmarkTime();


  /**
   * <p>
   * The bookmark time of the track (in seconds).
   * </p>
   * <p>
   * Setter method for the COM property "BookmarkTime"
   * </p>
   * @param bookmarkTime Mandatory int parameter.
   */

  @DISPID(1610874896) //= 0x60040010. The runtime will prefer the VTID if present
  @VTID(89)
  void bookmarkTime(
    int bookmarkTime);


  /**
   * <p>
   * The video track kind.
   * </p>
   * <p>
   * Getter method for the COM property "VideoKind"
   * </p>
   * @return  Returns a value of type com4j.itunes.ITVideoKind
   */

  @DISPID(1610874898) //= 0x60040012. The runtime will prefer the VTID if present
  @VTID(90)
  com4j.itunes.ITVideoKind videoKind();


  /**
   * <p>
   * The video track kind.
   * </p>
   * <p>
   * Setter method for the COM property "VideoKind"
   * </p>
   * @param videoKind Mandatory com4j.itunes.ITVideoKind parameter.
   */

  @DISPID(1610874898) //= 0x60040012. The runtime will prefer the VTID if present
  @VTID(91)
  void videoKind(
    com4j.itunes.ITVideoKind videoKind);


  /**
   * <p>
   * The number of times the track has been skipped.
   * </p>
   * <p>
   * Getter method for the COM property "SkippedCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610874900) //= 0x60040014. The runtime will prefer the VTID if present
  @VTID(92)
  int skippedCount();


  /**
   * <p>
   * The number of times the track has been skipped.
   * </p>
   * <p>
   * Setter method for the COM property "SkippedCount"
   * </p>
   * @param skippedCount Mandatory int parameter.
   */

  @DISPID(1610874900) //= 0x60040014. The runtime will prefer the VTID if present
  @VTID(93)
  void skippedCount(
    int skippedCount);


  /**
   * <p>
   * The date and time the track was last skipped.  A value of zero means no skipped date.
   * </p>
   * <p>
   * Getter method for the COM property "SkippedDate"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(1610874902) //= 0x60040016. The runtime will prefer the VTID if present
  @VTID(94)
  java.util.Date skippedDate();


  /**
   * <p>
   * The date and time the track was last skipped.  A value of zero means no skipped date.
   * </p>
   * <p>
   * Setter method for the COM property "SkippedDate"
   * </p>
   * @param skippedDate Mandatory java.util.Date parameter.
   */

  @DISPID(1610874902) //= 0x60040016. The runtime will prefer the VTID if present
  @VTID(95)
  void skippedDate(
    java.util.Date skippedDate);


  /**
   * <p>
   * True if track is part of a gapless album.
   * </p>
   * <p>
   * Getter method for the COM property "PartOfGaplessAlbum"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610874904) //= 0x60040018. The runtime will prefer the VTID if present
  @VTID(96)
  boolean partOfGaplessAlbum();


  /**
   * <p>
   * True if track is part of a gapless album.
   * </p>
   * <p>
   * Setter method for the COM property "PartOfGaplessAlbum"
   * </p>
   * @param partOfGaplessAlbum Mandatory boolean parameter.
   */

  @DISPID(1610874904) //= 0x60040018. The runtime will prefer the VTID if present
  @VTID(97)
  void partOfGaplessAlbum(
    boolean partOfGaplessAlbum);


  /**
   * <p>
   * The album artist of the track.
   * </p>
   * <p>
   * Getter method for the COM property "AlbumArtist"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610874906) //= 0x6004001a. The runtime will prefer the VTID if present
  @VTID(98)
  java.lang.String albumArtist();


  /**
   * <p>
   * The album artist of the track.
   * </p>
   * <p>
   * Setter method for the COM property "AlbumArtist"
   * </p>
   * @param albumArtist Mandatory java.lang.String parameter.
   */

  @DISPID(1610874906) //= 0x6004001a. The runtime will prefer the VTID if present
  @VTID(99)
  void albumArtist(
    java.lang.String albumArtist);


  /**
   * <p>
   * The show name of the track.
   * </p>
   * <p>
   * Getter method for the COM property "Show"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610874908) //= 0x6004001c. The runtime will prefer the VTID if present
  @VTID(100)
  java.lang.String show();


  /**
   * <p>
   * The show name of the track.
   * </p>
   * <p>
   * Setter method for the COM property "Show"
   * </p>
   * @param showName Mandatory java.lang.String parameter.
   */

  @DISPID(1610874908) //= 0x6004001c. The runtime will prefer the VTID if present
  @VTID(101)
  void show(
    java.lang.String showName);


  /**
   * <p>
   * The season number of the track.
   * </p>
   * <p>
   * Getter method for the COM property "SeasonNumber"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610874910) //= 0x6004001e. The runtime will prefer the VTID if present
  @VTID(102)
  int seasonNumber();


  /**
   * <p>
   * The season number of the track.
   * </p>
   * <p>
   * Setter method for the COM property "SeasonNumber"
   * </p>
   * @param seasonNumber Mandatory int parameter.
   */

  @DISPID(1610874910) //= 0x6004001e. The runtime will prefer the VTID if present
  @VTID(103)
  void seasonNumber(
    int seasonNumber);


  /**
   * <p>
   * The episode ID of the track.
   * </p>
   * <p>
   * Getter method for the COM property "EpisodeID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610874912) //= 0x60040020. The runtime will prefer the VTID if present
  @VTID(104)
  java.lang.String episodeID();


  /**
   * <p>
   * The episode ID of the track.
   * </p>
   * <p>
   * Setter method for the COM property "EpisodeID"
   * </p>
   * @param episodeID Mandatory java.lang.String parameter.
   */

  @DISPID(1610874912) //= 0x60040020. The runtime will prefer the VTID if present
  @VTID(105)
  void episodeID(
    java.lang.String episodeID);


  /**
   * <p>
   * The episode number of the track.
   * </p>
   * <p>
   * Getter method for the COM property "EpisodeNumber"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610874914) //= 0x60040022. The runtime will prefer the VTID if present
  @VTID(106)
  int episodeNumber();


  /**
   * <p>
   * The episode number of the track.
   * </p>
   * <p>
   * Setter method for the COM property "EpisodeNumber"
   * </p>
   * @param episodeNumber Mandatory int parameter.
   */

  @DISPID(1610874914) //= 0x60040022. The runtime will prefer the VTID if present
  @VTID(107)
  void episodeNumber(
    int episodeNumber);


  /**
   * <p>
   * The high 32-bits of the size of the track (in bytes).
   * </p>
   * <p>
   * Getter method for the COM property "Size64High"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610874916) //= 0x60040024. The runtime will prefer the VTID if present
  @VTID(108)
  int size64High();


  /**
   * <p>
   * The low 32-bits of the size of the track (in bytes).
   * </p>
   * <p>
   * Getter method for the COM property "Size64Low"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610874917) //= 0x60040025. The runtime will prefer the VTID if present
  @VTID(109)
  int size64Low();


  /**
   * <p>
   * True if track has not been played.
   * </p>
   * <p>
   * Getter method for the COM property "Unplayed"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610874918) //= 0x60040026. The runtime will prefer the VTID if present
  @VTID(110)
  boolean unplayed();


  /**
   * <p>
   * True if track has not been played.
   * </p>
   * <p>
   * Setter method for the COM property "Unplayed"
   * </p>
   * @param isUnplayed Mandatory boolean parameter.
   */

  @DISPID(1610874918) //= 0x60040026. The runtime will prefer the VTID if present
  @VTID(111)
  void unplayed(
    boolean isUnplayed);


  /**
   * <p>
   * The album used for sorting.
   * </p>
   * <p>
   * Getter method for the COM property "SortAlbum"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610874920) //= 0x60040028. The runtime will prefer the VTID if present
  @VTID(112)
  java.lang.String sortAlbum();


  /**
   * <p>
   * The album used for sorting.
   * </p>
   * <p>
   * Setter method for the COM property "SortAlbum"
   * </p>
   * @param album Mandatory java.lang.String parameter.
   */

  @DISPID(1610874920) //= 0x60040028. The runtime will prefer the VTID if present
  @VTID(113)
  void sortAlbum(
    java.lang.String album);


  /**
   * <p>
   * The album artist used for sorting.
   * </p>
   * <p>
   * Getter method for the COM property "SortAlbumArtist"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610874922) //= 0x6004002a. The runtime will prefer the VTID if present
  @VTID(114)
  java.lang.String sortAlbumArtist();


  /**
   * <p>
   * The album artist used for sorting.
   * </p>
   * <p>
   * Setter method for the COM property "SortAlbumArtist"
   * </p>
   * @param albumArtist Mandatory java.lang.String parameter.
   */

  @DISPID(1610874922) //= 0x6004002a. The runtime will prefer the VTID if present
  @VTID(115)
  void sortAlbumArtist(
    java.lang.String albumArtist);


  /**
   * <p>
   * The artist used for sorting.
   * </p>
   * <p>
   * Getter method for the COM property "SortArtist"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610874924) //= 0x6004002c. The runtime will prefer the VTID if present
  @VTID(116)
  java.lang.String sortArtist();


  /**
   * <p>
   * The artist used for sorting.
   * </p>
   * <p>
   * Setter method for the COM property "SortArtist"
   * </p>
   * @param artist Mandatory java.lang.String parameter.
   */

  @DISPID(1610874924) //= 0x6004002c. The runtime will prefer the VTID if present
  @VTID(117)
  void sortArtist(
    java.lang.String artist);


  /**
   * <p>
   * The composer used for sorting.
   * </p>
   * <p>
   * Getter method for the COM property "SortComposer"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610874926) //= 0x6004002e. The runtime will prefer the VTID if present
  @VTID(118)
  java.lang.String sortComposer();


  /**
   * <p>
   * The composer used for sorting.
   * </p>
   * <p>
   * Setter method for the COM property "SortComposer"
   * </p>
   * @param composer Mandatory java.lang.String parameter.
   */

  @DISPID(1610874926) //= 0x6004002e. The runtime will prefer the VTID if present
  @VTID(119)
  void sortComposer(
    java.lang.String composer);


  /**
   * <p>
   * The track name used for sorting.
   * </p>
   * <p>
   * Getter method for the COM property "SortName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610874928) //= 0x60040030. The runtime will prefer the VTID if present
  @VTID(120)
  java.lang.String sortName();


  /**
   * <p>
   * The track name used for sorting.
   * </p>
   * <p>
   * Setter method for the COM property "SortName"
   * </p>
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(1610874928) //= 0x60040030. The runtime will prefer the VTID if present
  @VTID(121)
  void sortName(
    java.lang.String name);


  /**
   * <p>
   * The show name used for sorting.
   * </p>
   * <p>
   * Getter method for the COM property "SortShow"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610874930) //= 0x60040032. The runtime will prefer the VTID if present
  @VTID(122)
  java.lang.String sortShow();


  /**
   * <p>
   * The show name used for sorting.
   * </p>
   * <p>
   * Setter method for the COM property "SortShow"
   * </p>
   * @param showName Mandatory java.lang.String parameter.
   */

  @DISPID(1610874930) //= 0x60040032. The runtime will prefer the VTID if present
  @VTID(123)
  void sortShow(
    java.lang.String showName);


  /**
   * <p>
   * Reveal the track in the main browser window.
   * </p>
   */

  @DISPID(1610874932) //= 0x60040034. The runtime will prefer the VTID if present
  @VTID(124)
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

  @DISPID(1610874933) //= 0x60040035. The runtime will prefer the VTID if present
  @VTID(125)
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

  @DISPID(1610874933) //= 0x60040035. The runtime will prefer the VTID if present
  @VTID(126)
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

  @DISPID(1610874935) //= 0x60040037. The runtime will prefer the VTID if present
  @VTID(127)
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

  @DISPID(1610874936) //= 0x60040038. The runtime will prefer the VTID if present
  @VTID(128)
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

  @DISPID(1610874937) //= 0x60040039. The runtime will prefer the VTID if present
  @VTID(129)
  com4j.itunes.IITPlaylistCollection playlists();


  @VTID(129)
  @ReturnValue(defaultPropertyThrough={com4j.itunes.IITPlaylistCollection.class})
  com4j.itunes.IITPlaylist playlists(
    int index);

  /**
   * <p>
   * The full path to the file represented by this track.
   * </p>
   * <p>
   * Setter method for the COM property "Location"
   * </p>
   * @param location Mandatory java.lang.String parameter.
   */

  @DISPID(1610874880) //= 0x60040000. The runtime will prefer the VTID if present
  @VTID(130)
  void location(
    java.lang.String location);


  /**
   * <p>
   * The release date of the track.  A value of zero means no release date.
   * </p>
   * <p>
   * Getter method for the COM property "ReleaseDate"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(1610874939) //= 0x6004003b. The runtime will prefer the VTID if present
  @VTID(131)
  java.util.Date releaseDate();


  // Properties:
}
