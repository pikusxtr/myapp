package com.mycompany.app.excersise;

public class Lesson7 {

    public static void main(String[] args) {
        printRow(2);
        printRow(3);
        printRow(4);
        printTable2(5);
        printTable3(10, 10);

    }
     public static void printRow(int n){
        int i=1;
        while(i<=6) {
            System.out.printf("%5d", n*i);
            i=i+1;
        }
         System.out.println();
     }
    public static void printRow(int n, int cols){
        int i=1;
        while(i<=cols) {
            System.out.printf("%5d", n*i);
            i=i+1;
        }
        System.out.println();
    }

     public static void printTable() {
        int i=1;
        while(i<=6){
            printRow(i);
            i=i+1;
        }
     }

    public static void printTable2(int rows) {
        int i=1;
        while(i<=rows){
            printRow(i);
            i=i+1;
        }
    }

    public static void printTable3(int rows, int cols) {
        int i=1;
        while(i<=rows){
            printRow(i, cols);
            i=i+1;
        }
    }

}
