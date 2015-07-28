package com.saxbophone.bankofsaxby;

import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;


public class ScreenLayoutDemo {
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
    ScreenLayout layout = new ScreenLayout(
        "Ultra-Mega-Corp Ltd ATM Machine",
        "Please select an option below",
        new String[] {
          "Show Balance",
          "Withdraw Cash",
          "Print Advice Slip",
          "Go A.W.O.L.",
          "See a Doctor",
          "More Options"
        },
        new int[] {
          0, 0, 0, 0, 0, 0
        });
    atm.addLayout(layout);
    GuiPinpad pad = new GuiPinpad();
    screen.add(atm);
    screen.add(pad);
    screen.setVisible(true);
    pad.startCapture();
    layout.render();
  }
}
