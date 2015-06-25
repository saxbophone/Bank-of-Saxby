package com.saxbophone.bankofsaxby;

import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JButton;


public class Pinpad extends JPanel {
  public Pinpad() {
    initGui();
  }
  public void initGui() {
    setLayout(new GridLayout(5, 3));
    String[] buttons = { "1", "2", "3",
                         "4", "5", "6",
                         "7", "8", "9",
                         "*", "0", "#",
                         "Cancel", "Clear", "Enter" };
    for(String button : buttons) {
      add(new JButton(button));
    }
  }
}
