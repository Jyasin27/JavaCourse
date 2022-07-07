package chapter6;

import org.w3c.dom.css.Rect;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
    private Scanner scanner = new Scanner(System.in);

    public static void main(String args[])
    {
       
        //Instantiate class we in to use getRoom
        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo(); //instantiation
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();

        double area = calculator.calculateTotalArea(kitchen,bathroom);

        System.out.println("The area of your home is: " + area);
        calculator.scanner.close();

    }
    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2)
    {
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }

    public Rectangle getRoom()
    {

        System.out.println("Enter the length of your room: ");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your room:");
        double width = scanner.nextDouble();

        //Rectangle room = new Rectangle(length, width);



        return new Rectangle(length, width);
    }

}
