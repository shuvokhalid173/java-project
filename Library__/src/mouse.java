/*
    In the name ALLAH
*/

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.Timer;
import javax.swing.*;


class Frame extends JComponent implements ActionListener , KeyListener {
    Timer tim = new Timer (5 , this);
    private int x = 0 , y = 0;
    private int vx = 5 , vy = 4;
    private int  a = 0 , b = 630;
    private int ax = 0;
    private boolean flagx = false , flagy = false , flaga = false;
    Frame () {
        addKeyListener (this); 
        setFocusable(true);
        setFocusTraversalKeysEnabled (false);
    }
    public void paintComponent (Graphics g) {
        g.setColor(Color.red);
        
        g.fillOval(x , y , 40 , 40);
        g.setColor(Color.GREEN);
        g.fillRect(a , b , 130 , 40);
        tim.start();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println ("x = " + x );
        System.out.println ("y = " + y );
        System.out.println ("a = " + a );
        System.out.println ("b = " + b );
        
        a += ax; 
        b += 0;
        
        if (x == 600 || y == 600) {
            if (x == 600) {
                flagx = true; 
            }
            if (y == 600){
                if (x >= a - 34 && x <= a + 130) {
                    flagy = true;
                    
                } 
                else {
                    //new notice ("failed"); 
                    x = 0; y = 0;
                    return ;
                }
                    
            }
        }
        if (x == 0 || y == 0) {
            if (x == 0) {
                flagx = false;
            }
            if (y == 0) {
                flagy = false;
            }
        }
        
        if (flagx == false)
        x += vx; 
        if (flagy == false)
        y += vy; 
        if (flagx == true) 
        x += -vx;
        if (flagy == true)
        y += -vy;
        
        repaint (); 
    }
    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            ax = 3;
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            ax = -3;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            ax = 4;
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            ax = -4;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            ax = 0;
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            ax = 0;
        }
        
    }
}

public class mouse extends JFrame {
    mouse () {
        setSize(700 , 700); 
        add (new Frame()); 
        setVisible (true) ; 
    }
}
