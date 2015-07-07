package com.saxbophone.bankofsaxby;

import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;


public class MachineDemo {
  public static void main(String[] args) {
    JFrame screen = new JFrame("ATM Machine Demo");
    screen.setSize(1024, 480);
    screen.setLayout(new GridLayout(1, 2));
    screen.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent windowEvent){
        System.exit(0);
      }
    });
    GuiAtmScreen atm = new GuiAtmScreen();
    GuiPinpad pad = new GuiPinpad();
    screen.add(atm);
    screen.add(pad);
    screen.setVisible(true);
    pad.startCapture();
  }
}
