package com.mycompany.app.udemy.automobile;

public class CarsOverridingChildBMW extends CarsOverridingParent {
    public static void main(String[] args) {
CarsOverridingChildBMW c1  = new CarsOverridingChildBMW();
c1.engineStart(2);
    }

    @Override
    public void engineStart(int cyl) {
        super.engineStart(2);
        System.out.println("I am from child class");
    }
}
