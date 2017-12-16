package com.mycompany.app.com.training;

public class Recur {
    public static void main(String[] args) {
        //countdown(-1);
        //forever("A");
//countdown2(3);
        displayBinary(11);
    }

    public static void countdown(int n) {
        if (n == 0) {
            System.out.println("Odpalamy!");
        } else {
            System.out.println("n=" + n);
            countdown(n - 1);
        }
    }

    public static void countdown2(int n) {
        if (n == 0) {
            System.out.println("Odpalamy!");
        } else {
            countdown2(n - 1);
            System.out.println("n=" + n);
        }
    }

    public static void forever(String s) {
        System.out.println(s);
        forever(s);
    }

    public static void displayBinary(int bin){
        if(bin>0){
            displayBinary(bin/2);
            System.out.print(bin%2);
        }
    }
}
