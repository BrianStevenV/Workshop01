import java.time.LocalDate;

public class Yacht extends Boat{
    private int amountCabins;
    public Yacht(Captain captain, double price, double additionalValue, int yearFabrication, double length, int amountCabins) {
        super(captain, price, additionalValue, yearFabrication, length);
        this.amountCabins = amountCabins;
    }

    public String sizeYacht(){
        String message;
        if(amountCabins > 7){
            message = "Its is fancy!";
        }   else{
            message = "Its doesn't fancy!";
        }
        return message;
    }


}
