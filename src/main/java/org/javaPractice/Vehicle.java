package org.javaPractice;

public class Vehicle {
    public String engine;
    public int wheels;
    public int seats;
    public int fuelTank;
    public String lights;

    public Vehicle(String engine, int wheels, int seats, int fuelTank, String lights){
        this.engine = engine;
        this.wheels = wheels;
        this.seats = seats;
        this.fuelTank = fuelTank;
        this.lights = lights;
    }

    public String getEngine() {
        return engine;
    }

    public String getLights() {
        return lights;
    }

    public int getFuelTank() {
        return fuelTank;
    }

    public int getSeats() {
        return seats;
    }

    public int getWheels() {
        return wheels;
    }
}
