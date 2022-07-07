package chapter8;

public class TextProcessor2 {

    public static void main(String args[])
    {
        countWords("I love Test Automations");
        reverseString("Hellow TAU!");
    }
    /**
     * Splits a String into an array by tokenizing it.
     * Counts words and prints them
     * @param text Full string to be split
     */
    public static void countWords(String text)
    {

    }
    /**
     * Prints a String in reverse order
     * @param text String to reverse
     */
    public static void reverseString(String text)
    {
        for(int i=text.length()-1; i>=0; i--) //go to the back of string
        {
            System.out.print(text.charAt(i));
        }
    }

}
