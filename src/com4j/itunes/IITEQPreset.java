package com4j.itunes  ;

import com4j.*;

/**
 * IITEQPreset Interface
 */
@IID("{5BE75F4F-68FA-4212-ACB7-BE44EA569759}")
public interface IITEQPreset extends Com4jObject {
  // Methods:
  /**
   * <p>
   * The name of the the EQ preset.
   * </p>
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String name();


  /**
   * <p>
   * True if this EQ preset can be modified.
   * </p>
   * <p>
   * Getter method for the COM property "Modifiable"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  boolean modifiable();


  /**
   * <p>
   * The equalizer preamp level (-12.0 db to +12.0 db).
   * </p>
   * <p>
   * Getter method for the COM property "Preamp"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
  double preamp();


  /**
   * <p>
   * The equalizer preamp level (-12.0 db to +12.0 db).
   * </p>
   * <p>
   * Setter method for the COM property "Preamp"
   * </p>
   * @param level Mandatory double parameter.
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(10)
  void preamp(
    double level);


  /**
   * <p>
   * The equalizer 32Hz band level (-12.0 db to +12.0 db).
   * </p>
   * <p>
   * Getter method for the COM property "Band1"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  double band1();


  /**
   * <p>
   * The equalizer 32Hz band level (-12.0 db to +12.0 db).
   * </p>
   * <p>
   * Setter method for the COM property "Band1"
   * </p>
   * @param level Mandatory double parameter.
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(12)
  void band1(
    double level);


  /**
   * <p>
   * The equalizer 64Hz band level (-12.0 db to +12.0 db).
   * </p>
   * <p>
   * Getter method for the COM property "Band2"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(13)
  double band2();


  /**
   * <p>
   * The equalizer 64Hz band level (-12.0 db to +12.0 db).
   * </p>
   * <p>
   * Setter method for the COM property "Band2"
   * </p>
   * @param level Mandatory double parameter.
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(14)
  void band2(
    double level);


  /**
   * <p>
   * The equalizer 125Hz band level (-12.0 db to +12.0 db).
   * </p>
   * <p>
   * Getter method for the COM property "Band3"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(15)
  double band3();


  /**
   * <p>
   * The equalizer 125Hz band level (-12.0 db to +12.0 db).
   * </p>
   * <p>
   * Setter method for the COM property "Band3"
   * </p>
   * @param level Mandatory double parameter.
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(16)
  void band3(
    double level);


  /**
   * <p>
   * The equalizer 250Hz band level (-12.0 db to +12.0 db).
   * </p>
   * <p>
   * Getter method for the COM property "Band4"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1610743818) //= 0x6002000a. The runtime will prefer the VTID if present
  @VTID(17)
  double band4();


  /**
   * <p>
   * The equalizer 250Hz band level (-12.0 db to +12.0 db).
   * </p>
   * <p>
   * Setter method for the COM property "Band4"
   * </p>
   * @param level Mandatory double parameter.
   */

  @DISPID(1610743818) //= 0x6002000a. The runtime will prefer the VTID if present
  @VTID(18)
  void band4(
    double level);


  /**
   * <p>
   * The equalizer 500Hz band level (-12.0 db to +12.0 db).
   * </p>
   * <p>
   * Getter method for the COM property "Band5"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1610743820) //= 0x6002000c. The runtime will prefer the VTID if present
  @VTID(19)
  double band5();


  /**
   * <p>
   * The equalizer 500Hz band level (-12.0 db to +12.0 db).
   * </p>
   * <p>
   * Setter method for the COM property "Band5"
   * </p>
   * @param level Mandatory double parameter.
   */

  @DISPID(1610743820) //= 0x6002000c. The runtime will prefer the VTID if present
  @VTID(20)
  void band5(
    double level);


  /**
   * <p>
   * The equalizer 1KHz band level (-12.0 db to +12.0 db).
   * </p>
   * <p>
   * Getter method for the COM property "Band6"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1610743822) //= 0x6002000e. The runtime will prefer the VTID if present
  @VTID(21)
  double band6();


  /**
   * <p>
   * The equalizer 1KHz band level (-12.0 db to +12.0 db).
   * </p>
   * <p>
   * Setter method for the COM property "Band6"
   * </p>
   * @param level Mandatory double parameter.
   */

  @DISPID(1610743822) //= 0x6002000e. The runtime will prefer the VTID if present
  @VTID(22)
  void band6(
    double level);


  /**
   * <p>
   * The equalizer 2KHz band level (-12.0 db to +12.0 db).
   * </p>
   * <p>
   * Getter method for the COM property "Band7"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1610743824) //= 0x60020010. The runtime will prefer the VTID if present
  @VTID(23)
  double band7();


  /**
   * <p>
   * The equalizer 2KHz band level (-12.0 db to +12.0 db).
   * </p>
   * <p>
   * Setter method for the COM property "Band7"
   * </p>
   * @param level Mandatory double parameter.
   */

  @DISPID(1610743824) //= 0x60020010. The runtime will prefer the VTID if present
  @VTID(24)
  void band7(
    double level);


  /**
   * <p>
   * The equalizer 4KHz band level (-12.0 db to +12.0 db).
   * </p>
   * <p>
   * Getter method for the COM property "Band8"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1610743826) //= 0x60020012. The runtime will prefer the VTID if present
  @VTID(25)
  double band8();


  /**
   * <p>
   * The equalizer 4KHz band level (-12.0 db to +12.0 db).
   * </p>
   * <p>
   * Setter method for the COM property "Band8"
   * </p>
   * @param level Mandatory double parameter.
   */

  @DISPID(1610743826) //= 0x60020012. The runtime will prefer the VTID if present
  @VTID(26)
  void band8(
    double level);


  /**
   * <p>
   * The equalizer 8KHz band level (-12.0 db to +12.0 db).
   * </p>
   * <p>
   * Getter method for the COM property "Band9"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1610743828) //= 0x60020014. The runtime will prefer the VTID if present
  @VTID(27)
  double band9();


  /**
   * <p>
   * The equalizer 8KHz band level (-12.0 db to +12.0 db).
   * </p>
   * <p>
   * Setter method for the COM property "Band9"
   * </p>
   * @param level Mandatory double parameter.
   */

  @DISPID(1610743828) //= 0x60020014. The runtime will prefer the VTID if present
  @VTID(28)
  void band9(
    double level);


  /**
   * <p>
   * The equalizer 16KHz band level (-12.0 db to +12.0 db).
   * </p>
   * <p>
   * Getter method for the COM property "Band10"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1610743830) //= 0x60020016. The runtime will prefer the VTID if present
  @VTID(29)
  double band10();


  /**
   * <p>
   * The equalizer 16KHz band level (-12.0 db to +12.0 db).
   * </p>
   * <p>
   * Setter method for the COM property "Band10"
   * </p>
   * @param level Mandatory double parameter.
   */

  @DISPID(1610743830) //= 0x60020016. The runtime will prefer the VTID if present
  @VTID(30)
  void band10(
    double level);


  /**
   * <p>
   * Delete this EQ preset.
   * </p>
   * @param updateAllTracks Mandatory boolean parameter.
   */

  @DISPID(1610743832) //= 0x60020018. The runtime will prefer the VTID if present
  @VTID(31)
  void delete(
    boolean updateAllTracks);


  /**
   * <p>
   * Rename this EQ preset.
   * </p>
   * @param newName Mandatory java.lang.String parameter.
   * @param updateAllTracks Mandatory boolean parameter.
   */

  @DISPID(1610743833) //= 0x60020019. The runtime will prefer the VTID if present
  @VTID(32)
  void rename(
    java.lang.String newName,
    boolean updateAllTracks);


  // Properties:
}
