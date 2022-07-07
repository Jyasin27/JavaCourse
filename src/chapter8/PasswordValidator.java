package chapter8;

import java.util.Scanner;

public class PasswordValidator {

    /***
     * validate Password:
     * at least 8 characters
     * contain an upppercase
     * contain a special charcter
     * not contain the username
     * not the same as the old password
     */

    private static Scanner scanner = new Scanner(System.in);
    private static String password = scanner.next();

    public static String main(String[] args)
    {

        System.out.println("Enter your password: ");

        int countCharacters = password.length();

        //if(countCharacters < 8 || countCharacters> 8)
        //{
          //  return "Password must be 8 characters long";
        //}



        //validatePassword();

        return null;
    }

    public static int countCharacters()
    {
        int index = password.length();
        if(index< 8 || index> 8)
        {
           // return "Password needs to be 8 characters long";
        }
        return index;
    }


   /**
    public static boolean validatePassword()
    {
        if(i=0; i>)
    }
    **/
}
