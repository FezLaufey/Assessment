//Question 1
public class ArrArgs { 
    public static void main (String args[]) { 
    try { 
    int k=0; 
    do { 
    System.out.println("Value of input is" + k + "and arguments" + args[k++]); 
    } while (true); 
    } catch (Exception e) {
    System.err.println("Error occured , argument is out of bounds"); 
    } 
    } 
   }
   