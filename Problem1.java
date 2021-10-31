/**      Implement a Function in Java which accepts a List of Integer values and
outputs the frequency of each.

 @author Ivan Prusac
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Problem1 {
    
    public static void main (String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int size;
        int checked = -1;
//      First we gonna propmt user to to input size of the array
        System.out.println("Please enter the size of your array : ");
        
        size = in.nextInt();
        
//      Second we instantiate Array List and populate it      
        List arr = new ArrayList();
        int [] fr = new int [size];
 
        System.out.println("Please populate your array: ");
        for (int i = 0; i<size; i++){
             
             arr.add(i, in.nextInt());
         }
       
//      Using nested for loops we check how many indentical numbers are in array     
        for (int i = 0; i<size; i++){
            for(int j = i+1; j < size; j++){ 
            if(arr.get(i) == arr.get(j)){
//      fr[j] is created to avoid counting the same element again
                fr[j] = checked;
            }
        }
//      Collections.frequency method calculate for us how many times each element occured in array
    int frequency = Collections.frequency(arr, arr.get(i));
    if(fr[i] != checked){
//      Here we print number and number of times it occures in array
    System.out.println(arr.get(i) + " occurs " + frequency + " times.");
    }
}
}
}

