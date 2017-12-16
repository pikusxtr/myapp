package com.mycompany.app.excersise;

public class Lesson5 {
    public static void main(String[] args) {
        System.out.println("Fermat test");
        checkFermat(4, 3, 5, 2);
    }
    public static void checkFermat(int a, int b, int c, int n){
        if(a>0 && b>0 &&c>0){
            boolean cond = (Math.pow(a, n) + Math.pow(b, n))==Math.pow(c, n);
            if(n>2){
                if(cond) {
                    System.out.println("Kurka, Fermat si epomylil !!!!!!");
                } else {
                    System.out.println("Nie dziala");
                }
            } else {
                if(cond)
                    System.out.println("Brawo trafiles liczby");
                else
                    System.out.println("Nie dziala");
            }
        }
    }
}
