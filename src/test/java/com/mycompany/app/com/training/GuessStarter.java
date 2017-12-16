package com.mycompany.app.com.training;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Początkowy kod dla przykładu "Odgadnij moją liczbę".
 */
public class GuessStarter {

    public static void main(String[] args) {
        // wybierz losową liczbę
        int inputNum;
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe od 1 - 100");
        inputNum = in.nextInt();
        System.out.println("podales liczbe " + inputNum);
        Random random = new Random();
        int numberRandom = random.nextInt(100) + 1;
        System.out.println("losowa liczba random=" + numberRandom);
//        AtomicLong aLong = new AtomicLong(100);
//        System.out.println("atomic incremented=" + aLong.incrementAndGet());
        System.out.println("pomyliles sie o " +  Math.abs( numberRandom - inputNum));
    }

}
