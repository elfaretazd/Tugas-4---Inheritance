package praktic.inheritance.Mains;

import praktic.inheritance.Transportation.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("====================================================");
        
        Bus bus = new Bus("Bus TransJatim", "Terminal A - Terminal B");
        bus.startTrip();
        bus.addPassengers(30);
        bus.addPassengers(100);  // Kapasitas penuh
        bus.simulateTrip(5);
        
        System.out.println("\n----------------------------------------------------\n");

        Train train = new Train("Kereta Mass Rapid Transit", "Stasiun Kota - Stasiun Pusat");
        train.startTrip();
        train.addPassengers(150);
        train.addPassengers(300);  // Kapasitas penuh
        train.simulateTrip();

        System.out.println("\n----------------------------------------------------\n");

        Taxi taxi = new Taxi("Taksi Citra", "Bandara - Hotel");
        taxi.startTrip();
        taxi.addPassengers(3);
        taxi.addPassengers(10);  // Kapasitas penuh
        taxi.simulateTrip(10);

        System.out.println("\n====================================================");
    }
}
