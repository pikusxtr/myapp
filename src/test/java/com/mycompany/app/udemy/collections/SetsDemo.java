package com.mycompany.app.udemy.collections;

import java.util.*;

public class SetsDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("BMW");
        set.add("CMW");
        set.add("Audi");
        set.add("Honda");
        set.add("Honda");
        set.add("honda");

        List<String> list = new ArrayList<>();
        list.add("bmw");
        list.add("audi");
        list.add("Honda");
        list.add("Honda");

        Set<String> linkSet = new LinkedHashSet<>();
        linkSet.add("BMW");
        linkSet.add("CMW");
        linkSet.add("Audi");
        linkSet.add("Honda");
        linkSet.add("Honda");
        linkSet.add("honda");

        Set<String> treeSet = new TreeSet<>();
treeSet.add("bmw");
treeSet.add("audi");
treeSet.add("zudi");
treeSet.add("zudi");
treeSet.add("chrysler");
        System.out.println(set);
        System.out.println(list);
        System.out.println(linkSet);

        System.out.println("hash int 5="+ new Integer(5).hashCode());
        System.out.println("hash AAAA="+ "AAAA".hashCode());
        System.out.println("hash AAAA="+ "AAAB".hashCode());
        System.out.println("hash AAAA="+ "A".hashCode());
        System.out.println("hash AAAA="+ "B".hashCode());
    }
}
