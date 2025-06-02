import java.io.*;
public class FileDemo2 {
    public static void main(String args[]) {
        try {
            FileInputStream fin = new FileInputStream("/Users/vivi.addagatla/Documents/Semester-2/Java/FileHandling/abc.txt");
            int i = 0;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
        } catch(FileNotFoundException e){
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}