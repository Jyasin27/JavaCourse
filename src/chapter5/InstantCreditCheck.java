package chapter5;

import java.util.Scanner;

/*
 * VARIABLE SCOPE
 * Write an 'instant credit check' program that approves
 * anyone who makes more than $25,000 and has a credit score
 * of 700 or better. Reject all others.
 */
public class InstantCreditCheck {

    static double requiredSalary = 25000;
    static double requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String arg[])
    {
        //Get what we don't know
        double salary = getSalary();
        int creditScore=  getCreditScore();
        //Check if the user is qualified
        isUserQualified(salary, creditScore);

        //Nofity the user
        scanner.close();
    }
    public static double getSalary()
    {
        System.out.println("Enter your salary: $");
        double salary = scanner.nextDouble();
        return salary;

    }
    public static int getCreditScore()
    {
        System.out.println("Enter your credit score: ");
        int creditScore = scanner.nextInt();
        return creditScore;

    }
    public static boolean isUserQualified(double salary, int creditScore)
    {
        if(salary >= requiredSalary && creditScore >= requiredCreditScore)
        {
            System.out.println("Congrats! You qualify!");
            return true;
        }
        else
        {
            System.out.println("Sorry! You did not qualify");
            return false;
        }

    }

}
