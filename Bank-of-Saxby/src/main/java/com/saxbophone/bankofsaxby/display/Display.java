package com.saxbophone.bankofsaxby.display;


/*
 * Bank-of-Saxby - A fake simulated ATM Machine
 * Written by Joshua Saxby 2015 - See LICENSE in the root of this
 * repository for more information.
 */


public interface Display {
  /*
   * This is an interface for abstracting out how the app interacts with
   * the user. For example one class could implement this as a command-line
   * interface, while another could implement it as a graphical interface.
   */
  // initialise the Display, returning success state.
  public boolean init();
  // set header message
  public void setHeader(String message);
  // clear header message
  public void clearHeader();
  // set main multi-line text
  public void setMessage(String[] lines);
  // clear multi-line text
  public void clearMessage();
  // set the message of a numbered button, returns false if invalid number.
  public boolean setButtonMessage(int button, String message);
  // clear the message of a numbered button, returns false if invalid number.
  public boolean clearButtonMessage(int button);
  // get the number of action buttons
  public int getButtonCount();
  // returns true if a number has been entered into the PIN Pad, false if not.
  public boolean pinPadReady();
  // returns the numbers entered into the PIN Pad
  public int[] getPinPadData();
}
