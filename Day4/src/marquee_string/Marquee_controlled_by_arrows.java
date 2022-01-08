/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Applet.java to edit this template
 */
package marquee_string;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Abdelrahman Yousry
 */
public class Marquee_controlled_by_arrows extends Applet {

    int x = 50;
    int y = 50;

    @Override
    public void init() {
        int w = this.getWidth();
        int h = this.getHeight();
        this.requestFocus();
        addKeyListener(
                new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (x > w) {
                    x = 0;

                }
                if (y > h) {
                    y = 0;
                }

                if (e.getKeyCode() == e.VK_RIGHT) {
                    x += 10;
                } else if (e.getKeyCode() == e.VK_LEFT) {
                    x -= 10;
                }

                if (e.getKeyCode() == e.VK_UP) {
                    y -= 10;
                } else if (e.getKeyCode() == e.VK_DOWN) {
                    y += 10;
                }
                repaint();
            }

            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        }
        );
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Hello world", x, y);

    }

}
