package chapter8;


public class TextProcessor {

    public static void main(String args[])
    {
        countWords("I love Test Automation");

    }
    /**
     * Splits a String into an array by tokenizing it.
     * Counts words and prints them
     * @param text Full string to be split
     */
    public static void countWords(String text)
    {
        var words = text.split(" "); //take the text and split it whenever you see a space
        int numberOfWords = words.length; //get number of words

        String message = String.format("Your text contains %d words", numberOfWords); //%d - place holder for numbers
        System.out.println(message);

        //print the words out
        for(int i=0; i<numberOfWords; i++)
        {
            System.out.println(words[i]);
        }
    }
}
