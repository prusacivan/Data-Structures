/**     Implement the method DeletePairs() which takes an
ArrayList of integers and removes all pairs where the left element is larger than the
right element.

 @author Ivan Prusac
*/

import java.util.ArrayList;


public class Problem3 {

   public void DeletePairs(ArrayList<Integer> arr){

       // first we create for loop, that increment i by 2 because we have pair of integers
   for (int i=0;i<(arr.size()) ;i+=2 ) {
       // if first integer is higher than second we delete that pair and decemrent by 2 to avoid skiping next pair of integers
                if(arr.get(i)>arr.get(i+1)){
                    arr.remove(i);
                    arr.remove(i);
                    i=-2;
                }
            }
}   
   
        // now we will implement DeletePairs () method on this array list 
   public static void main(String[] args){
    Problem3 prob = new Problem3 ();
        ArrayList <Integer> arrlst = new ArrayList<Integer>();
        arrlst.add(3);
        arrlst.add(1);
        arrlst.add(6);
        arrlst.add(5);
        arrlst.add(5);
        arrlst.add(2);
        arrlst.add(7);
        arrlst.add(8);
        arrlst.add(1);
        arrlst.add(2);
        prob.DeletePairs(arrlst);
        System.out.println(arrlst);
    }
}