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

public class Moves extends JComponent implements ActionListener {
   Timer t = new Timer (5 , this); 
    private int x_axis , y_axis , vel_x , vel_y , x_end , y_end;
    Cards card;
    Moves (int x_ , int y_ , int vxx , int vyy , int xe , int ye, Cards c) {
        this.x_axis = x_; 
        this.y_axis = y_; 
        this.vel_x = vxx; 
        this.vel_y = vyy; 
        this.x_end = xe; 
        this.y_end = ye; 
        this.card = c;
    }
    public void paintComponent (Graphics g) {
        g.setColor(Color.red);
        card.icon.paintIcon(this, g, x_axis, y_axis);
        t.start();
    } 
    public void actionPerformed (ActionEvent e) {
        x_axis += vel_x; 
        y_axis += vel_y;
        
        repaint();
    }
}

