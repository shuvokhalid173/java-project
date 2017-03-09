/**In the name of ALLAH **/

import java.awt.datatransfer.Transferable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.TransferHandler;


class myTransportt extends TransferHandler {
    String ss;
    ImageIcon tt; 
    myTransportt (String ss) {
        super (ss);
    }
    public boolean dataImport (TransferHandler.TransferSupport info) {
        
        if (!canImport (info)) {
            return false;
        }
        
        JLabel ltest = (JLabel) info.getComponent();
        tt = (ImageIcon) ltest.getIcon();
        if (ltest.getIcon() == null) {
            return true;
        }
        else {
            return true;
        }
        
    }
    protected void exportDone(JComponent source, Transferable data, int action) {
        if (action == MOVE){
            JLabel llll = (JLabel) source;
            
                llll.setIcon(tt);
            
        }
    }

    @Override
    public int getSourceActions(JComponent c) {
        return COPY_OR_MOVE;
    }
}

public class swap {
    JFrame f; 
    JLabel l , ll , lll; 
    myTransportt mth; 

    public swap () throws IOException {
        f = new JFrame (); 
        l = new JLabel ();
        ll = new JLabel (); 
        lll = new JLabel ();
        mth = new myTransportt ("icon"); 
        f.setSize(400 , 400);
        l.setBounds(0 , 0  , 100 , 100);
        ll.setBounds(120, 0 , 100 , 100);
        lll.setBounds(0 , 120 , 100 , 100);
        lll.setIcon(new ImageIcon (ImageIO.read(new File ("Capture.png"))));
        l.setIcon(new ImageIcon (ImageIO.read(new File ("4.png"))));
        ll.setIcon(new ImageIcon (ImageIO.read(new File ("5.png"))));
        /**
        MouseListener ml = new MouseListener () {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {
                JComponent jc = (JComponent) e.getSource(); 
                TransferHandler tc =  jc.getTransferHandler();
                tc.exportAsDrag(jc, e, TransferHandler.MOVE);
            }

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}

        };*/
                MouseMotionListener ml = new MouseMotionListener () {

            @Override
            public void mouseDragged(MouseEvent e) {
                JComponent jc = (JComponent) e.getSource(); 
                TransferHandler tc =  jc.getTransferHandler();
                tc.exportAsDrag(jc, e, TransferHandler.MOVE);
                
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
                    
                };
               
        l.addMouseMotionListener(ml);
        ll.addMouseMotionListener(ml);
        lll.addMouseMotionListener(ml);
        l.setTransferHandler(mth);
        ll.setTransferHandler(mth);
        lll.setTransferHandler(mth);
        
        //l.setTransferHandler(new TransferHandler ("icon"));
        //ll.setTransferHandler(new TransferHandler ("icon"));
       // lll.setTransferHandler(new TransferHandler ("icon"));
        f.add(l); 
        f.add(ll); 
        f.add(lll);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main (String [] args) throws IOException {
        new swap (); 
    }
}