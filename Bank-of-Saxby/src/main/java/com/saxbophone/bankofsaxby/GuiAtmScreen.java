package com.saxbophone.bankofsaxby;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class GuiAtmScreen extends JPanel implements Control, Display {
  private JPanel screen;
  private JPanel dialogue;
  private JLabel header;
  private JLabel message;
  private JPanel buttons;
  private JLabel[] buttonMessage;
  private JPanel leftButtons;
  private JPanel rightButtons;
  private ScreenLayout[] screens;
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
    screen = new JPanel(new GridLayout(2, 1));
    dialogue = new JPanel(new GridLayout(2, 1));
    header = new JLabel();
    // header.setMinimumSize(new Dimension(160, 48));
    message = new JLabel();
    dialogue.add(header);
    dialogue.add(message);
    screen.add(dialogue);
    buttons = new JPanel(new GridLayout(3, 2));
    buttonMessage = new JLabel[6];
    for(int i = 0; i < 6; i++) {
      buttonMessage[i] = new JLabel();
      buttons.add(buttonMessage[i]);
    }
    screen.add(buttons);
    add(screen, BorderLayout.CENTER);
    leftButtons = new JPanel(new GridLayout(6, 1));
    rightButtons = new JPanel(new GridLayout(6, 1));
    for(int i = 0; i < 12; i+=2) {
      if(i < 6) {
        JLabel lBlank = new JLabel();
        leftButtons.add(lBlank);
        JLabel rBlank = new JLabel();
        rightButtons.add(rBlank);
      }
      else {
        JButton l = new JButton();
        l.addActionListener(actionListener);
        l.setActionCommand(Integer.toString(i-6));
        leftButtons.add(l);
        JButton r = new JButton();
        r.addActionListener(actionListener);
        r.setActionCommand(Integer.toString(i-5));
        rightButtons.add(r);
      }
    }
    add(leftButtons, BorderLayout.LINE_START);
    add(rightButtons, BorderLayout.LINE_END);
  }

  public void setHeader(String m) {
    header.setText("<html>" + m + "</html>");
  }

  public void clearHeader() {
    header.setText("");
  }

  public void setMessage(String m) {
    message.setText("<html>" + m + "</html>");
  }

  public void clearMessage() {
    message.setText("");
  }

  public void setButtonMessage(int b, String m) {
    buttonMessage[b].setText("<html>" + m + "</html>");
  }

  public void clearButtonMessage(int b) {
    buttonMessage[b].setText("");
  }
}
