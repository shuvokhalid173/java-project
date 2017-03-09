
package testproject__;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.TransferHandler;
import static javax.swing.TransferHandler.COPY;
import javax.swing.event.ListDataListener;

public class subimage {
    
    public static void main (String [] args) throws IOException {
        JFrame frame = new JFrame (); 
        JList list = new JList (); 
        frame.setLayout (null); 
        frame.setSize(400 , 400);
        int x , y ; 
        x = 100 ; y = 50;
        list.setBounds(x, y, 70 , 300);
        
        JTextField tt = new JTextField (); 
        tt.setBounds(200 , 50 , 100 , 40);
        
        int ind = 0;
        JButton bt = new JButton ("ok"); 
        bt.setBounds(200 , 100 , 70 , 40);
        bt.addActionListener(new ActionListener () {
        
            
            ArrayList < String > llist = new ArrayList < String > ();
            public void actionPerformed(ActionEvent e) {
                llist.add(tt.getText()); 
                tt.setText(null);
               
                list.setModel(new ListModel () {
                    
                    public int getSize() {
                        //return string.length; 
                        
                        return llist.size(); 
                        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public Object getElementAt(int index) {
                        return llist.get(index); 
                        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public void addListDataListener(ListDataListener l) {

                        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public void removeListDataListener(ListDataListener l) {

                        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                });
                
            }
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            
        });
        frame.add(list); 
         frame.add(bt); 
         frame.add(tt); 
        frame.setVisible(true);
    }
}
