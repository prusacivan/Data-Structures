package TABAQuestions;

import java.util.Stack;

public class CurlyBrackets {
    public static void main (String [] args)
    {
    	// we have both examples where brackets are correct and where they are wrong
        String correct = "{}";
        String wrong = "{";
        System.out.println(CurlyBrackets.TextEditor(correct));
        System.out.println(CurlyBrackets.TextEditor(wrong));
       
    }

public static boolean TextEditor(String s) {
        
        
        
        char[] chAr=s.toCharArray();
        
        int[] intAr=new int[chAr.length];
        
        
        // each curly bracket have some int value
        for(int i=0;i<chAr.length;i++) {
            
            if(chAr[i]=='{') {
                intAr[i]=1;
            }
            else if(chAr[i]=='}') {
                intAr[i]=-1;
            }
            
            
        }
        
        Stack<Integer> stack=new Stack<Integer>();
        // here we iterate through our strings and check for curly braces
        for(int i=0;i<chAr.length;i++) {
            
            if(stack.isEmpty()) {
            	// if clause in case bracket is closed ( { = -1 )
                if(intAr[i]<0) {
                    stack.push(intAr[i]);
                    break;
            }
                    stack.push(intAr[i]);
            }
            else{
            	// if clause in case bracket is open ( { = 1 )
                if(intAr[i]>0) {
                    stack.push(intAr[i]);
                }
                else {
                    if(stack.peek()==-(intAr[i])) {
                        stack.pop();
                    }
                    else {
                        break;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}