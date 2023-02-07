import java.time.LocalDate;

public abstract class Boat {
    protected Captain captain;
    private double price;
    private double additionalValue;
    private int yearFabrication;
    private double length;

    public Boat(Captain captain, double price, double additionalValue, int yearFabrication, double length) {
        this.captain = captain;
        this.price = price;
        this.additionalValue = additionalValue;
        this.yearFabrication = yearFabrication;
        this.length = length;
    }

    public double calculate_rent(){
        if(yearFabrication > 2020){
            return price += additionalValue;
        }   else{
            return price;
        }

    }
}
