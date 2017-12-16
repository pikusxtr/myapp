package com.mycompany.app.com.training;

public class EnumDemo {
    public static void main(String[] args) {
        Day myDay1 = Day.MONDAY;
        System.out.println("monday is="+ myDay1.getValue());
        System.out.println("monday is="+ myDay1.toString().equals("MONDAY"));
        for(Day day: Day.values())
            System.out.println(day.getValue());
    }
}
