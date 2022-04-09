package com.example;

public class Car extends Vehicle {
    
    private String manufacturer;

    public Car(String type, int wheels, boolean isStarted, int currentSpeed, int topSpeed, String colour, String manufacturer) {
        super(type, wheels, isStarted, currentSpeed, topSpeed, colour);

        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
