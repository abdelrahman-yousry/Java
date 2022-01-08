package marquee_string;

import date_app.MyThread;
import java.applet.Applet;
import java.awt.Graphics;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abdelrahman Yousry
 */
public class Marquee extends Applet implements Runnable {

    int x = 100;
    int w = this.getWidth();
    int h = this.getHeight();
    int y = 100;
    String s;

    @Override
    public void init() {
        Thread myth = new Thread(this);
        myth.start();
    }

    @Override
    public void paint(Graphics g) {
        s = "Hello Java";
        g.drawString(s, x, y);
        w = this.getWidth();
        h = this.getHeight();
    }

    @Override
    public void run() {
        while (true) {
            repaint();
            x = x + 10;
            if (x > w) {
                x = 0;
                y += 10;
                if (y > h) {
                    y = 0;
                }
            }
            try {
                sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
