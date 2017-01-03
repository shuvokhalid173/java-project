/// Bismillahhirrahmanirrahim ///

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class test {
    public static void main (String [] args) {
        JFrame myframe = new JFrame ("background image"); 
        myframe.setSize(700 , 700);
        JLabel label = new JLabel ();
        label.setBounds(0 , 0 , 699 , 699);
        ImageIcon ii = new ImageIcon ("G:\\backimage.png"); 
        label.setIcon (ii); 
        myframe.add(label); 
        myframe.setVisible (true);
    }
}

