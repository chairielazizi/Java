/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication53;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author user
 */
public class JavaApplication53 extends JPanel {
   public void paint(Graphics g) {
      g.setFont(new Font("",0,100));
      FontMetrics fm = getFontMetrics(new Font("",0,100));
      String s = "message";
      int x = 5;
      int y = 5;
      
      for (int i = 0; i < s.length(); i++) {
         char c = s.charAt(i);
         int h = fm.getHeight();
         int w = fm.charWidth(c);
         
         g.drawRect(x, y, w, h);
         g.drawString(String.valueOf(c), x, y + h);
         x = x + w;
      }
   }
   public static void main(String[] args) {
      JFrame frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new JavaApplication53());
      frame.setSize(500, 700);
      frame.setVisible(true);
   }
}