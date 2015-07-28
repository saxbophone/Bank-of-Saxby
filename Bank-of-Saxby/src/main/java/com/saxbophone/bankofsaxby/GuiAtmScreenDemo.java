package com.saxbophone.bankofsaxby;

import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;


public class GuiAtmScreenDemo {
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
    atm.setHeader("Ultra-Mega-Corp Ltd ATM Machine");
    atm.setMessage("This ATM Machine is currently out of service.");
    atm.setButtonMessage(0, "This is Button 0");
    atm.setButtonMessage(1, "This is Button 1");
    atm.setButtonMessage(2, "This is Button 2");
    atm.setButtonMessage(3, "This is Button 3");
    atm.setButtonMessage(4, "This is Button 4");
    atm.setButtonMessage(5, "This is Button 5");
    GuiPinpad pad = new GuiPinpad();
    screen.add(atm);
    screen.add(pad);
    screen.setVisible(true);
    pad.startCapture();
  }
}
