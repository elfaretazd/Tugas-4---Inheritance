package praktic.inheritance.Transportation;

public class Vehicle {
    protected String name;
    protected int capacity;
    protected int currentPassengers;
    protected String route;

    public Vehicle(String name, int capacity, String route) {
        this.name = name;
        this.capacity = capacity;
        this.route = route;
        this.currentPassengers = 0;
    }

    public void startTrip() {
        System.out.println(name + " memulai perjalanan di " + route);
    }

    public void addPassengers(int passengers) {
        if (currentPassengers + passengers <= capacity) {
            currentPassengers += passengers;
            System.out.println(passengers + " penumpang naik ke dalam " + name);
        } else {
            System.out.println("Kapasitas penuh! Tidak dapat menaikkan " + (passengers - (capacity - currentPassengers)) + " penumpang");
            currentPassengers = capacity;
        }
        System.out.println("Total penumpang: " + currentPassengers);
    }

    public void removePassengers(int passengers) {
        if (currentPassengers - passengers >= 0) {
            currentPassengers -= passengers;
            System.out.println(passengers + " penumpang turun dari " + name);
        } else {
            System.out.println("Tidak ada cukup penumpang untuk turun");
        }
    }

    public void endTrip() {
        System.out.println(name + " mencapai tujuan akhir dan berhenti");
    }

    public double calculateFare() {
        return 0;
    }
}


