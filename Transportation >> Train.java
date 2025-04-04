package praktic.inheritance.Transportation;

public class Train extends Vehicle {
    private static final int FIXED_FARE = 10000;

    public Train(String name, String route) {
        super(name, 200, route);
    }

    public double calculateFare() {
        return currentPassengers * FIXED_FARE;
    }

    public void simulateTrip() {
        System.out.println("Tarif tetap per penumpang: Rp " + FIXED_FARE);
        System.out.println("Total tarif perjalanan kereta: Rp " + calculateFare());
        endTrip();
        removePassengers(currentPassengers);
    }
}
