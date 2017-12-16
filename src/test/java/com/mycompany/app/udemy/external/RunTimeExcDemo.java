package com.mycompany.app.udemy.external;

public class RunTimeExcDemo {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int c;
        try {
            c = a / b;
            System.out.println("result=" + c);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }

        int[] numbers = {1, 2, 3};
        for (int i = 0; i < 4; i++) {
            System.out.println(numbers[i]);
        }
    }
}
