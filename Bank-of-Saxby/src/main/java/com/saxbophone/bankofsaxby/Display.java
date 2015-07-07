package com.saxbophone.bankofsaxby.display;


public interface Display {
  // An abstraction of an ATM Screen
  // initialise the Display:
  public void init();
  // set header message
  public void setHeader(String message);
  // clear header message
  public void clearHeader();
  // set main screen message
  public void setMessage(String[] lines);
  // clear main screen message
  public void clearMessage();
  // set the message of a numbered button
  public void setButtonMessage(int button, String message);
  // clear the message of a numbered button
  public void clearButtonMessage(int button);
}
