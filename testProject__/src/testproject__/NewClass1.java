/**
 * In the name of Allah 
 * 
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.AbstractCollection;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.Timer;

public class NewClass1 extends JComponent implements ActionListener {
    public static void main (String [] args) {
        JFrame ffr = new JFrame (); 
        ffr.setSize(1000 , 1000);
        ffr.add(new NewClass1 ());
        ffr.setVisible(true);
    }

    Timer tmm = new Timer (5 , this);
   
    public void paintComponent (Graphics g) {
        
        g.fillOval(x, y, 100 , 100);
        g.setColor(Color.red);
        tmm.start ();
    }
    private int x = 0 , y = 0 , v = 100;
    public void inc () {
        x += v; 
        y += v; 
        if (x == 700 && y == 700) {
            fl = true;
        }
    }
    public void dec () {
        x -= v; 
        y -= v;
        if (x == 0 && y == 0) {
            fl = false;
        }
    }
    private boolean fl = false;
    public void actionPerformed(ActionEvent e) {
        if (fl == false) {
            inc (); 
        }
        else {
            dec (); 
        }
        repaint (); 
        
    }
}
