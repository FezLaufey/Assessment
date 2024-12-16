//Question 1
public class ArrArgs { 
    public static void main (String args[]) { 
    try { 

        if (args == null || args.length == 0) {
            System.out.println("No arguments provided.");
            return;
        }
        for (int k = 0; k < args.length; k++) {
        System.out.println("Value of input index is " + k + " and argument is: " + args[k]);
         }
    } catch (Exception e) {
    System.err.println("Error occured , argument is out of bounds"); 
    } 
    } 
   }
   