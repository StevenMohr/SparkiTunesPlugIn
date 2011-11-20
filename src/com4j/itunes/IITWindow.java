package com4j.itunes  ;

import com4j.*;

/**
 * IITWindow Interface
 */
@IID("{370D7BE0-3A89-4A42-B902-C75FC138BE09}")
public interface IITWindow extends Com4jObject {
  // Methods:
  /**
   * <p>
   * The title of the window.
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
   * The window kind.
   * </p>
   * <p>
   * Getter method for the COM property "Kind"
   * </p>
   * @return  Returns a value of type com4j.itunes.ITWindowKind
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  com4j.itunes.ITWindowKind kind();


  /**
   * <p>
   * True if the window is visible. Note that the main browser window cannot be hidden.
   * </p>
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
  boolean visible();


  /**
   * <p>
   * True if the window is visible. Note that the main browser window cannot be hidden.
   * </p>
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param isVisible Mandatory boolean parameter.
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(10)
  void visible(
    boolean isVisible);


  /**
   * <p>
   * True if the window is resizable.
   * </p>
   * <p>
   * Getter method for the COM property "Resizable"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  boolean resizable();


  /**
   * <p>
   * True if the window is minimized.
   * </p>
   * <p>
   * Getter method for the COM property "Minimized"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(12)
  boolean minimized();


  /**
   * <p>
   * True if the window is minimized.
   * </p>
   * <p>
   * Setter method for the COM property "Minimized"
   * </p>
   * @param isMinimized Mandatory boolean parameter.
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(13)
  void minimized(
    boolean isMinimized);


  /**
   * <p>
   * True if the window is maximizable.
   * </p>
   * <p>
   * Getter method for the COM property "Maximizable"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743815) //= 0x60020007. The runtime will prefer the VTID if present
  @VTID(14)
  boolean maximizable();


  /**
   * <p>
   * True if the window is maximized.
   * </p>
   * <p>
   * Getter method for the COM property "Maximized"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(15)
  boolean maximized();


  /**
   * <p>
   * True if the window is maximized.
   * </p>
   * <p>
   * Setter method for the COM property "Maximized"
   * </p>
   * @param isMaximized Mandatory boolean parameter.
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(16)
  void maximized(
    boolean isMaximized);


  /**
   * <p>
   * True if the window is zoomable.
   * </p>
   * <p>
   * Getter method for the COM property "Zoomable"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743818) //= 0x6002000a. The runtime will prefer the VTID if present
  @VTID(17)
  boolean zoomable();


  /**
   * <p>
   * True if the window is zoomed.
   * </p>
   * <p>
   * Getter method for the COM property "Zoomed"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743819) //= 0x6002000b. The runtime will prefer the VTID if present
  @VTID(18)
  boolean zoomed();


  /**
   * <p>
   * True if the window is zoomed.
   * </p>
   * <p>
   * Setter method for the COM property "Zoomed"
   * </p>
   * @param isZoomed Mandatory boolean parameter.
   */

  @DISPID(1610743819) //= 0x6002000b. The runtime will prefer the VTID if present
  @VTID(19)
  void zoomed(
    boolean isZoomed);


  /**
   * <p>
   * The screen coordinate of the top edge of the window.
   * </p>
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743821) //= 0x6002000d. The runtime will prefer the VTID if present
  @VTID(20)
  int top();


  /**
   * <p>
   * The screen coordinate of the top edge of the window.
   * </p>
   * <p>
   * Setter method for the COM property "Top"
   * </p>
   * @param top Mandatory int parameter.
   */

  @DISPID(1610743821) //= 0x6002000d. The runtime will prefer the VTID if present
  @VTID(21)
  void top(
    int top);


  /**
   * <p>
   * The screen coordinate of the left edge of the window.
   * </p>
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743823) //= 0x6002000f. The runtime will prefer the VTID if present
  @VTID(22)
  int left();


  /**
   * <p>
   * The screen coordinate of the left edge of the window.
   * </p>
   * <p>
   * Setter method for the COM property "Left"
   * </p>
   * @param left Mandatory int parameter.
   */

  @DISPID(1610743823) //= 0x6002000f. The runtime will prefer the VTID if present
  @VTID(23)
  void left(
    int left);


  /**
   * <p>
   * The screen coordinate of the bottom edge of the window.
   * </p>
   * <p>
   * Getter method for the COM property "Bottom"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743825) //= 0x60020011. The runtime will prefer the VTID if present
  @VTID(24)
  int bottom();


  /**
   * <p>
   * The screen coordinate of the bottom edge of the window.
   * </p>
   * <p>
   * Setter method for the COM property "Bottom"
   * </p>
   * @param bottom Mandatory int parameter.
   */

  @DISPID(1610743825) //= 0x60020011. The runtime will prefer the VTID if present
  @VTID(25)
  void bottom(
    int bottom);


  /**
   * <p>
   * The screen coordinate of the right edge of the window.
   * </p>
   * <p>
   * Getter method for the COM property "Right"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743827) //= 0x60020013. The runtime will prefer the VTID if present
  @VTID(26)
  int right();


  /**
   * <p>
   * The screen coordinate of the right edge of the window.
   * </p>
   * <p>
   * Setter method for the COM property "Right"
   * </p>
   * @param right Mandatory int parameter.
   */

  @DISPID(1610743827) //= 0x60020013. The runtime will prefer the VTID if present
  @VTID(27)
  void right(
    int right);


  /**
   * <p>
   * The width of the window.
   * </p>
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743829) //= 0x60020015. The runtime will prefer the VTID if present
  @VTID(28)
  int width();


  /**
   * <p>
   * The width of the window.
   * </p>
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param width Mandatory int parameter.
   */

  @DISPID(1610743829) //= 0x60020015. The runtime will prefer the VTID if present
  @VTID(29)
  void width(
    int width);


  /**
   * <p>
   * The height of the window.
   * </p>
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743831) //= 0x60020017. The runtime will prefer the VTID if present
  @VTID(30)
  int height();


  /**
   * <p>
   * The height of the window.
   * </p>
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param height Mandatory int parameter.
   */

  @DISPID(1610743831) //= 0x60020017. The runtime will prefer the VTID if present
  @VTID(31)
  void height(
    int height);


  // Properties:
}
