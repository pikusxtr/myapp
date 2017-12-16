package com.mycompany.app.udemy.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        String[] strArrA = {"kris", "mac", "greg"};
        String[] strArrB = {"kris2", "mac2", "greg2", "marc2"};
        strArrA = strArrB;
        System.out.println("strA4 from b= " + strArrA[3]);
        LinkedList<String> cars = new LinkedList<>();
        ArrayList<Integer> arrListNoType = new ArrayList<>(100);
        arrListNoType.add(2);
        cars.add("BMW");
        cars.add("test BMW");
        cars.add("Honda");
        cars.add("Audi");
        int size = cars.size();


        System.out.println("item index 0 = "+ cars.get(0));
        System.out.println("item index 1 = "+ cars.get(1));
        cars.stream().forEach(s -> System.out.println("item = "+ s));
        //cars.remove(size-1);
        cars.removeIf(s -> s.toLowerCase().contains("bm"));
        System.out.println("After removing index nr 2");
        cars.stream().forEach(s -> System.out.println("item = "+ s));


        List<Integer> integerList = new LinkedList<Integer>();
        List<Integer> integerList2 = new ArrayList<>();
        integerList2.add(2,10);

    }
}
