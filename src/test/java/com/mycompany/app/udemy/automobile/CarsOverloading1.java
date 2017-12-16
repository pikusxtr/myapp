package com.mycompany.app.udemy.automobile;

public class CarsOverloading1 {
    public static void main(String[] args) {
        increaseSeatHeight(true, 33);
        increaseSeatHeight(33, true);

    }
    public static void increaseSeatHeight(int heightToIncrease){
        System.out.println("Increased seat height by " + heightToIncrease);
    }

    public static void increaseSeatHeight(String heightToIncrease){
        System.out.println("Increased seat height by String inches " + heightToIncrease);
    }

//  incorect duplicate
//   public static void increaseSeatHeightincreaseSeatHeight(int heightToIncrease1){
//        System.out.println("Increased seat height by " + heightToIncrease1);
//    }

    public static void increaseSeatHeight(int heightToIncrease, boolean rememberHeight){
        System.out.println("Increased seat height by " + heightToIncrease);
        if(rememberHeight) {
            System.out.println("Heuight is saved");
        } else {
            System.out.println("selection is not saved");
        }
    }

    public static void increaseSeatHeight(boolean rememberHeight, int heightToIncrease){
        System.out.println("PArams inverted --- Increased seat height by " + heightToIncrease);
        if(rememberHeight) {
            System.out.println("Heuight is saved");
        } else {
            System.out.println("selection is not saved");
        }
    }

    // cannto overload on different type only
//    public static int increaseSeatHeight(int heightToIncrease) {
//        int offSet = 20;
//        System.out.println("seat increased ");
//        return heightToIncrease;
//    }

}
