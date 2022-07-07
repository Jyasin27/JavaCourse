package chapter10;

public class Zoo {

    public static void main(String args[])
    {
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);

        Animal sasha = new Dog();
        sasha.makeSound();
        feed(sasha);

        sasha = new Cat(); //polymosrphism
        sasha.makeSound();

        ((Cat) sasha).scratch(); //casting sash to use the cat mathods
        feed(sasha);

    }
    public static void feed(Animal animal)
    {
        if (animal instanceof Dog ){
            System.out.println("Here's your dog food");
        }
        else if(animal instanceof Cat)
        {
            System.out.println("Here is your cat food");
        }
    }

}
