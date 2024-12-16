//Question 3 MEMOERY OVERLOAD
public class stringbuffer {
    public static void main(String[] args) {
        try{
        StringBuffer record = new StringBuffer();
        int count = 0;
        while(true) {
            record.append ("yeskkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
            count++;
            System.out.println("Append" + count);
        }
    } catch (OutOfMemoryError e) {
        System.err.println("Out of Memory Error occurred!");
        e.printStackTrace();
    }
    }
}
