package com.saxbophone.bankofsaxby;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JButton;


public class Pinpad extends JPanel {
  public Pinpad() {
    initGui();
  }
  private ActionListener actionListener = new ActionListener() {
    public void actionPerformed(ActionEvent actionEvent) {
      System.out.println(actionEvent.getActionCommand());
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
