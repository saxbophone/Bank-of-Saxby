package com.saxbophone.bankofsaxby;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JPanel;


public class GuiAtmScreen extends JPanel implements Control, Display {
  public GuiAtmScreen() {
    initGui();
  }

  public void sendButton(int button) {
    // Dummy implementation for now
    System.out.println(button);
  }

  private ActionListener actionListener = new ActionListener() {
    public void actionPerformed(ActionEvent actionEvent) {
      if(capturing) {
        sendButton((int)actionEvent.getActionCommand());
      }
    }
  };

  public void initGui() {
    setLayout(new BorderLayout());
    GridLayout leftButtons = new GridLayout(3, 1);
    GridLayout rightButtons = new GridLayout(3, 1);
    for(String button : buttons) {
      JButton b = new JButton(button);
      b.addActionListener(actionListener);
      add(b);
    }
  }
}
