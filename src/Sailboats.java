public class Sailboats extends Boat{
    private int amountMasts;

    public Sailboats(Captain captain, double price, double additionalValue, int yearFabrication, double length, int amountMasts) {
        super(captain, price, additionalValue, yearFabrication, length);
        this.amountMasts = amountMasts;
    }

    public String sizeSailboats(){
        if(amountMasts > 4){
            return "Sailboat is big!";
        }   else{
            return "This is small...";
        }
    }
}
