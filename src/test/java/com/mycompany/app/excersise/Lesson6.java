package com.mycompany.app.excersise;

public class Lesson6 {
    public static void main(String[] args) {
        // not compile AAAA System.out.println("buu") + 7;
        System.out.println("6/3 =" + isDivisible(6, 2));
        System.out.println("a=3, b=1, c=1  is triangle???  " + isTriangle(3, 1, 1));
        System.out.println("a=1, b=1, c=1  is triangle???  " + isTriangle(1, 1, 1));
        System.out.println(Math.exp(1));
        System.out.println(Math.exp(3));
        System.out.println("multiAdd=" + multAdd(Math.cos(Math.PI / 4), 0.5, Math.sin(Math.PI / 4)));
        System.out.println(Math.log(20));
        System.out.println(prod(1, 3));
        System.out.println("Odd sum");
        System.out.println(oddSum(10));

        System.out.println("Even sum");
        System.out.println(evenSum(9));

        System.out.println("ackerman=");
        System.out.println(ackerman(2, 1));
        System.out.println("power x  n");
        System.out.println(power(2, 8));
    }

    public static boolean isDivisible(int n, int m) {
        if (n % m == 0 && m != 0)
            return true;
        else
            return false;
    }

    public static boolean isTriangle(int a, int b, int c) {
        if (a <= b + c && b <= a + c && c <= a + b)
            return true;
        else
            return false;
    }

    public static double multAdd(double a, double b, double c) {
        return a * b + c;
    }

    public static int prod(int m, int n) {
        if (m == n) {
            return n;
        } else {
//            int recurse = prod(m, n-1);
//            int result = n*recurse;
            return n * prod(m, n - 1);
        }
    }

    public static int oddSum(int n) {
        if (n > 0) {
            if (n == 1) {
                return 1;
            } else if (n % 2 == 1) {
                return n + oddSum(n - 1);
            } else {
                return oddSum(n - 1);
            }
        } else {
            return -1;
        }
    }

    public static int evenSum(int n) {
        if (n > 0) {
            if (n == 2) {
                return 2;
            } else if (n % 2 == 0) {
                return n + evenSum(n - 1);
            } else {
                return evenSum(n - 1);
            }
        } else {
            return -1;
        }
    }

    public static long ackerman(long m, long n) {
        if (m >= 0 && n >= 0) {
            if (m == 0) {
                return n + 1;
            } else if (m > 0 && n == 0) {
                return ackerman(m - 1, 1);
            } else {
                return ackerman(m - 1, ackerman(m, n - 1));
            }
        } else {
            return -1;
        }
    }

    public static double power(double x, int n) {
        if (n >= 0) {
            if (n == 0) {
                return 1;
            } else  {
                if(n>2 && n%2==0){
                    return power(power(x, n/2), 2);
                }else {
                    return x * power(x, n - 1);
                }
            }
        } else {
            return -1;
        }


    }
}
