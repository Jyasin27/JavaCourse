package chapter3;

/*
 * IF-ELSE-IF
 * Display the letter grade for a student based on their test score.
 */

import java.util.Scanner;

public class TestResults {

    public static void main (String arg[]){

        //Get the test score
        System.out.println("Enter test score");
        Scanner scanner =  new Scanner(System.in);


        //Determine the letter grade
        char grade;
        try {
            double score = scanner.nextDouble();
            scanner.close();

            if (score < 60) {
                grade = 'F';
            } else if (score < 70) {
                grade = 'D';
            } else if (score < 80) {
                grade = 'C';
            } else if (score < 90) {
                grade = 'B';
            } else {
                grade = 'A';
            }

            System.out.println("Your test score is " + grade);
        }
        catch (Exception e) {
            System.out.println("Error you're dumb; " + e);;
        }
    }
}
