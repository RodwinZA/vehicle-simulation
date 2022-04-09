package com.example;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static String startCar = "";
    static String command = "";

    public static void main(String[] args){
        Car x5 = new Car("x5", 4, false, 0, 320, "grey", "BMW");


        while (!Objects.equals(startCar, "start")){
            System.out.println("Welcome. To start car type `start`: ");
            startCar = scanner.nextLine();
        }

        if (startCar.equals("start")){
            x5.setStarted(true);
        }

        while (x5.isStarted()){
            System.out.println("Next command >> ");
            command = scanner.nextLine().toLowerCase();

            switch (command) {
                case "off":
                    x5.setStarted(false);
                    break;
                case "accelerate":
                    x5.accelerate();
                    break;
                case "drive":
                    x5.drive();
                    break;
                case "brake":
                    x5.brake();
                    break;
            }
        }

    }
}
