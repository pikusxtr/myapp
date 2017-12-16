package com.mycompany.app.udemy.automobile;

public class InterfaceDemo implements CarsInterface, BMWCarsInterface {

    @Override
    public void engineStart(String engineType, boolean isKeyLess) {
        System.out.println("Engine start implementation in cars interface");
        // wrong---->   speed = "200";
    }

    @Override
    public void headsUpNavigation() {
        System.out.println("this is heads Up NAVI");
    }
}
