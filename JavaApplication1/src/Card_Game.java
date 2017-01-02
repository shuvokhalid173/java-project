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

public class Card_Game {
    
    public static void main (String [] args) {
        ImageIcon i = new ImageIcon ("G:\\cardimage.png");
        Cards card = new Cards ("ace" , "spades" , 14 , i);
        Moves cardmove = new Moves (0 , 0 , 4 , 4 , 400 , 400 ,card);
        ImageIcon ii = new ImageIcon ("G:\\button.png");
        Cards card1 = new Cards ("ace" , "spades" , 2 , ii);
        ball_moving ball = new ball_moving (700 , 0 , -4 , 4 , card1);
        //System.out.println (cardmove.x_axis + " " + cardmove.y_axis +  " " + cardmove.vel_x_axis + " " + cardmove.vel_y_axis);
        JFrame frame = new JFrame ("card moving "); 
        frame.setSize(700 , 700);
        frame.add(cardmove);
        //frame.add (ball);
        //frame.setLayout(null);
        frame.setVisible(true);
    }
}
