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
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.Timer;
import javax.swing.*;

public class ball_moving extends JComponent implements ActionListener {
    public static void main (String [] args) {
        JFrame frame = new JFrame (); 
        frame.setSize(700 , 700);
        ImageIcon iiii = new ImageIcon ("G:\\cardimage.png");
        Cards cdd = new Cards ("ace" , "spades" , 14 , iiii);
        ball_moving oop = new ball_moving (4 , 4 , 4 , 4 , cdd);
        frame.add(oop);
        frame.setVisible(true);
    }
    
    Timer t = new Timer (5 , this); 
    private int x , y , vx , vy;
    Cards cd;
    ball_moving (int x_ , int y_ , int vxx , int vyy  , Cards c) {
        this.x = x_; 
        this.y = y_;
        this.vx = vxx; 
        this.vy = vyy; 
        this.cd = c;
    }
    public void paintComponent (Graphics g) {
        g.setColor(Color.red);
        cd.icon.paintIcon(this, g, x, y);
        t.start();
    } 
    private boolean flag = false;
    private int tx = x , ty = y;
    public void actionPerformed (ActionEvent e) {
        x += vx; 
        y += vy;
        repaint();
    }
}

