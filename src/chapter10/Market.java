package chapter10;

public class Market {

    public static void main(String args[])
    {
        Apple grannySmith = new Apple();
        grannySmith.removeSeeds();
        grannySmith.makeJuice();

        Banana yellowB = new Banana();
        yellowB.peel();
        yellowB.makeJuice();
    }

    public static void pieces(Fruit fruit)
    {
        if(fruit instanceof Apple)
        {
            System.out.println("Added apple pieces");
        }
        else if(fruit instanceof  Banana)
        {
            System.out.println("Added banana pieces");
        }
    }
}
