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
/**
 *
 * @author shuvo
 */
public class mainMenu {
    JFrame mainframe; 
    JButton nbtn , obtn , sbtn , ebtn;
    public mainMenu () {
        mainframe = new JFrame ("9 cards game"); 
        mainframe.setSize(400 , 600);
        try {
            mainframe.setContentPane(new JLabel (new ImageIcon (ImageIO.read (new File ("window_background.png")))));
        } catch (IOException e) {
            System.out.println ("image is not exist .. "); 
        }
        nbtn = new JButton ("New Game");
        obtn = new JButton ("Option");
        sbtn = new JButton ("Settings");
        ebtn = new JButton ("Exit");
        nbtn.setBounds (150 , 200 , 100 , 50);
        obtn.setBounds (150 , 250 , 100 , 50);
        sbtn.setBounds (150 , 300 , 100 , 50);
        ebtn.setBounds (150 , 350 , 100 , 50);
        nbtn.addActionListener(new ActionListener () {
            public void actionPerformed (ActionEvent e) {
                try {
                    OneCard cc = new OneCard ();
                } catch (IOException ex) {
                    //Logger.getLogger(mainMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
        ebtn.addActionListener(new ActionListener () {
            public void actionPerformed (ActionEvent e) {
                mainframe.setVisible(false);
            }
        });
        mainframe.setLayout(null);
        mainframe.add(nbtn); 
        mainframe.add(obtn); 
        mainframe.add(sbtn); 
        mainframe.add(ebtn); 
        mainframe.setVisible(true);
    }
    public static void main (String args [] ) {
        new mainMenu ();
    }
}
