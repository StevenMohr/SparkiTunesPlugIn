package com4j.itunes  ;

import com4j.*;

/**
 * IITTrack Interface
 */
@IID("{4CB0915D-1E54-4727-BAF3-CE6CC9A225A1}")
public interface IITTrack extends com4j.itunes.IITObject {
  // Methods:
  /**
   * <p>
   * Delete this track.
   * </p>
   */

  @DISPID(1610809344) //= 0x60030000. The runtime will prefer the VTID if present
  @VTID(15)
  void delete();


  /**
   * <p>
   * Start playing this track.
   * </p>
   */

  @DISPID(1610809345) //= 0x60030001. The runtime will prefer the VTID if present
  @VTID(16)
  void play();


  /**
   * <p>
   * Add artwork from an image file to this track.
   * </p>
   * @param filePath Mandatory java.lang.String parameter.
   * @return  Returns a value of type com4j.itunes.IITArtwork
   */

  @DISPID(1610809346) //= 0x60030002. The runtime will prefer the VTID if present
  @VTID(17)
  com4j.itunes.IITArtwork addArtworkFromFile(
    java.lang.String filePath);


  /**
   * <p>
   * The track kind.
   * </p>
   * <p>
   * Getter method for the COM property "Kind"
   * </p>
   * @return  Returns a value of type com4j.itunes.ITTrackKind
   */

  @DISPID(1610809347) //= 0x60030003. The runtime will prefer the VTID if present
  @VTID(18)
  com4j.itunes.ITTrackKind kind();


  /**
   * <p>
   * The playlist that contains this track.
   * </p>
   * <p>
   * Getter method for the COM property "Playlist"
   * </p>
   * @return  Returns a value of type com4j.itunes.IITPlaylist
   */

  @DISPID(1610809348) //= 0x60030004. The runtime will prefer the VTID if present
  @VTID(19)
  com4j.itunes.IITPlaylist playlist();


  /**
   * <p>
   * The album containing the track.
   * </p>
   * <p>
   * Getter method for the COM property "Album"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610809349) //= 0x60030005. The runtime will prefer the VTID if present
  @VTID(20)
  java.lang.String album();


  /**
   * <p>
   * The album containing the track.
   * </p>
   * <p>
   * Setter method for the COM property "Album"
   * </p>
   * @param album Mandatory java.lang.String parameter.
   */

  @DISPID(1610809349) //= 0x60030005. The runtime will prefer the VTID if present
  @VTID(21)
  void album(
    java.lang.String album);


  /**
   * <p>
   * The artist/source of the track.
   * </p>
   * <p>
   * Getter method for the COM property "Artist"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610809351) //= 0x60030007. The runtime will prefer the VTID if present
  @VTID(22)
  java.lang.String artist();


  /**
   * <p>
   * The artist/source of the track.
   * </p>
   * <p>
   * Setter method for the COM property "Artist"
   * </p>
   * @param artist Mandatory java.lang.String parameter.
   */

  @DISPID(1610809351) //= 0x60030007. The runtime will prefer the VTID if present
  @VTID(23)
  void artist(
    java.lang.String artist);


  /**
   * <p>
   * The bit rate of the track (in kbps).
   * </p>
   * <p>
   * Getter method for the COM property "BitRate"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610809353) //= 0x60030009. The runtime will prefer the VTID if present
  @VTID(24)
  int bitRate();


  /**
   * <p>
   * The tempo of the track (in beats per minute).
   * </p>
   * <p>
   * Getter method for the COM property "BPM"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610809354) //= 0x6003000a. The runtime will prefer the VTID if present
  @VTID(25)
  int bpm();


  /**
   * <p>
   * The tempo of the track (in beats per minute).
   * </p>
   * <p>
   * Setter method for the COM property "BPM"
   * </p>
   * @param beatsPerMinute Mandatory int parameter.
   */

  @DISPID(1610809354) //= 0x6003000a. The runtime will prefer the VTID if present
  @VTID(26)
  void bpm(
    int beatsPerMinute);


  /**
   * <p>
   * Freeform notes about the track.
   * </p>
   * <p>
   * Getter method for the COM property "Comment"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610809356) //= 0x6003000c. The runtime will prefer the VTID if present
  @VTID(27)
  java.lang.String comment();


  /**
   * <p>
   * Freeform notes about the track.
   * </p>
   * <p>
   * Setter method for the COM property "Comment"
   * </p>
   * @param comment Mandatory java.lang.String parameter.
   */

  @DISPID(1610809356) //= 0x6003000c. The runtime will prefer the VTID if present
  @VTID(28)
  void comment(
    java.lang.String comment);


  /**
   * <p>
   * True if this track is from a compilation album.
   * </p>
   * <p>
   * Getter method for the COM property "Compilation"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610809358) //= 0x6003000e. The runtime will prefer the VTID if present
  @VTID(29)
  boolean compilation();


  /**
   * <p>
   * True if this track is from a compilation album.
   * </p>
   * <p>
   * Setter method for the COM property "Compilation"
   * </p>
   * @param isCompilation Mandatory boolean parameter.
   */

  @DISPID(1610809358) //= 0x6003000e. The runtime will prefer the VTID if present
  @VTID(30)
  void compilation(
    boolean isCompilation);


  /**
   * <p>
   * The composer of the track.
   * </p>
   * <p>
   * Getter method for the COM property "Composer"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610809360) //= 0x60030010. The runtime will prefer the VTID if present
  @VTID(31)
  java.lang.String composer();


  /**
   * <p>
   * The composer of the track.
   * </p>
   * <p>
   * Setter method for the COM property "Composer"
   * </p>
   * @param composer Mandatory java.lang.String parameter.
   */

  @DISPID(1610809360) //= 0x60030010. The runtime will prefer the VTID if present
  @VTID(32)
  void composer(
    java.lang.String composer);


  /**
   * <p>
   * The date the track was added to the playlist.
   * </p>
   * <p>
   * Getter method for the COM property "DateAdded"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(1610809362) //= 0x60030012. The runtime will prefer the VTID if present
  @VTID(33)
  java.util.Date dateAdded();


  /**
   * <p>
   * The total number of discs in the source album.
   * </p>
   * <p>
   * Getter method for the COM property "DiscCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610809363) //= 0x60030013. The runtime will prefer the VTID if present
  @VTID(34)
  int discCount();


  /**
   * <p>
   * The total number of discs in the source album.
   * </p>
   * <p>
   * Setter method for the COM property "DiscCount"
   * </p>
   * @param discCount Mandatory int parameter.
   */

  @DISPID(1610809363) //= 0x60030013. The runtime will prefer the VTID if present
  @VTID(35)
  void discCount(
    int discCount);


  /**
   * <p>
   * The index of the disc containing the track on the source album.
   * </p>
   * <p>
   * Getter method for the COM property "DiscNumber"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610809365) //= 0x60030015. The runtime will prefer the VTID if present
  @VTID(36)
  int discNumber();


  /**
   * <p>
   * The index of the disc containing the track on the source album.
   * </p>
   * <p>
   * Setter method for the COM property "DiscNumber"
   * </p>
   * @param discNumber Mandatory int parameter.
   */

  @DISPID(1610809365) //= 0x60030015. The runtime will prefer the VTID if present
  @VTID(37)
  void discNumber(
    int discNumber);


  /**
   * <p>
   * The length of the track (in seconds).
   * </p>
   * <p>
   * Getter method for the COM property "Duration"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610809367) //= 0x60030017. The runtime will prefer the VTID if present
  @VTID(38)
  int duration();


  /**
   * <p>
   * True if the track is checked for playback.
   * </p>
   * <p>
   * Getter method for the COM property "Enabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610809368) //= 0x60030018. The runtime will prefer the VTID if present
  @VTID(39)
  boolean enabled();


  /**
   * <p>
   * True if the track is checked for playback.
   * </p>
   * <p>
   * Setter method for the COM property "Enabled"
   * </p>
   * @param isEnabled Mandatory boolean parameter.
   */

  @DISPID(1610809368) //= 0x60030018. The runtime will prefer the VTID if present
  @VTID(40)
  void enabled(
    boolean isEnabled);


  /**
   * <p>
   * The name of the EQ preset of the track.
   * </p>
   * <p>
   * Getter method for the COM property "EQ"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610809370) //= 0x6003001a. The runtime will prefer the VTID if present
  @VTID(41)
  java.lang.String eq();


  /**
   * <p>
   * The name of the EQ preset of the track.
   * </p>
   * <p>
   * Setter method for the COM property "EQ"
   * </p>
   * @param eq Mandatory java.lang.String parameter.
   */

  @DISPID(1610809370) //= 0x6003001a. The runtime will prefer the VTID if present
  @VTID(42)
  void eq(
    java.lang.String eq);


  /**
   * <p>
   * The stop time of the track (in seconds).
   * </p>
   * <p>
   * Setter method for the COM property "Finish"
   * </p>
   * @param finish Mandatory int parameter.
   */

  @DISPID(1610809372) //= 0x6003001c. The runtime will prefer the VTID if present
  @VTID(43)
  void finish(
    int finish);


  /**
   * <p>
   * The stop time of the track (in seconds).
   * </p>
   * <p>
   * Getter method for the COM property "Finish"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610809372) //= 0x6003001c. The runtime will prefer the VTID if present
  @VTID(44)
  int finish();


  /**
   * <p>
   * The music/audio genre (category) of the track.
   * </p>
   * <p>
   * Getter method for the COM property "Genre"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610809374) //= 0x6003001e. The runtime will prefer the VTID if present
  @VTID(45)
  java.lang.String genre();


  /**
   * <p>
   * The music/audio genre (category) of the track.
   * </p>
   * <p>
   * Setter method for the COM property "Genre"
   * </p>
   * @param genre Mandatory java.lang.String parameter.
   */

  @DISPID(1610809374) //= 0x6003001e. The runtime will prefer the VTID if present
  @VTID(46)
  void genre(
    java.lang.String genre);


  /**
   * <p>
   * The grouping (piece) of the track.  Generally used to denote movements within classical work.
   * </p>
   * <p>
   * Getter method for the COM property "Grouping"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610809376) //= 0x60030020. The runtime will prefer the VTID if present
  @VTID(47)
  java.lang.String grouping();


  /**
   * <p>
   * The grouping (piece) of the track.  Generally used to denote movements within classical work.
   * </p>
   * <p>
   * Setter method for the COM property "Grouping"
   * </p>
   * @param grouping Mandatory java.lang.String parameter.
   */

  @DISPID(1610809376) //= 0x60030020. The runtime will prefer the VTID if present
  @VTID(48)
  void grouping(
    java.lang.String grouping);


  /**
   * <p>
   * A text description of the track.
   * </p>
   * <p>
   * Getter method for the COM property "KindAsString"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610809378) //= 0x60030022. The runtime will prefer the VTID if present
  @VTID(49)
  java.lang.String kindAsString();


  /**
   * <p>
   * The modification date of the content of the track.
   * </p>
   * <p>
   * Getter method for the COM property "ModificationDate"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(1610809379) //= 0x60030023. The runtime will prefer the VTID if present
  @VTID(50)
  java.util.Date modificationDate();


  /**
   * <p>
   * The number of times the track has been played.
   * </p>
   * <p>
   * Getter method for the COM property "PlayedCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610809380) //= 0x60030024. The runtime will prefer the VTID if present
  @VTID(51)
  int playedCount();


  /**
   * <p>
   * The number of times the track has been played.
   * </p>
   * <p>
   * Setter method for the COM property "PlayedCount"
   * </p>
   * @param playedCount Mandatory int parameter.
   */

  @DISPID(1610809380) //= 0x60030024. The runtime will prefer the VTID if present
  @VTID(52)
  void playedCount(
    int playedCount);


  /**
   * <p>
   * The date and time the track was last played.  A value of zero means no played date.
   * </p>
   * <p>
   * Getter method for the COM property "PlayedDate"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(1610809382) //= 0x60030026. The runtime will prefer the VTID if present
  @VTID(53)
  java.util.Date playedDate();


  /**
   * <p>
   * The date and time the track was last played.  A value of zero means no played date.
   * </p>
   * <p>
   * Setter method for the COM property "PlayedDate"
   * </p>
   * @param playedDate Mandatory java.util.Date parameter.
   */

  @DISPID(1610809382) //= 0x60030026. The runtime will prefer the VTID if present
  @VTID(54)
  void playedDate(
    java.util.Date playedDate);


  /**
   * <p>
   * The play order index of the track in the owner playlist (1-based).
   * </p>
   * <p>
   * Getter method for the COM property "PlayOrderIndex"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610809384) //= 0x60030028. The runtime will prefer the VTID if present
  @VTID(55)
  int playOrderIndex();


  /**
   * <p>
   * The rating of the track (0 to 100).
   * </p>
   * <p>
   * Getter method for the COM property "Rating"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610809385) //= 0x60030029. The runtime will prefer the VTID if present
  @VTID(56)
  int rating();


  /**
   * <p>
   * The rating of the track (0 to 100).
   * </p>
   * <p>
   * Setter method for the COM property "Rating"
   * </p>
   * @param rating Mandatory int parameter.
   */

  @DISPID(1610809385) //= 0x60030029. The runtime will prefer the VTID if present
  @VTID(57)
  void rating(
    int rating);


  /**
   * <p>
   * The sample rate of the track (in Hz).
   * </p>
   * <p>
   * Getter method for the COM property "SampleRate"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610809387) //= 0x6003002b. The runtime will prefer the VTID if present
  @VTID(58)
  int sampleRate();


  /**
   * <p>
   * The size of the track (in bytes).
   * </p>
   * <p>
   * Getter method for the COM property "Size"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610809388) //= 0x6003002c. The runtime will prefer the VTID if present
  @VTID(59)
  int size();


  /**
   * <p>
   * The start time of the track (in seconds).
   * </p>
   * <p>
   * Getter method for the COM property "Start"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610809389) //= 0x6003002d. The runtime will prefer the VTID if present
  @VTID(60)
  int start();


  /**
   * <p>
   * The start time of the track (in seconds).
   * </p>
   * <p>
   * Setter method for the COM property "Start"
   * </p>
   * @param start Mandatory int parameter.
   */

  @DISPID(1610809389) //= 0x6003002d. The runtime will prefer the VTID if present
  @VTID(61)
  void start(
    int start);


  /**
   * <p>
   * The length of the track (in MM:SS format).
   * </p>
   * <p>
   * Getter method for the COM property "Time"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610809391) //= 0x6003002f. The runtime will prefer the VTID if present
  @VTID(62)
  java.lang.String time();


  /**
   * <p>
   * The total number of tracks on the source album.
   * </p>
   * <p>
   * Getter method for the COM property "TrackCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610809392) //= 0x60030030. The runtime will prefer the VTID if present
  @VTID(63)
  int trackCount();


  /**
   * <p>
   * The total number of tracks on the source album.
   * </p>
   * <p>
   * Setter method for the COM property "TrackCount"
   * </p>
   * @param trackCount Mandatory int parameter.
   */

  @DISPID(1610809392) //= 0x60030030. The runtime will prefer the VTID if present
  @VTID(64)
  void trackCount(
    int trackCount);


  /**
   * <p>
   * The index of the track on the source album.
   * </p>
   * <p>
   * Getter method for the COM property "TrackNumber"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610809394) //= 0x60030032. The runtime will prefer the VTID if present
  @VTID(65)
  int trackNumber();


  /**
   * <p>
   * The index of the track on the source album.
   * </p>
   * <p>
   * Setter method for the COM property "TrackNumber"
   * </p>
   * @param trackNumber Mandatory int parameter.
   */

  @DISPID(1610809394) //= 0x60030032. The runtime will prefer the VTID if present
  @VTID(66)
  void trackNumber(
    int trackNumber);


  /**
   * <p>
   * The relative volume adjustment of the track (-100% to 100%).
   * </p>
   * <p>
   * Getter method for the COM property "VolumeAdjustment"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610809396) //= 0x60030034. The runtime will prefer the VTID if present
  @VTID(67)
  int volumeAdjustment();


  /**
   * <p>
   * The relative volume adjustment of the track (-100% to 100%).
   * </p>
   * <p>
   * Setter method for the COM property "VolumeAdjustment"
   * </p>
   * @param volumeAdjustment Mandatory int parameter.
   */

  @DISPID(1610809396) //= 0x60030034. The runtime will prefer the VTID if present
  @VTID(68)
  void volumeAdjustment(
    int volumeAdjustment);


  /**
   * <p>
   * The year the track was recorded/released.
   * </p>
   * <p>
   * Getter method for the COM property "Year"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610809398) //= 0x60030036. The runtime will prefer the VTID if present
  @VTID(69)
  int year();


  /**
   * <p>
   * The year the track was recorded/released.
   * </p>
   * <p>
   * Setter method for the COM property "Year"
   * </p>
   * @param year Mandatory int parameter.
   */

  @DISPID(1610809398) //= 0x60030036. The runtime will prefer the VTID if present
  @VTID(70)
  void year(
    int year);


  /**
   * <p>
   * Returns a collection of artwork.
   * </p>
   * <p>
   * Getter method for the COM property "Artwork"
   * </p>
   * @return  Returns a value of type com4j.itunes.IITArtworkCollection
   */

  @DISPID(1610809400) //= 0x60030038. The runtime will prefer the VTID if present
  @VTID(71)
  com4j.itunes.IITArtworkCollection artwork();


  @VTID(71)
  @ReturnValue(defaultPropertyThrough={com4j.itunes.IITArtworkCollection.class})
  com4j.itunes.IITArtwork artwork(
    int index);

  // Properties:
}
