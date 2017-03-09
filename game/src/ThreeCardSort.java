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

public class ThreeCardSort {
    public ThreeCardSort (ThreeCard SortedArray[]) {
        int length = 4;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - 1; j++) {
                ValueFromChecker temp = new ValueFromChecker (SortedArray[j] , SortedArray[j + 1]); 
                ThreeCard tempValue = temp.MaxThreeCard(); 
                if (tempValue == SortedArray[j + 1]) {
                    SortedArray[j + 1] = SortedArray[j]; 
                    SortedArray[j] = tempValue;
                }
            }
        }
    }
    
    
}
