package com.mycompany.app.udemy.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo2 {
    public static void main(String[] args) {
        List<Integer> integerList = new LinkedList<Integer>();
        List<Integer> integerList2 = new ArrayList<Integer>();
        runDuration(integerList, "linkedList");
        runDuration(integerList2, "arrayList");
    }

    public static void runDuration(List<Integer> list, String listType){
        System.out.println("begining of the duration for "+ listType);

        for (int i=0; i<100000; i++) {
            list.add(i);
        }
        int size = list.size();
        System.out.println("list size= "+ size);
        int elementsToAdd = size + 10000000;
        long startTime = System.currentTimeMillis();
        for(int i=0; i<5000; i++){
            list.remove(i);
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Duration of list  "+ listType + " is "+ duration + " ms");
    }
}
