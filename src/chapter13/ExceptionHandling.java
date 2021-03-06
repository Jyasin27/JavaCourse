package chapter13;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

   static Scanner fileReader;

    public static void main(String args[]) throws IOException
    {
        //createNewFile();
        createNewFileRethrow();

        numbersExceptionHandling();
    }
    public static void createNewFile()
    {
        File file = new File("resources/nonexistent.txt");
        try {
            file.createNewFile();
        }
        catch (Exception e) //catch any exception
        {
            System.out.println("Directory does not exist.");
            e.printStackTrace();
        }

    }
    public static void createNewFileRethrow() throws IOException
    {
        File file = new File("resources/nonexistent.txt");

        file.createNewFile();

    }

    public static void numbersExceptionHandling()
    {
        File file = new File("resources/nonexistent.txt");

        try(Scanner fileReader = new Scanner(file) ) {

           while(fileReader.hasNext())
           {
                double num = fileReader.nextDouble();
               System.out.println(num);
           }

       }
       catch (FileNotFoundException | InputMismatchException e) {
           e.printStackTrace();

       }
       catch (Exception e)
       {
           e.printStackTrace();
       }
       finally {
           //executes no matter what
           fileReader.close();
       }
    }


}
