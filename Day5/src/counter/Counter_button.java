
package counter;


import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Abdelrahman Yousry
 */

public class Counter_button extends Applet {
    int x ;
    Button i ;
    Button d ;
    @Override
    public void init() {
        // TODO start asynchronous download of heavy resources
        i = new Button("Increment");
        i.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
               if (x<10){
                   x++;
               }
               if (x<=10)
                {
                    repaint();
                }
            }
        });
        d= new Button("Decrement");
        d.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
             if (x>0)
             {
                 x-- ;
             } 
             if (x<=10)
             {
                 repaint();
             }
            } 
        });
        
        add(i);
        add(d);
        
    }
    @Override
    public void paint (Graphics g)
    {
        g.drawString("Click Count is:" + x, 50, 200);
    }
    
    class MyButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ev){
            x++ ;
            repaint() ;
        }
}
}