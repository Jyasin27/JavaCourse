package chapter6;

public class PhoneBill {

    //fields
    private int id;
    private double baseCost;
    private double allottedMinutes;
    private double minutesUsed;
    private double overage;
    private double tax;
    private double total;

    //Constructors
    public PhoneBill()
    {
        id = 0;
        baseCost = 0;
        allottedMinutes = 0;
        minutesUsed = 0;
        overage =0;
        tax =0 ;
        total = 0;

    }
    public PhoneBill(int id, double baseCost, double allottedMinutes, double minutesUsed, double overage,
                     double tax, double total)
    {
        this.id =id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.minutesUsed = minutesUsed;
        this.overage = overage;
        this.tax = tax;
        this.total = total;
    }
    //Getter & Setters

    public double getBaseCost()
    {
        return baseCost;
    }
    public void setBaseCost(double baseCost)
    {
        this.baseCost =baseCost;
    }
    public double getAllottedMinutes()
    {
        return allottedMinutes;
    }
    public void setAllottedMinutes(double allottedMinutes)
    {

    }


}
