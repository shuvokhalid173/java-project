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

class kard {
    String nam , sut; 
    int val;
    kard (String n,String s ,int v) {
        this.nam = n;
        this.sut = s;
        this.val= v;
    }
}

class check {
    public kard a , b , c;
    check (kard aa , kard bb , kard cc) {
        this.a = aa; 
        this.b = bb;
        this.c = cc;
    }
    
    public boolean Tray () {
        if (a.val == b.val && b.val == c.val) {
            return true;
        }
        else {
            return false;
        }
    }
    
    
    public boolean Run () {
        int av , bv , cv; 
        av = a.val; 
        bv = b.val; 
        cv = c.val;
        int brr [] = new int [4]; 
        brr[0] = av; brr[1] = bv; brr[2] = cv;
        Arrays.sort(brr , 0 , 2);
        for (int i = 0; i < 3; i++){
            System.out.println(brr[i]);
        }
        if (brr[0] + 1 == brr[1] && brr[1] + 1 == brr[2]) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean Color () {
        if (a.sut == b.sut && b.sut == c.sut) {
            return true;
        }
        else {
            return false;
        }
        
    }
    
    public boolean Runnning () {
        boolean x = Run (); 
        boolean y = Color (); 
        if (x == true && y == true) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean Twin () {
        //Arrays.sort(arr);
        if (a.val == b.val || a.val == c.val || b.val == c.val) {
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

public class NewClass {
    public static void main (String [] args) {
        kard c2 = new kard ("2" , "spades" , 2);
        kard c3 = new kard ("3" , "spades" , 3);
        kard c4 = new kard ("4" , "spades" , 4);
        kard c5 = new kard ("5" , "spades" , 5);
        kard c6 = new kard ("6" , "spades" , 6);
        kard c7 = new kard ("7" , "spades" , 7);
        kard c8 = new kard ("8" , "spades" , 8);
        kard c9 = new kard ("9" , "spades" , 9);
        kard c10 = new kard ("10" , "spades" , 10);
        kard c11 = new kard ("Jack" , "spades" , 11);
        kard c12 = new kard ("Queen" , "spades" , 12);
        kard c13 = new kard ("King" , "spades" , 13);
        kard c14 = new kard ("Ace" , "spades" , 14);
        
        
	kard cc2 = new kard ("2" , "hearts" , 2);
        kard cc3 = new kard ("3" , "hearts" , 3);
        kard cc4 = new kard ("4" , "hearts" , 4);
        kard cc5 = new kard ("5" , "hearts" , 5);
        kard cc6 = new kard ("6" , "hearts" , 6);
        kard cc7 = new kard ("7" , "hearts" , 7);
        kard cc8 = new kard ("8" , "hearts" , 8);
        kard cc9 = new kard ("9" , "hearts" , 9);
        kard cc10 = new kard ("10" , "hearts" , 10);
        kard cc11 = new kard ("Jack" , "hearts" , 11);
        kard cc12 = new kard ("Queen" , "hearts" , 12);
        kard cc13 = new kard ("King" , "hearts" , 13);
        kard cc14 = new kard ("Ace" , "hearts" , 14);
        
        kard ccc2 = new kard ("2" , "diamonds" , 2);
        kard ccc3 = new kard ("3" , "diamonds" , 3);
        kard ccc4 = new kard ("4" , "diamonds" , 4);
        kard ccc5 = new kard ("5" , "diamonds" , 5);
        kard ccc6 = new kard ("6" , "diamonds" , 6);
        kard ccc7 = new kard ("7" , "diamonds" , 7);
        kard ccc8 = new kard ("8" , "diamonds" , 8);
        kard ccc9 = new kard ("9" , "diamonds" , 9);
        kard ccc10 = new kard ("10" , "diamonds" , 10);
        kard ccc11 = new kard ("Jack" , "diamonds" , 11);
        kard ccc12 = new kard ("Queen" , "diamonds" , 12);
        kard ccc13 = new kard ("King" , "diamonds" , 13);
        kard ccc14 = new kard ("Ace" , "diamonds" , 14);
        
        kard cccc2 = new kard ("2" , "clubs" , 2);
        kard cccc3 = new kard ("3" , "clubs" , 3);
        kard cccc4 = new kard ("4" , "clubs" , 4);
        kard cccc5 = new kard ("5" , "clubs" , 5);
        kard cccc6 = new kard ("6" , "clubs" , 6);
        kard cccc7 = new kard ("7" , "clubs" , 7);
        kard cccc8 = new kard ("8" , "clubs" , 8);
        kard cccc9 = new kard ("9" , "clubs" , 9);
        kard cccc10 = new kard ("10" , "clubs" , 10);
        kard cccc11 = new kard ("Jack" , "clubs" , 11);
        kard cccc12 = new kard ("Queen" , "clubs" , 12);
        kard cccc13 = new kard ("King" , "clubs" , 13);
        kard cccc14 = new kard ("Ace" , "clubs" , 14);
        
 
        kard karr [] = new kard [83]; 
        karr[0] = c2;
        karr[1] = c3;
        karr[2] = c4;
        karr[3] = c5;
        karr[4] = c6;
        karr[5] = c7;
        karr[6] = c8;
        karr[7] = c9;
        karr[8] = c10;
        karr[9] = c11;
        karr[10] = c12;
        karr[11] = c13;
        karr[12] = c14;
        
        karr[13] = cc2;
        karr[14] = cc3;
        karr[15] = cc4;
        karr[16] = cc5;
        karr[17] = cc6;
        karr[18] = cc7;
        karr[19] = cc8;
        karr[20] = cc9;
        karr[21] = cc10;
        karr[22] = cc11;
        karr[23] = cc12;
        karr[24] = cc13;
        karr[25] = cc14;
        
        karr[26] = ccc2;
        karr[27] = ccc3;
        karr[28] = ccc4;
        karr[29] = ccc5;
        karr[30] = ccc6;
        karr[31] = ccc7;
        karr[32] = ccc8;
        karr[33] = ccc9;
        karr[34] = ccc10;
        karr[35] = ccc11;
        karr[36] = ccc12;
        karr[37] = ccc13;
        karr[38] = ccc14;
        
        karr[39] = cccc2;
        karr[40] = cccc3;
        karr[41] = cccc4;
        karr[42] = cccc5;
        karr[43] = cccc6;
        karr[44] = cccc7;
        karr[45] = cccc8;
        karr[46] = cccc9;
        karr[47] = cccc10;
        karr[48] = cccc11;
        karr[49] = cccc12;
        karr[50] = cccc13;
        karr[51] = cccc14;
        
        kard firstCard = null  , secondCard = null, thirdCard = null;
        try {

            Integer [] arr = new Integer[] {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 , 11 , 12 , 13 , 14 , 15 , 16 ,
                            17 , 18 ,19 , 20 , 21 , 22 , 23 , 24 , 25 , 26 , 27 , 28 , 29 , 30 , 31 , 32 , 33 , 34 , 
                            35 , 36 , 37 , 38 , 39 , 40 , 41 , 42 , 43 , 44 , 45 , 46 , 47 , 48 , 49 , 50 , 
                            51 , 52 , 53 };
            Collections.shuffle(Arrays.asList(arr));
            int firstrindex = arr[3]; 
            int secondrindex = arr[14];
            int thirdrindex = arr[24]; 
            firstCard = karr[0];//karr[firstrindex - 1]; 
            secondCard = karr[27];//karr[secondrindex - 1]; 
            thirdCard =karr[41]; //karr[thirdrindex - 1];
        }catch (NullPointerException e) {
            System.out.println ("Null pointer exception is caught"); 
        }
        System.out.println ("first card : " + firstCard.nam + " of " + firstCard.sut); 
        System.out.println ("second card : " + secondCard.nam + " of " + secondCard.sut); 
        System.out.println ("third card : " + thirdCard.nam + " of " + thirdCard.sut);
        check checker = new check (firstCard , secondCard , thirdCard);
        String ans = "";
        if (checker.Tray() == true) {
            ans = "Tray"; 
        }
        else if (checker.Runnning() == true){
            ans = "Running"; 
        }
        else if (checker.Run() == true) {
            ans ="Run"; 
        }
        else if (checker.Color () == true) {
            ans = "Color"; 
        }
        else if (checker.Twin() == true) {
            ans = "Twin"; 
        }
        else {
            ans = "General";
        }
        System.out.println ("in 3 card game you have gotten " + ans);
    } 
}
