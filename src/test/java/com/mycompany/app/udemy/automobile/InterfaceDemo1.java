package com.mycompany.app.udemy.automobile;

public class InterfaceDemo1 {
    public static void main(String[] args) {
        CarsInterface myInterface = new InterfaceDemo();
        InterfaceDemo myInterface2 = new InterfaceDemo();


        myInterface2.engineStart("kpiType", false);
        myInterface.engineStart("6 Cyl", true);
    }
}
