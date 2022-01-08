package date_app;

import java.applet.Applet;
import static java.lang.Thread.sleep;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abdelrahman Yousry
 */
public class MyThread extends Thread {

    Date d;
    Applet a;

    public MyThread(Applet myapp) {
        a = myapp;
    }

    /*
    I should override the run method
     */
    @Override
    public void run() {
        while (true) {

            a.repaint();// this method clear the applet and then calling the paint() method again
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
