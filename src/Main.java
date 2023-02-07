public class Main {
    public static void main(String[] args) {

        Captain captain1 = new Captain("Viviana", "Guzman", 1234);
        Captain captain2 = new Captain("Brian", "Steven", 7890);

        Yacht yacht1 = new Yacht(captain1, 100000.0, 20000.0, 2023, 170.5,8);
        System.out.println("Price: " + yacht1.calculate_rent());
        System.out.println("Yacth have fancy: " + yacht1.sizeYacht());
        Sailboats sailboats1 = new Sailboats(captain2, 80000.0, 20000.0, 2019, 100.5,9);
        System.out.println("Price: " + sailboats1.calculate_rent());
        System.out.println("Sailboats is: " + sailboats1.sizeSailboats());
    }
}