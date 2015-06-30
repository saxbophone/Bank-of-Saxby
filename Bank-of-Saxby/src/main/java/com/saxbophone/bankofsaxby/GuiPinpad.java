package com.saxbophone.bankofsaxby;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JPanel;
import javax.swing.JButton;


public class GuiPinpad extends JPanel implements Pinpad {
  private boolean capturing = false;

  public GuiPinpad() {
    initGui();
  }

  public void startCapture() {
    capturing = true;
  }

  public void stopCapture() {
    capturing = false;
  }

  public void sendButton(String button) {
    // Dummy implementation for now
    // If button is not a number then print on newline:
    if(Arrays.asList("Cancel", "Clear", "Enter").contains(button)) {
      System.out.println("");
      System.out.println(button);
    }
    // else then print it out with no newline:
    else {
      System.out.print(button);
    }
  }

  private ActionListener actionListener = new ActionListener() {
    public void actionPerformed(ActionEvent actionEvent) {
      if(capturing) {
        sendButton(actionEvent.getActionCommand());
      }
    }
  };

  public void initGui() {
    setLayout(new GridLayout(5, 3));
    String[] buttons = { "1", "2", "3",
                         "4", "5", "6",
                         "7", "8", "9",
                         "*", "0", "#",
                         "Cancel", "Clear", "Enter" };
    for(String button : buttons) {
      JButton b = new JButton(button);
      b.addActionListener(actionListener);
      add(b);
    }
  }
}
