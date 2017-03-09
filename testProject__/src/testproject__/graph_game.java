

/*
    In the name ALLAH
*/

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.color.CMMException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;




public class graph_game {
    public static void main (String [] args) {
        JFrame frame = new JFrame ("rotation in 45 degree");
        frame.setSize(1000 , 800);
        frame.setLayout(null);
        JLabel ll= new JLabel ("nothing");
        Rectangle rect = new Rectangle ();
        rect.x = 500; 
        rect.y = 400;
        rect.width = 100; 
        rect.height = 50;
        ll.setBounds(rect);
        
        
        frame.setVisible(true);
        
    }
}
