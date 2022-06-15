package chapter4;


import java.util.Scanner;

/*
 * WHILE LOOP:
 * Each store employee makes $15 an hour. Write a program that allows the employee
 * to enter the number of hours worked for the week. Do not allow overtime.
 */
public class GrossPayInputValilation {

    public static void main(String args[]) {

            //Initialize known variables
            int rate = 15;
            int maxHours = 40;

            //Get input for unknown variables
            System.out.println("How many hours did you work this week?");
            Scanner scanner = new Scanner(System.in);
            double hoursWorked = scanner.nextDouble();

            //Validate input - WHILE loop
            while(hoursWorked > maxHours || hoursWorked < 1) // hoursWork must be less than 40 or more than 1
            {
                System.out.println("Invalid entry. Your hours must be between 1 and 40. Try again.");
                hoursWorked = scanner.nextDouble();  //allow users to enter hours again
                //sentinel - controls the follow of the loop (hoursWorked)
            }
            scanner.close();

            //Calculate Gross
            double gross = rate * hoursWorked;
            System.out.println("Gross pay: $" + gross);

   }

}
