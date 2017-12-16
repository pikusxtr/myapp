package com.mycompany.app.udemy.automobile;

public class Cars extends Vehicle {
    private String brand;
    public Cars() {
        System.out.println("Car default contr");
    }
    public Cars(String brand) {
        this.brand = brand;
    }

    @Override
    public int getSpeed() {
        System.out.println("Car getSpeed meth");
        return 44;
    }
    protected void decreaseSpeed(){
         setSpeed(getSpeed()-1);
    }

    void increaseSpeed() {
        setSpeed(getSpeed()+1);
    }
}
