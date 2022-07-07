package chapter5;

import java.util.Scanner;

/*
 allow the user to input the plan fee and
 the number of overage minutes.
 Charge 25 cents for every minute that they've
  gone over, and then a 15% tax on the subtotal.
 */
public class PhoneBillCalculator {

    static double extraCost = 0.25;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String arg[])
    {
        //Get what we don't know
       double basePlan = getBasePlan();
       int extraMinutes = getExtraMinutes();
       double overageFees =  calculateOverageFees(extraMinutes, extraCost);
       double taxCost = calculateTax(overageFees);
       double total =  calculateTotalAndPrintBill(basePlan, overageFees,taxCost);

       //Check if the user is qualified
        scanner.close();


    }
    public static double  getBasePlan()
    {

        System.out.println("Enter base cost of the plan:");
        double basePlan = scanner.nextDouble();

        return basePlan;

    }
    public static int getExtraMinutes()
    {
        System.out.println("Enter overage minutes:");
        int extraMinutes = scanner.nextInt();

        return extraMinutes;
    }

    public static double calculateOverageFees(int extraMinutes, double extraCost)
    {
        double overageFees = extraMinutes * extraCost;
        return overageFees;

    }
    public static double calculateTax( double overageFees)
    {
        double tax = 0.15;
        double taxCost = overageFees * tax;
        return taxCost;

    }
    public static double calculateTotalAndPrintBill(double basePlan, double overageFees, double taxCost)
    {
        double total = basePlan + taxCost;


        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + basePlan);
        System.out.println("Overage: $" + overageFees);
        System.out.println("Tax: $" + taxCost);
        System.out.println("Total: $" + total);
        return total;

    }
}
