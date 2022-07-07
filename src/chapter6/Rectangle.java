package chapter6;


public class Rectangle {

    //fields of rectangle
   private double length; //private - cant directly access [Encaptulation - fields private but methods are public
    private double width;

    //Constructors
    public Rectangle () //Default constructor does not have a parameter
    {
        length = 0;
        width =0;
    }
    public Rectangle(double length, double  width) //New constructor with perimeters
    {
        this.length =length; //can use either one
        setWidth(width);
    }


    //Getter & Setter methods
   public double getLength()
    {
        return length;
    }
    public void setLength(double length )
    {
        this.length = length;
    }

   public double getWidth()
    {
        return width;
    }
   public void setWidth(double width)
    {
        this.width =width;
    }
    //General method

    public double calculatePerimeter()
    {
        return (2 * length) +( 2* width);

    }
   public double calculateArea()
    {
        return length * width;
    }

}
