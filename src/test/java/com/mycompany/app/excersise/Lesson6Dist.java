package com.mycompany.app.excersise;

public class Lesson6Dist {
    public static void main(String[] args) {
        System.out.println("distance=" + distance(1.0, -1.0, 2.0, 1.0));
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        double dsquared = dx * dx + dy * dy;
        System.out.println(dsquared);
        double result = Math.sqrt(dsquared);

        return result;
    }

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
}
