/*
    In the name ALLAH
*/

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.datatransfer.Transferable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.Timer;
import javax.swing.*;
import java.lang.NullPointerException;
import static javax.swing.TransferHandler.COPY_OR_MOVE;
import static javax.swing.TransferHandler.MOVE;

public class myTransferHandler extends TransferHandler {
    String ss;
     
    myTransferHandler (String ss) {
        super (ss);
    }
    
    protected void exportDone(JComponent source, Transferable data, int action) {
        if (action == MOVE){
            JLabel llll = (JLabel) source;
            
            try {
                llll.setIcon(new ImageIcon (ImageIO.read(new File ("Capture.png"))));
            } catch (IOException ex) {
                Logger.getLogger(myTransferHandler.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }

    @Override
    public int getSourceActions(JComponent c) {
        return COPY_OR_MOVE;
    }
}
