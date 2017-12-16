package com.mycompany.app.udemy.external;

import com.mycompany.app.udemy.automobile.Cars;

public class Audi extends Cars {
    boolean xDriveOn;
    public Audi() {
        System.out.println("BMW contruxtor");
    }
    public void startXDrive(){
        super.decreaseSpeed();
        xDriveOn = true;
    }

    public void defaultTestAccess(){
        //default method NOT visible in external package
        //super.increaseSpeed();
    }
}
