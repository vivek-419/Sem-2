import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Filehandling{
    public static void main (String []args)
    {
        Scanner sc=new Scanner(System.in);


        File f1 = new File("abc.txt");
        try
        {
            f1.createNewFile();
        }
        catch (IOException e)
        {
            System.out.println("Error in creating file");
        }
    
        try
        {
            FileWriter f2 = new FileWriter("pqr.txt");
            f2.write("Adding content to the file");
            f2.write("Hello everyone! we are learning file handling");
            f2.append("Bye");
            f2.close();
        }
        catch (IOException e)
        {
            System.out.println("File doesn't exist");
        }

        try {
            FileWriter f3 = new FileWriter("lmn.txt");

            String Data = sc.nextLine();
            f3.write(Data);
            f3.close();
           

        }
        catch (IOException e)
        {
            System.out.println("File not found");
        }
        sc.close();
        


    


}
}