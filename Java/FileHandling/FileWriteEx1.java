import java.io.FileWriter;
import java.io.IOException;

public class FileWriteEx1 {
    public static void main(String[] args) {
        String data = "Hello World";
        try {
            FileWriter fw = new FileWriter("/Users/vivi.addagatla/Documents/Semester-2/Java/FileHandling/abc.txt");
            fw.write(data);
            fw.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}