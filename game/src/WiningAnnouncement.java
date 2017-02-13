/*
    In the name ALLAH
*/

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.*;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class WiningAnnouncement {
    public String message;
    JFrame msgboxframe; 
    JButton msgbutton; 
    JDialog Dbox;
    WiningAnnouncement (String msg) {
        this.message = msg;
        msgboxframe = new JFrame (); 
        msgbutton = new JButton ("ok"); 
        Dbox = new JDialog (msgboxframe , "Result" , true); 
        Dbox.setLayout (new FlowLayout ());
        msgbutton.setBounds (150 , 50 , 40 , 40);
        msgbutton.addActionListener(new ActionListener () {
            public void actionPerformed (ActionEvent e) {
                Dbox.setVisible(false);
                //new mainMenu ();
                 
            }
        });
        Dbox.add(new JLabel (message));
        Dbox.add(msgbutton); 
        Dbox.setSize(300 , 100);
        Dbox.setForeground(Color.red);
        Dbox.setVisible(true);
    }
    
}
