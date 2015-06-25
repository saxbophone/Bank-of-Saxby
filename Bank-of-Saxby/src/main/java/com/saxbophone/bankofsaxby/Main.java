package com.saxbophone.bankofsaxby;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.GridLayout;
import javax.swing.JFrame;


/*
 * Bank-of-Saxby - A fake simulated ATM Machine
 * Written by Joshua Saxby 2015 - See LICENSE in the root of this
 * repository for more information.
 */


public class Main {
  /*
   * This class is the main entry point for the whole application.
   */
  public static void main(String[] args) {
    JFrame screen = new JFrame("Bank of Saxby v0.0.0");
    screen.setSize(640, 480);
    screen.setLayout(new GridLayout());
    screen.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent windowEvent){
        System.exit(0);
      }
    });
    screen.setVisible(true);
  }
}
