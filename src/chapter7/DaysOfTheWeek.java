package chapter7;

import java.util.Scanner;

public class DaysOfTheWeek {


    static String [] weekDays = new String[]
            {
                    "Monday",
                    "Tuesday",
                    "Wednesday",
                    "Thursday",
                    "Friday",
                    "Saturday",
                    "Sunday",
            };

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of the day: ");
        int dayIndex = scanner.nextInt();

        String weekDay = getDay(dayIndex);
        System.out.println("It is: " + weekDay);

        scanner.close();


    }
    public static String getDay(int index)
    {

        if(index < 0 || index> weekDays.length)
        {
            return "Invalid Number";
        }
        return weekDays[index -1] ;
    }

}
