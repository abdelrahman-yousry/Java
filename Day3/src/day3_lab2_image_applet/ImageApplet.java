/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Applet.java to edit this template
 */
package day3_lab2_image_applet;
import java.awt.Graphics;
import java.applet.Applet;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Abdelrahman Yousry
 */
public class ImageApplet extends Applet {

    BufferedImage img ;
    @Override
    public void init() {
        // TODO start asynchronous download of heavy resources   
        img = null ;
    }
    
    @Override
    public void paint (Graphics g)
    {
        try {
            /*ImageIO is a class have method read to read images and return refrence BufferedImage
            class and take an input param obj from class called file   
            **/
            File file = new File("U3.jpeg");
            img = ImageIO.read(file);     
            int w =this.getWidth(); // we use this becasue it is a refrence to the applet class and we want the width and hight of this applet
            int h =this.getHeight();
            g.drawImage(img, 0, 0,w,h,null);
            
        }catch(IOException e1)
        {
            g.setFont(new Font ("Dialog",2,50));
            g.drawString("Img not found", 50, 50);
        }
    }
}
