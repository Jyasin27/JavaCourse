package chapter2; //package declaration

import java.util.Scanner;

public class GrossPayCalculator {

    //method
    public static void main(String arg[]) {

        //1. get the number of hours worked
        System.out.println("Enter the number of hours the employee worked.");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt(); //declared data type with nt

         //2. get the hourly and pay rate
        System.out.println("Enter the employee's pay rate.");
        double rate = scanner.nextDouble(); //decimal
        scanner.close();

        //3. multiply hours and pay rate
        double grossPay = hours * rate;

        //4. display results
        System.out.print(grossPay);
    }
}
