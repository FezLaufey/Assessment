//Question 3a
public class gcstringbuffer {
    public static void main(String[] args) {
        try{
        int count = 0;
        while(true) {
            StringBuffer record = new StringBuffer();
            record.append ("yeskkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
            count++;
            System.out.println("Append" + count);
            record  = null;
            System.gc();
        }
    } catch (OutOfMemoryError e) {
        System.err.println("Out of Memory Error occurred!");
        e.printStackTrace();
    }
    }
}
