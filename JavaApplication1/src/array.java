
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import java.util.Stack;


public class array {
    public static void main (String [] args) {
        HashMap <String , Integer >map = new HashMap < String ,Integer > ();
        Scanner cin = new Scanner (System.in);
        Stack < String > stack = new Stack < String > ();

        int n = cin.nextInt(); 
        for (int i = 0; i < n;i++) {
            String x = cin.next (); 
            stack.push(x);
        }
        while (!stack.empty()) {
            System.out.println(stack.peek());
            stack.pop();
            
        }
    }
}
