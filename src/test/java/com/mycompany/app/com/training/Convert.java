package com.mycompany.app.com.training;

import java.util.Scanner;

/**
 * Konwertuje wartości w centymetrach na wartości w stopach i calach.
 */
public class Convert {

    public static void main(String[] args) {
        double cm;
        int feet, inches, remainder;
        final double CM_PER_INCH = 2.54;
        final int IN_PER_FOOT = 12;
        Scanner in = new Scanner(System.in);

        // prośba do użytkownika o podanie wartości i pobranie jej
        System.out.print("Ile cm dokładnie? ");
        cm = in.nextDouble();

        // konwersja i wyświetlenie wyniku
        inches = (int) (cm / CM_PER_INCH);
        feet = inches / IN_PER_FOOT;
        remainder = inches % IN_PER_FOOT;
        System.out.printf("%.2f cm = %d st, %d cali\n",
                          cm, feet, remainder);
        System.out.printf("test prinbtFF %d", 1234567890);
        double div1 = 4.0/3.0;
        System.out.println("double divide 4/3=" + Math.max(3.1111, 3.11111));
        System.out.println("modulo div="+ 7%33);
    }

}
