/*
    In the name ALLAH
*/

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class testClass {
    public static void main (String [] args) throws IOException {
        object_card card2 = new object_card ("2" , "spades" , 2 , ImageIO.read(new File ("2.png")));
        object_card card3 = new object_card ("3" , "spades" , 3 , ImageIO.read(new File ("3.png")));
        object_card card4 = new object_card ("4" , "spades" , 4 , ImageIO.read(new File ("4.png")));
        object_card card5 = new object_card ("5" , "spades" , 5 , ImageIO.read(new File ("5.png")));
        object_card card6 = new object_card ("6" , "spades" , 6 , ImageIO.read(new File ("6.png")));
        object_card card7 = new object_card ("7" , "spades" , 7 , ImageIO.read(new File ("7.png")));
        object_card card8 = new object_card ("8" , "spades" , 8 , ImageIO.read(new File ("8.png")));
        object_card card9 = new object_card ("9" , "spades" , 9 , ImageIO.read(new File ("9.png")));
        object_card card10 = new object_card ("10" , "spades" , 10 , ImageIO.read(new File ("10.png")));
        object_card card11 = new object_card ("Jack" , "spades" , 11 , ImageIO.read(new File ("jack.png")));
        object_card card12 = new object_card ("Queen" , "spades" , 12 , ImageIO.read(new File ("queen.png")));
        object_card card13 = new object_card ("King" , "spades" , 13 , ImageIO.read(new File ("king.png")));
        object_card card14 = new object_card ("Ace" , "spades" , 14 , ImageIO.read(new File ("ace.png")));
        ThreeCard first = new ThreeCard (card4 , card9 , card8); 
        ThreeCard second = new ThreeCard (card14 , card7 , card5); 
        ThreeCardChecker fc = new ThreeCardChecker (first);
        ThreeCardChecker sc = new ThreeCardChecker (second); 
        ValueFromChecker ac = new ValueFromChecker (first , second); 
        if (fc.Runnning()) {
            System.out.println("it is running and it's value is " + ac.getFirstCardValue());
            
        }
        else if (fc.Run()) {
            System.out.println ("it is run and it's value is " + ac.getFirstCardValue());
        }
        else if (fc.Color()) {
            System.out.println ("it is color and it's value is " + ac.getFirstCardValue ()); 
        }
        if (sc.Runnning()) {
            System.out.println("it is running and it's value is " + ac.getSecondCardValue());
            
        }
        else if (sc.Run()) {
            System.out.println ("it is run and it's value is " + ac.getSecondCardValue());
        }
        else if (sc.Color()) {
            System.out.println ("it is color and it's value is " + ac.getSecondCardValue ()); 
        }
        ThreeCard fff = ac.MaxThreeCard(); 
        System.out.println ("the larger is " + fff.first_card.name + " " + fff.first_card.suit + " " + fff.first_card.value); 
    }
}
