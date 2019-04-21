package com.ea;

/**
 * Created by Jess on 17/06/2017.
 */
public class Car {

    // instance variables

    int year = 1988;
    String model;
    private String make;
    int speed;
    int speeder = 999;
    int gear;


    public Car() {
        this(2, 10);

        this.speed = 0;
        this.gear = 0;
        System.out.println("Constructure without args");
    }

    public Car(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
        System.out.println("Constructure with args");
    }

    public int getYear() {
        //refers to the instance of the make variable
        return this.year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return this.make;
    }
}
