package chapter8;

public class TextProcessor3AddSpaces {

    public static void main(String args[])
    {
        //countWords("I love Test Automations");
        //reverseString("Hellow TAU!");
        addSpaces("HeyWorld!It'sMeAgain!");
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
    /**
     * Adds spaces before each uppercase letter
     * @param text jumbled text
     */
    public static void addSpaces(String text)
    {
        var modifiedText = new StringBuilder(text);

        for(int i=0; i<modifiedText.length(); i++)
        {
            //determine if it's an uppercase and if it is then insert space into string
            if(i!=0 && Character.isUpperCase(modifiedText.charAt(i)))
            {
                modifiedText.insert(i, " ");
                i++; // move past space and to the next character
            }
        }
        System.out.println(modifiedText);
    }
}
