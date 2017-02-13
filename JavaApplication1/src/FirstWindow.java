/*
    In the name ALLAH
*/


import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DragGestureEvent;
import java.awt.dnd.DragGestureListener;
import java.awt.dnd.DragSource;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetAdapter;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.TransferHandler;

class myTransport extends TransferHandler {
    
}

public class FirstWindow  {  myTransport t;
   JLabel pic1 , pic2 , pic3;
   JFrame frame;
   public FirstWindow () throws IOException {
       
       frame  = new JFrame (); 
       pic1 = new JLabel ();
       pic2 = new JLabel ();
       pic3 = new JLabel ();
       pic1.setBounds(20 , 30 , 100 , 100);
       pic2.setBounds(250 , 30 , 100 , 100);
       pic3.setBounds(20 , 140 , 100 , 100);
       pic1.setIcon(new ImageIcon (ImageIO.read(new File ("4.png"))));
       pic2.setIcon(new ImageIcon (ImageIO.read(new File ("5.png"))));
       MouseListener mouselistener = new MouseListener () {

           @Override
           public void mouseClicked(MouseEvent e) {
               //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }

           @Override
           public void mousePressed(MouseEvent e) {
               JComponent jc = (JComponent) e.getSource(); 
               TransferHandler tc = jc.getTransferHandler();
               tc.exportAsDrag(jc, e,TransferHandler.COPY);
               //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }

           @Override
           public void mouseReleased(MouseEvent e) {
               //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }

           @Override
           public void mouseEntered(MouseEvent e) {
             
               
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }

           @Override
           public void mouseExited(MouseEvent e) {
               //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }
           
       };
       
       pic1.addMouseListener(mouselistener);
       pic2.addMouseListener(mouselistener);
       pic3.addMouseListener(mouselistener);
       pic1.setTransferHandler(new TransferHandler ("icon"));
       pic2.setTransferHandler(new TransferHandler ("icon"));
       pic3.setTransferHandler(new TransferHandler ("icon"));
       frame.add (pic1);
       frame.add(pic2); 
       frame.add(pic3); 
       frame.setSize(500 , 500); 
       frame.setLayout (null); 
       frame.setVisible(true);
   }
   public static void main (String [] args) throws IOException {
       new FirstWindow (); 
   }

}
