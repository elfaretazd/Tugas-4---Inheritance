package praktic.inheritance.Transportation;

public class Taxi extends Vehicle {
    private static final int FARE_PER_KM = 5000;

    public Taxi(String name, String route) {
        super(name, 4, route);
    }

    public double calculateFare(int distance) {
        return distance * FARE_PER_KM;
    }

    public void simulateTrip(int distance) {
        System.out.println("Total jarak rute: " + distance + " km");
        System.out.println("Tarif per km: Rp " + FARE_PER_KM);
        System.out.println("Total tarif perjalanan taksi: Rp " + calculateFare(distance));
        endTrip();
        removePassengers(currentPassengers);
    }
}
