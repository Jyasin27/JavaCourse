package chapter4;

import java.util.Random;
import java.util.Scanner;

public class RollDieGame {
    public static void main(String arg[])
    {
        boolean again = false;
        //Initialize the known
        System.out.println("Roll the dice");
        Random random = new Random(); //Obj calling method
        int total = 20;
        int space;


        for(int j=1; j<6; j++)
        {
            int die = random.nextInt(6) + 1;
            total = total- die;
            space = 20-total;


            System.out.println("Roll #" + j + ": You've rolled a " + die + " You at " + total + " You at " + space);



        }





    }
}
