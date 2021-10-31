/**      Declare and initialise an unsorted Array. Implement a Recursive Function (which
accepts the Array and sum as parameters) to check if it contains four elements
having the given sum.

 @author Ivan Prusac
*/

class Problem2
{
   
   public static boolean FourElementsSumRecursive (int arr[], int n, int X, int i, int j, int k, int l)
    {
        //Reached the end. no sums add up to X
        if(i>=n-3 || j>=n-2 || k>=n-1 || l>=n){
            return false;
        }
        
        //Found a quadruplet
        if (arr[i] + arr[j] + arr[k] + arr[l] == X){
            return true;
        }
        
        
        //Increase i, j, k, l for all combinations
        return FourElementsSumRecursive(arr, n, X, i+1, j, k, l) || FourElementsSumRecursive(arr, n, X, i, j+1, k, l) || FourElementsSumRecursive(arr, n, X, i, j, k+1, l) || FourElementsSumRecursive(arr, n, X, i, j, k, l+1);
    }

    public static void main(String[] args){   
     int[] intArray= {12, 18, 3, 2, 8, 2, 3, 5};
    int X = 35;
        // boolean is true if quadruplet exist
    boolean didFindQuadruplet = FourElementsSumRecursive(intArray, intArray.length, X, 0, 1, 2, 3); 
    System.out.println ("Quadruple exist = " + didFindQuadruplet);
    }
    }



    


