import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class nogcstringbuffer {
    public static void main(String[] args) {
        int count = 0;
        String file = "output2.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            StringBuffer record = new StringBuffer();
        
        while(true){
            record.append("yeskkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
            count++;

            writer.write(record.toString());
                    writer.flush(); // Ensure data is written to the file
                    record.setLength(0); // Clear buffer
                    System.out.println("Written " + count + " records to file.");
        }

    }catch (IOException e) {
        System.err.println("File writing error: " + e.getMessage());
}
}
}
