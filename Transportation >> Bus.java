package praktic.inheritance.Transportation;

public class Bus extends Vehicle {
    private static final int FARE_PER_STOP = 2000;

    public Bus(String name, String route) {
        super(name, 50, route);
    }

    public double calculateFare(int stops) {
        return stops * FARE_PER_STOP * currentPassengers;
    }

    public void simulateTrip(int stops) {
        System.out.println("Total pemberhentian: " + stops);
        System.out.println("Tarif per halte: Rp " + FARE_PER_STOP);
        System.out.println("Total tarif perjalanan bus: Rp " + calculateFare(stops));
        endTrip();
        removePassengers(currentPassengers);
    }
}
