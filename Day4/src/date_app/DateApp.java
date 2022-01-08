package date_app;

import java.applet.Applet;
import java.awt.Graphics;
import java.util.Date;

/**
 *
 * @author Abdelrahman Yousry
 */
/*The Third Method
* This applet will update the date very fast so you will not observe this
* and also the the previous dates will not be deleted because you didn't 
* call the repaint() method .. and the while(1) will take the execution and 
* you will not even have the ability to terminate the program
 */
public class DateApp extends Applet {

    @Override
    public void init() {
        MyThread myth = new MyThread(this);
        myth.start();
    }

    @Override
    public void paint(Graphics g) {
        Date d = new Date();
        g.drawString(d.toString(), 10, 50);
    }

}
/*First wrong Method
* This applet will show the date at the time you will run the applet
* but then will not update the date because it will be called once by the JVM
 */
//public class DateApp extends Applet {
//
//    Date d;
//
//    @Override
//    public void init() {
//        d = new Date();
//    }
//
//    @Override
//    public void paint(Graphics g) {
//        g.drawString(d.toString(), 10, 50);
//    }
//}

/*Second wrong Method
* This applet will update the date very fast so you will not observe this
* and also the the previous dates will not be deleted because you didn't 
* call the repaint() method .. and the while(1) will take the execution and 
* you will not even have the ability to terminate the program
 */
//public class DateApp extends Applet {
//    Date d;
//    @Override
//    public void init() {
//    }
//    @Override
//    public void paint(Graphics g) {
//
//        while (true) {
//            d = new Date();
//            g.drawString(d.toString(), 10, 50);
//        }
//    }
//}
