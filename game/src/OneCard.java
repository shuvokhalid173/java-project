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
import java.awt.event.MouseMotionListener;
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

public class OneCard {
    JFrame window; 
            JButton shufflebutton;
            JLabel label1 , label2 , label3 , label4 , label5 , label6 , label7 , label10 , label8 , label9; 
            JLabel casing1 , casing2 , casing3 , casing4  , casing5 ,  casing6  , casing7 , casing8 , casing9;
            JLabel casingup1 , casingup2 , casingup3 , casingup4  , casingup5 ,  casingup6  , casingup7,casingup8,casingup9;
    object_card card2 , card3 , card4 , card5 , card6 , card7 , card8 , card9 , card10 , card11 , card12 , card13 , card14;
    public OneCard () throws IOException {
        try {
            try {
            card2 = new object_card ("2" , "spades" , 2 , ImageIO.read(new File ("2.png")));
            card3 = new object_card ("3" , "spades" , 3 , ImageIO.read(new File ("3.png")));
            card4 = new object_card ("4" , "spades" , 4 , ImageIO.read(new File ("4.png")));
            card5 = new object_card ("5" , "spades" , 5 , ImageIO.read(new File ("5.png")));
            card6 = new object_card ("6" , "spades" , 6 , ImageIO.read(new File ("6.png")));
            card7 = new object_card ("7" , "spades" , 7 , ImageIO.read(new File ("7.png")));
            card8 = new object_card ("8" , "spades" , 8 , ImageIO.read(new File ("8.png")));
            card9 = new object_card ("9" , "spades" , 9 , ImageIO.read(new File ("9.png")));
            card10 = new object_card ("10" , "spades" , 10 , ImageIO.read(new File ("10.png")));
            card11 = new object_card ("Jack" , "spades" , 11 , ImageIO.read(new File ("jack.png")));
            card12 = new object_card ("Queen" , "spades" , 12 , ImageIO.read(new File ("queen.png")));
            card13 = new object_card ("King" , "spades" , 13 , ImageIO.read(new File ("king.png")));
            card14 = new object_card ("Ace" , "spades" , 14 , ImageIO.read(new File ("ace.png")));
            } catch (IOException e) {}
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
            window = new JFrame ("9 cards game"); 
            shufflebutton = new JButton ("Deal"); 
            label1 = new JLabel (); 
            label2 = new JLabel ();
            label3 = new JLabel (); 
            label4 = new JLabel ();
            label5 = new JLabel (); 
            label6 = new JLabel (); 
            label7 = new JLabel ();
            label8 = new JLabel (); 
            label9 = new JLabel (); 
            
            casing1 = new JLabel ();
            casing2 = new JLabel ();
            casing3 = new JLabel ();
            casing4 = new JLabel ();
            casing5 = new JLabel ();
            casing6 = new JLabel ();
            casing7 = new JLabel ();
            casing8 = new JLabel ();
            casing9 = new JLabel ();
            
            casingup1 = new JLabel ();
            casingup2 = new JLabel ();
            casingup3 = new JLabel ();
            casingup4 = new JLabel ();
            casingup5 = new JLabel ();
            casingup6 = new JLabel ();
            casingup7 = new JLabel ();
            casingup8 = new JLabel ();
            casingup9 = new JLabel ();
            
            window.setSize(1200, 600);
            try {
                window.setContentPane(new JLabel (new ImageIcon (ImageIO.read (new File ("backgroundimagee.jpg")))));
            } catch (IOException e) {
                System.out.println ("image is not exist .. "); 
            }
            
            shufflebutton.setBounds(365 , 500 , 70 , 40);
            shufflebutton.setIcon(new ImageIcon (ImageIO.read(new File ("deal.png"))));
            label1.setBounds(40 , 200 , 100 , 100); // carry first card 
            label2.setBounds(100 , 200 , 100 , 100); // carry second card 
            label3.setBounds(160 , 200 , 100 , 100);
            label4.setBounds(530 , 200 , 100 , 100);  // sign
            label5.setBounds(590 , 200 , 100 , 100); 
            label6.setBounds(650 , 200 , 100 , 100);
            label1.setText("this is ");
            ImageIcon defultIcon = new ImageIcon (ImageIO.read(new File ("Capture.png"))); 
            
            label8.setBounds(40 , 365 , 100 , 40);
            label9.setBounds(255 , 365 , 100 , 40);
            label7.setBounds(150 , 50 , 100 , 40);
            
            

            label1.setIcon(defultIcon);
            label2.setIcon(defultIcon);

            //label3.setText(one.name + " of " + one.suit);
            //label4.setText(two.name + " of " + two.suit);

            label3.setIcon(defultIcon);

            label4.setIcon(defultIcon);
            label5.setIcon(defultIcon);
            label6.setIcon(defultIcon);

           
            /**
             * 
             * casing setup ....
             */
            
            casing1.setBounds(30 , 400 , 100 , 100);
            casing2.setBounds(110 , 400 , 100 , 100);
            casing3.setBounds(190 , 400 , 100 , 100);
            casing4.setBounds(270 , 400 , 100 , 100);
            casing5.setBounds(350 , 400 , 100 , 100);
            casing6.setBounds(430 , 400 , 100 , 100);
            casing7.setBounds(510 , 400 , 100 , 100);
            casing8.setBounds(590 , 400 , 100 , 100);
            casing9.setBounds(670 , 400 , 100 , 100);
            //casing1.setBounds(780 , 400 , 100 , 100);
            /**
             * casing setup end...
             * image setup ..
             */
            
            casing1.setIcon(defultIcon);
            casing2.setIcon(defultIcon);
            casing3.setIcon(defultIcon);
            casing4.setIcon(defultIcon);
            casing5.setIcon(defultIcon);
            casing6.setIcon(defultIcon);
            casing7.setIcon(defultIcon);
            casing8.setIcon(defultIcon);
            casing9.setIcon(defultIcon);
            
            /**
             * image setup ...
             */
            
            
            casingup1.setBounds(40 , 300 , 100 , 100);
            casingup2.setBounds(100 , 300 , 100 , 100);
            casingup3.setBounds(160 , 300 , 100 , 100);
            casingup4.setBounds(285 , 300 , 100 , 100);
            casingup5.setBounds(345 , 300 , 100 , 100);
            casingup6.setBounds(405 , 300 , 100 , 100);
            casingup7.setBounds(530 , 300 , 100 , 100);
            casingup8.setBounds(590 , 300 , 100 , 100);
            casingup9.setBounds(650 , 300 , 100 , 100);
            
            
            casingup1.setIcon(defultIcon);
            casingup2.setIcon(defultIcon);
            casingup3.setIcon(defultIcon);
            casingup4.setIcon(defultIcon);
            casingup5.setIcon(defultIcon);
            casingup6.setIcon(defultIcon);
            casingup7.setIcon(defultIcon);
            casingup8.setIcon(defultIcon);
            casingup9.setIcon(defultIcon);
            
            
            
            Integer [] arr = new Integer[] {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 , 11 , 12 , 13};
          //  try{
                
            shufflebutton.addActionListener(new ActionListener () {

                public void actionPerformed (ActionEvent e) {
                  //  System.out.println ("deal no. " + counter);
                    Collections.shuffle(Arrays.asList (arr));

                    int index_1st = arr[8];
                    int index_2nd = arr[12];
                    int index_3rd = arr[2]; 


                    int index_4th = arr[1];
                    int index_5th = arr[3];
                    int index_6th = arr[6]; 

                    int index_7th = arr[9];
                    int index_8th = arr[11];
                    int index_9th = arr[10]; 

                    object_card one = carrd[index_1st - 1]; 
                    object_card two = carrd[index_2nd - 1];
                    object_card three = carrd[index_3rd - 1]; 

                    object_card four = carrd[index_4th - 1]; 
                    object_card five = carrd[index_5th - 1];
                    object_card six = carrd[index_6th - 1]; 

                    object_card seven = carrd[index_7th - 1]; 
                    object_card eight = carrd[index_8th - 1];
                    object_card nine = carrd[index_9th - 1]; 

                    casing1.setIcon(new ImageIcon (one.bufferedimage));
                    casing2.setIcon(new ImageIcon (two.bufferedimage));
                    casing3.setIcon(new ImageIcon (three.bufferedimage));
                    casing4.setIcon(new ImageIcon (four.bufferedimage));
                    casing5.setIcon(new ImageIcon (five.bufferedimage));
                    casing6.setIcon(new ImageIcon (six.bufferedimage));
                    casing7.setIcon(new ImageIcon (seven.bufferedimage));
                    casing8.setIcon(new ImageIcon (eight.bufferedimage));
                    casing9.setIcon(new ImageIcon (nine.bufferedimage));
                }   
            });
            //} catch(NullPointerException e) {
              //  System.out.print("NullPointerException caught");
            //}
            
            myTransferHandler my_transfer_handler = new myTransferHandler ("icon"); 
            MouseMotionListener mouselistener = new MouseMotionListener () {

                @Override
                public void mouseDragged(MouseEvent e) {
                    JComponent jcomp = (JComponent) e.getSource(); 
                    TransferHandler thand = jcomp.getTransferHandler(); 
                    thand.exportAsDrag(jcomp, e, TransferHandler.COPY);
                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

                @Override
                public void mouseMoved(MouseEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
                
            }; 
            casing1.setTransferHandler(my_transfer_handler);
            casing2.setTransferHandler(my_transfer_handler);
            casing3.setTransferHandler(my_transfer_handler);
            casing4.setTransferHandler(my_transfer_handler);
            casing5.setTransferHandler(my_transfer_handler);
            casing6.setTransferHandler(my_transfer_handler);
            casing7.setTransferHandler(my_transfer_handler);
            casing8.setTransferHandler(my_transfer_handler);
            casing9.setTransferHandler(my_transfer_handler);
            casingup1.setTransferHandler(my_transfer_handler);
            casingup2.setTransferHandler(my_transfer_handler);
            casingup3.setTransferHandler(my_transfer_handler);
            casingup4.setTransferHandler(my_transfer_handler);
            casingup5.setTransferHandler(my_transfer_handler);
            casingup6.setTransferHandler(my_transfer_handler);
            casingup7.setTransferHandler(my_transfer_handler);
            casingup8.setTransferHandler(my_transfer_handler);
            casingup9.setTransferHandler(my_transfer_handler);
            
            
            casing1.addMouseMotionListener(mouselistener);
            casing2.addMouseMotionListener(mouselistener);
            casing3.addMouseMotionListener(mouselistener);
            casing4.addMouseMotionListener(mouselistener);
            casing5.addMouseMotionListener(mouselistener);
            casing6.addMouseMotionListener(mouselistener);
            casing7.addMouseMotionListener(mouselistener);
            casing8.addMouseMotionListener(mouselistener);
            casing9.addMouseMotionListener(mouselistener);
            casingup1.addMouseMotionListener(mouselistener);
            casingup2.addMouseMotionListener(mouselistener);
            casingup3.addMouseMotionListener(mouselistener);
            casingup4.addMouseMotionListener(mouselistener);
            casingup5.addMouseMotionListener(mouselistener);
            casingup6.addMouseMotionListener(mouselistener);
            casingup7.addMouseMotionListener(mouselistener);
            casingup8.addMouseMotionListener(mouselistener);
            casingup9.addMouseMotionListener(mouselistener);
            
            window.add(label8); 
            window.add(label9);
            
            window.add(shufflebutton);
            window.add(casing1);window.add(casing2);
            window.add(casing3);window.add(casing4);
            window.add(casing5);window.add(casing6);
            window.add(casing7);window.add(casing8);
            window.add(casing9);
            
            
            window.add(casingup1);window.add(casingup2);
            window.add(casingup3);window.add(casingup4);
            window.add(casingup5);window.add(casingup6);
            window.add(casingup7);window.add(casingup8);
            window.add(casingup9);
            
            window.add(label1);
            window.add(label2); 
            window.add(label3); 
            window.add(label4); 
            window.add(label5); 
            window.add(label6);
            window.pack();
            window.setLayout(null);
            window.setVisible(true);
        }
        catch (NullPointerException e) {
            System.out.print("nullpointerexception caught");
        }
    }
    public static void main (String [] args) throws IOException {
        new OneCard (); 
    }
}
