package chapter4;

import java.util.Scanner;

/*
 * DO WHILE LOOP:
 * Write a program that allows a user to enter two numbers,
 * and then sums up the two numbers. The user should be able to
 * repeat this action until they indicate they are done.
 */
   public class AddNumbers {

     public static void main(String arg[])
      {

        Scanner scanner = new Scanner(System.in);

        boolean again;  //'again" is the Sentinel so ask user if they want to run again

        //Say what the user must do
        do {
            System.out.println("Enter your first number");
            double num1 = scanner.nextDouble();

            System.out.println("Enter your second number");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;
            System.out.println("The sum is " + sum);

            System.out.println("Would you like to start over? Enter - true / false");
            again = scanner.nextBoolean();

        } while (again); //boolean condition

        scanner.close();

      }
   }
