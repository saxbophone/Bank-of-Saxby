package com.saxbophone.bankofsaxby;


public class ScreenLayout {
  // This class represents a layout of content on an ATM Screen.
  // This includes the text next to buttons, main title and message as well as
  // a reference to the Display that this ScreenLayout should render to.
  private Display screen;
  private String title;
  private String message;
  private String[] buttonMessages;

  public ScreenLayout(Display target) {
    // Assign this ScreenLayout to the given Display
    screen = target;
  }

  public ScreenLayout(Display target,
                      String titleText,
                      String messageText,
                      String[] buttonMessageText) {
    // check that there are no more than 6 buttonMessages defined
    if(buttonMessageText.length > 6) {
      throw new IllegalArgumentException("Length of array argument " +
                                         "buttonMessageText cannot exceed 6.");
    }
    screen = target;
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
}
