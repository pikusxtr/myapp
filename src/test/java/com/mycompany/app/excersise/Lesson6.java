package com.mycompany.app.excersise;

public class Lesson6 {
    public static void main(String[] args) {
        // not compile AAAA System.out.println("buu") + 7;
        System.out.println("6/3 =" + isDivisible(6,2));
        System.out.println("a=3, b=1, c=1  is triangle???  " + isTriangle(3, 1, 1));
        System.out.println("a=1, b=1, c=1  is triangle???  " + isTriangle(1, 1, 1));
        System.out.println(Math.exp(1));
        System.out.println(Math.exp(3));
        System.out.println( "multiAdd="+ multAdd(Math.cos(Math.PI/4), 0.5, Math.sin(Math.PI/4)));
        System.out.println(Math.log(20));

    }
    public static boolean isDivisible(int n, int m){
        if(n%m==0 && m!=0)
            return true;
        else
            return false;
    }

    public static boolean isTriangle(int a, int b, int c      )
    {
        if(a<= b+c && b<=a+c && c<=a+b)
            return true;
            else
                return false;
    }
    public static double multAdd( double a, double b, double c){
       return a*b+c;
    }
    public static int prod(int m, int n){
        if(m==n){
            return n;
        }else {
            int recurse = prod(m, n-1);
            int result = n*recurse;
            return result;
        }
    }
}
