

/*
    In the name ALLAH
*/

import java.awt.Color;
import java.awt.Graphics;
import java.awt.color.CMMException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

class gooo extends JComponent implements ActionListener , KeyListener{
    gooo () {
        addKeyListener (this); 
        setFocusable(true);
        setFocusTraversalKeysEnabled (false);
    }
    private int x = 175  , y = 0 , a = 190 , b = 300 , c = 175 , d = 0; 
    Timer timer = new Timer (6 , this); 
    public void paintComponent (Graphics g) {
        g.setColor(Color.cyan); 
        g.fillRect(c , d, 100 , 400);
        g.setColor(Color.green);
        g.fillRect(x , y , 100 , 400);
        g.setColor(Color.red);
        g.fillOval (a , b , 40 , 40);
        timer.start();
    }
    public void actionPerformed(ActionEvent e) {
        x += 0; 
        y += 4;
        d += y - 4;
        if (y == 500) {
            y = 0;
            d = 0;
        }
        repaint (); 
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public void keyTyped(KeyEvent e) {
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            a += 35; 
            b += 0; 
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            a -= 35;
            b -= 0; 
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            a += 0; 
            b += 0; 
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            a -= 0;
            b -= 0; 
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

public class graph_game {
    public static void main (String [] args) {
        JFrame f = new JFrame (); 
        f.setSize(500 , 500);
        
        gooo goo = new gooo ();
        f.add(goo); 
        f.setVisible(true);
    }
}
