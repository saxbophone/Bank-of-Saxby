package com.saxbophone.bankofsaxby;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JPanel;


public class GuiAtmScreen extends JPanel implements Control {
  private JPanel leftButtons;
  private JPanel rightButtons;
  public GuiAtmScreen() {
    initGui();
  }

  public void sendButton(int button) {
    // Dummy implementation for now
    System.out.println(button);
  }

  private ActionListener actionListener = new ActionListener() {
    public void actionPerformed(ActionEvent actionEvent) {
      sendButton(Integer.parseInt(actionEvent.getActionCommand()));
    }
  };

  public void initGui() {
    setLayout(new BorderLayout());
    leftButtons = new JPanel(new GridLayout(3, 1));
    rightButtons = new JPanel(new GridLayout(3, 1));
    for(int i = 0; i < 3; i++) {
      JButton l = new JButton();
      l.addActionListener(actionListener);
      l.setActionCommand(Integer.toString(i));
      leftButtons.add(l);
      JButton r = new JButton();
      r.addActionListener(actionListener);
      r.setActionCommand(Integer.toString(i));
      rightButtons.add(r);
    }
    add(leftButtons, BorderLayout.LINE_START);
    add(rightButtons, BorderLayout.LINE_END);
  }
}
