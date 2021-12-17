/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Applet.java to edit this template
 */
package day3_lab3_abajora_applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Abdelrahman Yousry
 */
public class abajora extends Applet {

    @Override
    public void paint (Graphics g)
    {
        int w =this.getWidth();
        int h =this.getHeight();
        //left oval
        g.setColor(Color.yellow);
        g.fillOval(w/3, h/4, w/4, h/6);
        g.setColor(Color.black);
        g.drawOval(w/3, h/4, w/4, h/6);
        g.setColor(Color.yellow);
        g.fillOval(w/3, (h/2), w/21, h/8);
        g.setColor(Color.black);
        g.drawOval(w/3, (h/2), w/21, h/8);
        //right oval
        g.setColor(Color.yellow);
        g.fillOval((w/2)+w/24, (h/2), w/21, h/8);
        g.setColor(Color.black);
        g.drawOval((w/2)+w/24, (h/2), w/21, h/8);
        // mid oval
        g.setColor(Color.yellow);
        g.fillOval((w/2)-w/12, (h/2)-h/18, w/12, h/4);
        g.setColor(Color.black);
        g.drawOval((w/2)-w/12, (h/2)-h/18, w/12, h/4);    
        //Line 1 left
        g.drawLine(w/3+(w/250), h/4+(h/16), (w/4)+(w/32), (h/4)+((h/2)-h/12));
        // Line 2 right
        g.drawLine(w/2+(w/13)+w/200, h/4+(h/18), (w/2)+(w/8), (h/4)+((h/2)-h/16));
        // arc
        g.drawArc(w/4+(w/30), (h/4)+((h/2)-h/6), ((w/2)+(w/8))-((w/4)+(w/32)), h/6, 180, 180);
        // rect
        g.drawRect(w/4+(w/15),h-(h/10) , w/4, h/30);
        //lines
        g.drawLine(w/3+(w/8), h/2+(h/4), (w/3)+(w/20), (h/2)+(h/2)-h/10);
        //lines
        g.drawLine(w/3+(w/8), h/2+(h/4), (w/2)+(w/80), (h/2)+(h/2)-h/10);
        
    }
}
