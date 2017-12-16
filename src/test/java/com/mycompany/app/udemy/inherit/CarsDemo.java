package com.mycompany.app.udemy.inherit;

import com.mycompany.app.udemy.automobile.BMW;
import com.mycompany.app.udemy.automobile.Cars;
import com.mycompany.app.udemy.automobile.Vehicle;

public class CarsDemo {
    public static void main(String[] args) {
        System.out.println("start");
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Cars();
        System.out.println("Veh Speed=" + v1.getSpeed());
        Cars car1 = new Cars("BMW");
        System.out.println("Car speed = "+ car1.getSpeed());
        Vehicle veh2 ;
        Cars car2  = (Cars)v2;
        Vehicle veh2C = new Vehicle();
        System.out.println("------before veh=new car()");
        veh2 = new Cars();
        veh2.getSpeed();
//no decrease speed method visible - protectred in Car
//       Car Car2a = (Car)veh2;
        BMW bmw = new BMW();
        bmw.startXDrive();
       Vehicle v4 = new Cars();
       Vehicle v5 = (Vehicle) new Cars();
       v5.getSpeed();
    }
}
