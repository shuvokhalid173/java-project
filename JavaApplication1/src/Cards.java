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

public class Cards {
    public String name; 
    public String suit;
    public int value; 
    public ImageIcon icon;
    Cards (String nm , String st , int vl , ImageIcon icn) {
        this.name = nm;
        this.suit = st;
        this.value = vl; 
        this.icon = icn;
    }
}
