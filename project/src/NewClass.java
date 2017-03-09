

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class NewClass extends JFrame{
    JButton jj;
    NewClass () {
        setSize(300 , 300);
        jj = new JButton ("ok");
        add(jj);
        setLayout (null);
        jj.addActionListener(ac);
        jj.setBounds(100 , 100 , 50 , 50);
        setVisible (true);
    }
    ActionListener ac = new ActionListener () {
        public void actionPerformed (ActionEvent ee) {
            setVisible (false); 
            
        }
    };
    
}
