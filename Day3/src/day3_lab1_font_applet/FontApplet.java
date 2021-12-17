/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Applet.java to edit this template
 */
package day3_lab1_font_applet;

import java.applet.Applet;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
/**
 * @author Abdelrahman Yousry
 */
public class FontApplet extends Applet {
    @Override
    public void paint(Graphics g) {
        GraphicsEnvironment ge;  
        ge = GraphicsEnvironment.getLocalGraphicsEnvironment();  
        String[] fNames;
        fNames = ge.getAvailableFontFamilyNames();
        Font f ;
        int y = 50;
        for (String s : fNames) {
            f = new Font(s,1,12);
            g.setFont(f);
            g.drawString("hello java with "+s, 50, y);
            y+=10 ;
        }
    }
}
