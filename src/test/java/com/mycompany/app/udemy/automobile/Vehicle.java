package com.mycompany.app.udemy.automobile;

public class Vehicle {
    private int speed;
    public Vehicle() {
        System.out.println("Vehicle contr no param");
        setSpeed(44);
    }

    public Vehicle(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        System.out.println("Vehicle Getspeed method");
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
