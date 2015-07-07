package com.saxbophone.bankofsaxby;


public interface Control {
  // Called when any main screen button is pressed when enabled.
  // button is int number of the button ID that was pressed.
  // (Buttons are numbered left-right descending - there are 6 of them).
  public void sendButton(int button);
}
