/*
    In the name ALLAH
*/

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
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
import java.lang.NullPointerException;
class object_card {
    String name , suit; 
    int value;
    BufferedImage bufferedimage;
    
    object_card (String name_ , String suit_ , int value_ , BufferedImage bimage) {
        this.name = name_; 
        this.suit = suit_;
        this.value = value_; 
        this.bufferedimage = bimage;
    }
}

public class OneCard {
    public static void main (String [] args) throws IOException {
        try {
            object_card card2 = new object_card ("2" , "spades" , 2 , ImageIO.read(new File ("2.png")));
            object_card card3 = new object_card ("3" , "spades" , 3 , ImageIO.read(new File ("3.png")));
            object_card card4 = new object_card ("4" , "spades" , 4 , ImageIO.read(new File ("4.png")));
            object_card card5 = new object_card ("5" , "spades" , 5 , ImageIO.read(new File ("5.png")));
            object_card card6 = new object_card ("6" , "spades" , 6 , ImageIO.read(new File ("6.png")));
            object_card card7 = new object_card ("7" , "spades" , 7 , ImageIO.read(new File ("7.png")));
            object_card card8 = new object_card ("8" , "spades" , 8 , ImageIO.read(new File ("8.png")));
            object_card card9 = new object_card ("9" , "spades" , 9 , ImageIO.read(new File ("9.png")));
            object_card card10 = new object_card ("10" , "spades" , 10 , ImageIO.read(new File ("10.png")));
            object_card card11 = new object_card ("Jack" , "spades" , 11 , ImageIO.read(new File ("jack.png")));
            object_card card12 = new object_card ("Queen" , "spades" , 12 , ImageIO.read(new File ("queen.png")));
            object_card card13 = new object_card ("King" , "spades" , 13 , ImageIO.read(new File ("king.png")));
            object_card card14 = new object_card ("Ace" , "spades" , 14 , ImageIO.read(new File ("ace.png")));

            object_card [] carrd = new object_card [33]; 
            carrd[0] = card2;
            carrd[1] = card3;
            carrd[2] = card4;
            carrd[3] = card5;
            carrd[4] = card6;
            carrd[5] = card7;
            carrd[6] = card8;
            carrd[7] = card9;
            carrd[8] = card10;
            carrd[9] = card11;
            carrd[10] = card12;
            carrd[11] = card13;
            carrd[12] = card14;
            //BufferedImage buttonimage = ImageIO.read(new File ("deal.png"));
            JFrame window = new JFrame ("Card....Game"); 
            JButton button = new JButton ("Deal"); 
            JLabel label1 = new JLabel (); 
            JLabel label2 = new JLabel ();
            JLabel label3 = new JLabel (); 
            JLabel label4 = new JLabel ();
            window.setSize(400 , 600);
            
            button.setBounds(150 , 250 , 70 , 40);
            
            label1.setBounds(50 , 215 , 100 , 100);
            label2.setBounds(265 , 215 , 100 , 100);
            label3.setBounds(50 , 315 , 100 , 100);
            label4.setBounds(265 , 315 , 100 , 100);
            window.add(button);
            Integer [] arr = new Integer[] {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 , 11 , 12 , 13};
            try{
                button.addActionListener(new ActionListener () {
                    public void actionPerformed (ActionEvent e) {

                        Collections.shuffle(Arrays.asList (arr));
                        
                        int findex = arr[8];
                        int sindex = arr[12];
                        object_card one = carrd[findex - 1]; 
                        object_card two = carrd[sindex - 1];
                        label1.setIcon(new ImageIcon (one.bufferedimage));
                        label2.setIcon(new ImageIcon (two.bufferedimage));
                        label3.setText(one.name + " of " + one.suit);
                        label4.setText(two.name + " of " + two.suit);
                        window.add(label1); 
                        window.add(label2); 
                        window.add(label3); 
                        window.add(label4);

                    }
                });
            } catch(NullPointerException e) {
                System.out.print("NullPointerException caught");
            }
            window.setLayout(null);
            window.setVisible(true);
        }
        catch (NullPointerException e) {
            System.out.print("nullpointerexception caught");
        }
    }
}
