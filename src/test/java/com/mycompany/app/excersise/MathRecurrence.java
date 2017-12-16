package com.mycompany.app.excersise;

public class MathRecurrence {
    public static void main(String[] args) {
        long n=10;
        System.out.println("silnia");
        System.out.println("silnia "+ n+" = "+ silnia(n));
    }

    public static long silnia(long n){

        if(n==0)
            return 1;
        // 2! = 2*1! = 2* 1 * 0!

        return n*silnia(n-1);
    }
}
