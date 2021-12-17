/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Applet.java to edit this template
 */
package day3_lab1_font_applet;

import java.applet.Applet;
import java.awt.Color;
import static java.awt.Color.RED;
import java.awt.Font;
import java.awt.Graphics ;
import java.awt.Toolkit;
/**
 * @author Abdelrahaman Yousry
 */
public class HelloApplet extends Applet {
 @Override
 public void paint (Graphics g)
 {
     Color color = new Color(255, 0, 0);
     String[] s = Toolkit.getDefaultToolkit().getFontList();
     Font f = new Font(s[0],1,30);
     g.setFont(f);
     g.setColor(color);
     g.drawString("Abdelrahman U3 say Hello to everyone ",100,50);
 }
}
