package chapter3;

//comment or
/*
comment more than one line - if statement
All salespeople get a payment of $1000 a week.
Salespeople who exceed 10 sales get an additional bonus of $250.
*/

import java.util.Scanner;

public class SalaryCalculator {
     public static void main(String arg[]){

         //initialize known values
         int salary = 1000;
         int bonus = 250;
         int quota = 10;

         //Get what I don't know
         System.out.println("How many sales did the employee make this week?");
         Scanner scanner = new Scanner(System.in);
         int sales = scanner.nextInt();
         scanner.close();;

         //quick detour for the bonus earners
         if (sales > quota){
             //memory location= value
             salary = salary + bonus;
         }

         //Output.
         System.out.println("The employee's pay is $" + salary);
     }
}
