/*
    In the name ALLAH
*/

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
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

public class ball_moving extends JPanel implements ActionListener , KeyListener , MouseMotionListener {
    private int x  ,y; 
    ball_moving () {
        addMouseMotionListener (this); 
        addKeyListener (this); 
        setFocusable(true);
        setFocusTraversalKeysEnabled (false);
    }
    public void paintComponent (Graphics g) {
        g.setColor(Color.red);
        g.fillOval(x, y, 4 , 4);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
        //repaint (); 
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            x -= 1;
            y += 0; 
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            x += 1;
            y += 0; 
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            x += 0;
            y += 1; 
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            x += 0;
            y -= 1; 
        }
        repaint (); 
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            x -= 1;
            y += 0; 
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            x += 1;
            y += 0; 
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            x += 0;
            y += 1; 
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            x += 0;
            y -= 1; 
        }
        repaint (); 
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        x += 0; 
        y += 0;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public void mouseDragged(MouseEvent e) {
        x = (int) e.getPoint().getX();
        y = (int) e.getPoint().getY();
        repaint (); 
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main (String [] args) {
        JFrame f = new JFrame (); 
        f.setSize(500 , 500);
        f.add(new ball_moving ()); 
        f.setVisible(true);
    }
}

