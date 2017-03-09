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
 * this simple class return the value of three card 
 * for example , firstly it will check what the three card is from the ThreeCardChecker class ? 
 * then it will assign a constant value for it;
 * the values are .... 
 * 
 * Tray --- 6
 * Running --- 5
 * Run --- 4
 * Color --- 3
 * Twin --- 2
 * General --- 1
 */

public class ValueFromChecker {
    public ThreeCard first_3_card , second_3_card;
    
    ValueFromChecker (ThreeCard aaa , ThreeCard bbb) {
        this.first_3_card = aaa;
        this.second_3_card = bbb;
    }
    public int getFirstCardValue () {
        ThreeCardChecker checker_ = new ThreeCardChecker (first_3_card);
        if (checker_.Tray() == true) {
            return 6;
        }
        else if (checker_.Runnning() == true) {
            return 5;
        }
        else if (checker_.Run() == true) {
            return 4; 
        }
        else if (checker_.Color() == true) {
            return 3; 
        }
        else if (checker_.Twin() == true) {
            return 2;
        }
        else {
            return 1;
        }
        
    }
    
    public int getSecondCardValue () {
        ThreeCardChecker checker__ = new ThreeCardChecker (second_3_card);
        if (checker__.Tray() == true) {
            return 6;
        }
        else if (checker__.Runnning() == true) {
            return 5;
        }
        else if (checker__.Run() == true) {
            return 4; 
        }
        else if (checker__.Color() == true) {
            return 3; 
        }
        else if (checker__.Twin() == true) {
            return 2;
        }
        else {
            return 1;
        }
        
    }
   
    /// operator overloading need here ...
    public int getLargeCardWhenEqual () {
        int frr [] = new int [4]; 
        int srr [] = new int [4]; 
        
        frr[0] = first_3_card.first_card.value; 
        frr[1] = first_3_card.second_card.value;
        frr[2] = first_3_card.third_card.value;
        
        srr[0] = second_3_card.first_card.value; 
        srr[1] = second_3_card.second_card.value;
        srr[2] = second_3_card.third_card.value;
        
        Arrays.sort(frr , 0 , 3);
        Arrays.sort(srr , 0 , 3);
        
        if (frr[2] > srr[2]) {
            return 1; 
        }
        else {
            if (srr[2] > frr[2]) {
                return 2;
            }
            else {
                if (frr[1] > srr[1]) {
                    return 1; 
                }
                else {
                    if (srr[1] > srr[1]) {
                        return 2; 
                    }
                    else {
                        if (frr[0] > srr[0]) {
                            return 1; 
                        }
                        else {
                            if (srr[0] > frr[0]) {
                                return 2;
                            }
                            
                            else {
                                return 0;
                            }
                        }
                    }
                }
            }
        }
    }
    public ThreeCard greaterTwin () {
        int ffv = first_3_card.first_card.value;
        int fsv = first_3_card.second_card.value;
        int ftv = first_3_card.third_card.value;
        
        int sfv = second_3_card.first_card.value;
        int ssv = second_3_card.second_card.value;
        int stv = second_3_card.third_card.value;
        
        int frr [] = new int [3];
        int srr [] = new int [3];
        frr[0] = ffv; frr[1] = fsv;  frr[2] = ftv; 
        srr[0] = sfv; srr[1] = ssv;  srr[2] = stv;
        Arrays.sort(frr , 0 , 3);
        Arrays.sort(srr , 0 , 3);
        int fp1 , fp2 , sp1 ,  sp2 , ft , st ;// take the pairing card .
        if (frr[0] == frr[1]) {
            fp1 = 0; fp2 = 1;
            ft = 2;
        }
        else {
            fp1 = 1; fp2 = 2;
            ft = 0;
        }
        if (srr[0] == srr[1] ) {
            sp1 = 0; sp2 = 1;
            st = 2;
        }
        else {
            sp1 = 1; sp2 = 2;
            st = 0;
        }
        if (frr[fp1] > srr[sp1]) {
            return first_3_card;
        }
        else if (srr[sp1] > frr[fp1]) {
            return second_3_card;
        }
        else {
            if (frr[ft] > srr[st]) {
                
                return first_3_card;
            }
            else {
                return second_3_card;
            }
        }
    }
    public ThreeCard MaxThreeCard () {
        int x = getFirstCardValue (); 
        int y = getSecondCardValue (); 
        System.out.println ("first card value = " + x + " second card value = " + y); 
        if (x > y) {
            return first_3_card; 
        }
        else if (x < y) {
            return second_3_card; 
        }
        else  {
            if (x == 2) {
                return greaterTwin();
            }
            int z = getLargeCardWhenEqual ();
            if (z == 1) {
                return first_3_card; 
            }
            else {
                return second_3_card; 
            }
        }
    }
    /**
    public static void main (String [] args) throws IOException {
        DeckOfCards doc = new DeckOfCards ();
        object_card arra [] = new object_card [55]; 
        arra = doc.carrd;
        ThreeCard a = new ThreeCard (arra[1] , arra[14] , arra[0]); 
        ThreeCard b = new ThreeCard (arra[2] , arra[15], arra[11]); 
        ValueFromChecker  ch = new ValueFromChecker (a , b); 
        ThreeCard tc = ch.MaxThreeCard();
        System.out.println (tc.first_card.name +  " " + tc.first_card.suit + " "  + tc.first_card.value);
        
        System.out.println (tc.first_card.name +  " " + tc.second_card.suit + " "  + tc.second_card.value);
        
        System.out.println (tc.first_card.name +  " " + tc.third_card.suit + " "  + tc.third_card.value);
    }**/
}
