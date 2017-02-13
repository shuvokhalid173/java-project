
import java.util.*;

public class NewClass2 {
    public static void main (String [] args ) {
        Scanner cin = new Scanner (System.in); 
        int array [] = new int [123]; 
        int n = cin.nextInt();
        for (int i = 0 ;  i < n; i++) {
            int x = cin.nextInt(); 
            array[i] = x;
        } 
        Arrays.sort(array , 0 , n);
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
