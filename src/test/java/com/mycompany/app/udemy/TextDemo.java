package com.mycompany.app.udemy;


public class TextDemo {
    public static void main(String[] args) {
        String myText01 = "This is abc test drive";
        System.out.println("substring ZERO BASED 0 = "+ myText01.substring(0));
        System.out.println("substring ZERO BASED 5 = "+ myText01.substring(5,7));
        char[] charArr = myText01.toCharArray();
        Character charClass = new Character('p');
        System.out.println("Charclass=" + Character.getNumericValue('p'));
        System.out.println("Charclass=" + Character.getNumericValue('q'));
        System.out.println("Charclass=" + Character.getNumericValue('2'));
        System.out.println("Charclass=" + Character.getNumericValue('-'));
//        for (char item:charArr
//             ) {
//            System.out.println("item="+ item );
//        }
    }
}
