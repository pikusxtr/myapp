package com.mycompany.app.excersise;

import java.util.Random;
import java.util.Scanner;

public class Lesson5Dot7 {
    public static void main(String[] args) {
        System.out.println("start program");
        Random random = new Random();
        int numberRandom = random.nextInt(100) + 1;
        guessNumber(numberRandom);
    }

    public static void guessNumber(int numberRandom) {
        int inputNum;

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe od 1 - 100");
        inputNum = in.nextInt();
        System.out.println("podales liczbe " + inputNum);
        if (inputNum > numberRandom) {
            System.out.println("Liczba za duza");
            guessNumber(numberRandom);
        } else if (inputNum < numberRandom) {
            System.out.println("Liczba za mala");
            guessNumber(numberRandom);
        } else {
            System.out.println("podales dobra liczba AAAAA zgadles!!!!!!!");
            System.out.println("losowa liczba random=" + numberRandom);

        }

        // System.out.println("pomyliles sie o " +  Math.abs( numberRandom - inputNum));
    }
}
