/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Applet.java to edit this template
 */
package date_app;

import java.applet.Applet;
import java.awt.Graphics;
import static java.lang.Thread.sleep;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author U3
 */
public class NewTh extends Applet implements Runnable {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    @Override
    public void init() {
        Thread myth = new Thread(this);
        myth.start();
    }
    @Override
    public void paint(Graphics g) {
        Date d = new Date();
        g.drawString(d.toString(), 10, 50);
    }
    // TODO overwrite start(), stop() and destroy() methods
    @Override
    public void run() {
        while (true) {

            repaint();// this method clear the applet and then calling the paint() method again
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
            }
// g.drawString(d.toString(), 10, 50); I can't do this because in this class I haven't obj from graphics class
// which has been created by the JVM and thend send me refrence to in the method paint 
        }
    }
}
