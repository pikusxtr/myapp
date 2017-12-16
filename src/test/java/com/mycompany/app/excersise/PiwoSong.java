package com.mycompany.app.excersise;

public class PiwoSong {
    public static void main(String[] args) {
    sing(3);
    }

    public static void sing(int beers){
        if(beers==0){
            System.out.println("nie ma piwa na regale");
            System.out.println("nie ma butelek piwa\nnie mozesz wziasc ani jednej");
            System.out.println("bo nie ma wiecej piwa na regale");
        }else {
            System.out.println(beers+ " butelek piwa na regale");
            System.out.println(beers+ " butelek piwa");
            System.out.println("wez jedna podaj dalej\n\n");
            sing(beers-1);
        }
    }
}
