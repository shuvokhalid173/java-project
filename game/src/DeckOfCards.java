/*
    In the name ALLAH
*/

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import static java.lang.Thread.sleep;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DeckOfCards {
    private String [] Suit; 
    private String [] Name ; 
    private BufferedImage [][] CardImage;
    private BufferedImage allCards;
    object_card [] carrd;
    public int tpoint;
    public DeckOfCards () throws IOException {
        Suit = new String [5];
        Name = new String [33]; 
        CardImage  = new BufferedImage [5][14];
        carrd = new object_card [55]; 
        allCards = ImageIO.read(new File ("cards.png"));
        Suit[1] = "spades"; 
        Suit[0] = "clubs"; 
        Suit[2] = "hearts"; 
        Suit[3] = "diamonds"; 
        Name[0] = "ace"; Name[2] = "three"; Name[1] = "two"; Name[3] = "four"; Name[4] = "five"; Name[5] = "six"; 
        Name[6] = "seven"; Name[7] = "eight"; Name[8] = "nine"; Name[9] = "ten"; 
        Name[10] = "jack"; Name[11] = "queen"; Name[12] = "king";
        this.tpoint = 0;
        int index = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                int x = j * 55; 
                int y = i * 83; 
                // name , suit , value , point , image; 
                BufferedImage tempImage; 
                tempImage = allCards.getSubimage(x, y, 55 , 83); 
                CardImage[i][j] = tempImage;
                int value = 0 , point = 0;
                if (j == 0) {
                    value = 14; 
                }
                else  {
                   value = j + 1; 
                }
                if (j == 0 || j == 12 || j == 11  || j == 10 || j == 9) {
                    point = 10; 
                }
                else {
                    point = 5;
                }
                object_card card = new object_card (Name[j] , Suit[i] , value , point , CardImage[i][j]); 
                carrd[index++] = card;
                tpoint += carrd[index - 1].point; 
            }
        }
    }
    private  void Main () throws IOException {
        //DeckOfCards cc = new DeckOfCards ();
        JFrame f = new JFrame (); 
        JLabel l = new JLabel ();
        JLabel ll = new JLabel (); 
        f.setSize (400 , 400); 
        l.setBounds(200  , 200 , 100 , 100);
        ll.setBounds(0 , 0 , 400 , 100);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(l); 
        f.add(ll);
        Thread tt = new Thread () {
           public void run () {
               for (int i = 0; i < 52; i++) {
                   ll.setText(carrd[i].name + " " + carrd[i].suit + " " + carrd[i].value + " " + carrd[i].point);
                   l.setIcon(new ImageIcon (carrd[i].bufferedimage));
                   try {
                       sleep (3000);
                   } catch (Exception e) {
                       e.printStackTrace();
                   }
               }
           } 
        }; 
        tt.start();
        f.setVisible(true);
    }
    public static void main (String [] args) throws IOException {
        System.out.println (new DeckOfCards ().tpoint);
    }
    
}
