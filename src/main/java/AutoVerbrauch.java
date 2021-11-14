import java.util.Scanner;

public class AutoVerbrauch {
    public static void main(String[] args) {

        Auto auto1 = new Auto("BMW", 2021, "45000", 2002);
        auto1.differenz();
        //System.out.println("Wie viel Liter wurden getankt?");
       // Scanner verbrauch = new Scanner(System.in);
       // double liter = verbrauch.nextDouble();
       // System.out.println("Wie viel Kilometer wurden gefahren");

        //double fahreneKilometer =verbrauch.nextDouble();
        //double endVerbrauch = (liter * 100) / fahreneKilometer;


       // System.out.println("Der Verbrauch auf 100 Kilometer beträgt: " + endVerbrauch);
    }
}