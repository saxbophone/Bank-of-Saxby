package com.saxbophone.bankofsaxby;

import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;


public class PinpadDemo {
  public static void main(String[] args) {
    JFrame screen = new JFrame("Pinpad Demo");
    screen.setSize(640, 480);
    screen.setLayout(new GridLayout());
    screen.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent windowEvent){
        System.exit(0);
      }
    });
    GuiPinpad pad = new GuiPinpad();
    screen.add(pad);
    screen.setVisible(true);
    pad.startCapture();
  }
}
