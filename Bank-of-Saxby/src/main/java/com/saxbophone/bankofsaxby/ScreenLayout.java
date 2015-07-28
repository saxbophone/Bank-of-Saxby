package com.saxbophone.bankofsaxby;


public class ScreenLayout {
  // This class represents a layout of content on an ATM Screen.
  // This includes the text next to buttons, main title and message as well as
  // a reference to the Display that this ScreenLayout should render to.
  private Display screen;
  private String title;
  private String message;
  private String[] buttonMessages;


  public ScreenLayout(Display target,
                      String titleText,
                      String messageText,
                      String[] buttonMessageText,
                      int[] buttonScreenRedirect) {
    // call the main constructor, then set target
    this(
      titleText,
      messageText,
      buttonMessageText,
      buttonScreenRedirect
    );
    screen = target;
  }

  public ScreenLayout(String titleText,
                      String messageText,
                      String[] buttonMessageText,
                      int[] buttonScreenRedirect) {
    // check that there are no more than 6 buttonMessages defined
    if(buttonMessageText.length > 6) {
      throw new IllegalArgumentException(
        "Length of array argument " + "buttonMessageText cannot exceed 6."
      );
    }
    // Same for buttonScreenRedirect
    if(buttonScreenRedirect.length > 6) {
      throw new IllegalArgumentException(
        "Length of array argument " + "buttonScreenRedirect cannot exceed 6."
      );
    }
    title = titleText;
    message = messageText;
    buttonMessages = new String[6];
    for(int i = 0; i < buttonMessageText.length; i++) {
      buttonMessages[i] = buttonMessageText[i];
    }
  }

  public void render() {
    // Render the content in this ScreenLayout to it's Display.
    screen.setHeader(title);
    screen.setMessage(message);
    for(int i = 0; i < 6; i++) {
      if((buttonMessages[i] != null) && (buttonMessages[i] != "")) {
        screen.setButtonMessage(i, buttonMessages[i]);
      }
      else {
        screen.clearButtonMessage(i);
      }
    }
  }

  public void setDisplay(Display display) {
    screen = display;
  }
}
