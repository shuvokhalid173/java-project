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
 * this class will get three card object and divide each card into one card 
 * and it will also check whether it is Tray , running , run , color , twin or normal  in a three card fashion 
 * 
 * @author shuvo
 */


public class ThreeCardChecker {
    public ThreeCard three_card;
    public object_card a  , b , c;
    ThreeCardChecker (ThreeCard three_card) {
        this.three_card = three_card;
        a = three_card.first_card; 
        b = three_card.second_card; 
        c = three_card.third_card;
    }
    public boolean Tray () {
        if (a.value == b.value && b.value == c.value) {
            return true;
        }
        else {
            return false;
        }
    }
    
    
    public boolean Run () {
        int av , bv , cv; 
        av = a.value; 
        bv = b.value; 
        cv = c.value;
        int brr [] = new int [4]; 
        brr[0] = av; brr[1] = bv; brr[2] = cv;
        Arrays.sort(brr , 0 , 3);
       
        if (brr[0] + 1 == brr[1] && brr[1] + 1 == brr[2]) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean Color () {
        if (a.suit == b.suit && b.suit == c.suit) {
            return true;
        }
        else {
            return false;
        }
        
    }
    
    public boolean Runnning () {
       if (a.suit == b.suit && b.suit == c.suit) {
          int av , bv , cv; 
            av = a.value; 
            bv = b.value; 
            cv = c.value;
            int brr [] = new int [4]; 
            brr[0] = av; brr[1] = bv; brr[2] = cv;
            Arrays.sort(brr , 0 , 3);

            if (brr[0] + 1 == brr[1] && brr[1] + 1 == brr[2]) {
                return true;
            }
            else {
                return false;
            }  
        }
        else {
            return false;
        }
        
    }
    
    public boolean Twin () {
        //Arrays.sort(arr);
        if (a.value == b.value || a.value == c.value || b.value == c.value) {
            if (Tray () == false) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
    
}