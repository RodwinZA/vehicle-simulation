package com.example;


public class Vehicle {

    private String type;
    private int wheels;
    private boolean isStarted;
    private int currentSpeed;
    private int topSpeed;
    private String colour;

    public Vehicle(String type, int wheels, boolean isStarted, int currentSpeed, int topSpeed, String colour){
        this.type = type;
        this.wheels = wheels;
        this.isStarted = isStarted;
        this.currentSpeed = currentSpeed;
        this.topSpeed = topSpeed;
        this.colour = colour;
    }

    public void drive(){
        if (currentSpeed > 0){
            System.out.println("Driving at " + currentSpeed + "km/h.");
        } else {
            System.out.println("Please accelerate to drive.");
        }
    }

    public void accelerate(){
        if (currentSpeed < topSpeed){
            currentSpeed += 10;
            System.out.println("Accelerating to " + currentSpeed + "km/h.");
        }
    }

    public void brake(){
        if (currentSpeed > 0){
            currentSpeed = 0;
            System.out.println("Car stopped.");
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public boolean isStarted() {
        return isStarted;
    }

    public void setStarted(boolean started) {
        isStarted = started;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
