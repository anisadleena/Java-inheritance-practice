package org.javaPractice;

public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.handle = "Short";
        bike.engine = "no petrol";
        System.out.println("======= bike =======");
        System.out.println("handle: "+bike.getHandle());
        System.out.println("engine: "+bike.getEngine());

        Vehicle vehicle = new Vehicle("petrol", 4, 5, 50, "Halogen");
        System.out.println("======= vehicle =======");
        System.out.println("engine: "+vehicle.getEngine());
        System.out.println("light: "+vehicle.getLights());
        System.out.println("fuel tank: "+vehicle.getFuelTank());
        System.out.println("seats: "+vehicle.getSeats());

    }
}