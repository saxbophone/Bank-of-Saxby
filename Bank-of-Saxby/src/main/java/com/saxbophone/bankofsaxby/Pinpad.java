package com.saxbophone.bankofsaxby;


public interface Pinpad {
  // Called when the ATM wants to start receiving button presses.
  public void startCapture();
  // Called when the ATM wants to stop receiving button presses.
  public void stopCapture();
  // Called when any button is pressed on the PIN pad when enabled.
  // button is String name of the button that was pressed.
  public void sendButton(String button);
}
