package com.mycompany.app.excersise;

public class Lesson7Ex {
    public static void main(String[] args) {

    }
    public static double squareRoot(double a) {
        double diff = 1;
        double x1 = (a/2 + a/(a/2))/2;
        while(diff>=0.0001){

            double x2 = (x1+ a/x1)/2;
            diff = Math.abs(x1-x2);
            x1=x2;
        }
        return x1;
    }
}
