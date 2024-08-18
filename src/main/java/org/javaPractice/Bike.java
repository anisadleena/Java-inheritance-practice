package org.javaPractice;

public class Bike extends Vehicle {
    public String handle;

    public Bike() {
        super("petrol", 2, 2, 14, "LED"); // Default values for a Bikethis.handle = "Short";
    }

    public Bike(String engine, int wheels, int seats, int fuelTank, String lights, String handle) {
        super(engine, wheels, seats, fuelTank, lights);
        this.handle = handle;
    }

    public String getHandle() {
        return handle;
    }
}
