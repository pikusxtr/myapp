package com.mycompany.app.udemy.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsDemo {
    public static void main(String[] args) {
        //map key-> value
        Map<Integer, String> map = new HashMap<Integer, String>();
        //hashMap does not maintain order
        map.put(1, "BMW");
        map.put(6, "Audi");
        map.put(4, "Honda");
String value1 = map.get(2);
        System.out.println("val1= "+ value1);
        //keys are unique, values can be duplicated
        //if key not exist null value is returned
        map.put(2, "BMW");
        System.out.println("contains bm,w=" + map.containsValue("BMW"));
        //entry set to iterate through hashMap

        for(Map.Entry<Integer, String > entry: map.entrySet()){
            int key= entry.getKey();
            String value =entry.getValue();
            System.out.println("key="+ key+"  value=" + value);
        }

        for(Integer key: map.keySet()){
            String value = map.get(key);
        }

        Map<Integer, String> linkedMap = new LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();
        linkedMap.put(1, "BMW");
        linkedMap.put(6, "Audi");
        linkedMap.put(4, "Honda");

        treeMap.put(1, "BMW");
        treeMap.put(6, "Audi");
        treeMap.put(4, "Honda");

        for(Integer key:linkedMap.keySet()){
            String value = linkedMap.get(key);
            System.out.println("linked valkue=" + value);
            //linked map maintains teh order as entered

        }
        for(Integer key:treeMap.keySet()){
            String value = treeMap.get(key);
            System.out.println(key+"tree valkue=" + value);
            //linked map maintains teh order as entered

        }
    }
}
