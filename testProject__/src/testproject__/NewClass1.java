/**
 * In the name of Allah 
 * 
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.AbstractCollection;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.Timer;

public class NewClass1  {
    JFrame frame;
    JButton b; 
    NewClass1 () {
        frame = new JFrame (); 
        b = new JButton ("ok"); 
        b.setBounds(100 , 100 , 50 , 50);
        frame.setLayout(null);
        frame.add(b);
        b.addActionListener(ml);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
        frame.setSize(555 , 555);
        frame.setVisible(true);
    }
    ActionListener ml = new ActionListener () {

        @Override
        public void actionPerformed(ActionEvent e) {
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    };
    public static void main (String [] args) {
        new NewClass1 ();
    }
}
