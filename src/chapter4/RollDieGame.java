package chapter4;

import java.util.Random;
import java.util.Scanner;

public class RollDieGame {


    public static void main(String arg[])
    {

        //Initialize the known
        System.out.println("Roll the dice");
        Random random = new Random(); //Obj calling method
        int total = 20;
        //int space;


        for(int j=1; j<6; j++)
        {
            int die = random.nextInt(6) + 1;
            total = total- die;
           int space = 20-total;

           if(j<5)
           {
               System.out.println("Roll #" + j + ": You've rolled a " + die + ". You are now on space " + space + " and have "
                       + total + " more to go." );
           }

            if (space == 20 && j == 5)
            {
                System.out.println("Roll #" + j + ": You've rolled a " + die + ". Congrats! You win");
            }
            else if (space != 20 && j == 5)
            {
                System.out.println("Roll #" + j + ": You've rolled a " + die + ". You LOOOOSE" );

            }


        }






    }
}
