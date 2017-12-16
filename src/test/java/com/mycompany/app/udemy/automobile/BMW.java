package com.mycompany.app.udemy.automobile;

public class BMW extends Cars {
    boolean xDriveOn;
    public BMW() {
        System.out.println("BMW contruxtor");
    }
    public void startXDrive(){
        super.decreaseSpeed();
        xDriveOn = true;
    }
    public void defaultTestAccess(){
        super.increaseSpeed();
    }

    protected void protectedTestAccess(){
        super.increaseSpeed();
    }
}
