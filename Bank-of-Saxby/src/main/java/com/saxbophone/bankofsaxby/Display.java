package com.saxbophone.bankofsaxby;


public interface Display {
  // An abstraction of an ATM Screen
  // set header message
  public void setHeader(String message);
  // clear header message
  public void clearHeader();
  // set main screen message
  public void setMessage(String message);
  // clear main screen message
  public void clearMessage();
  // set the message of a numbered button
  public void setButtonMessage(int button, String message);
  // clear the message of a numbered button
  public void clearButtonMessage(int button);
  // add a given ScreenLayout to this Display
  public void addLayout(ScreenLayout layout);
}
