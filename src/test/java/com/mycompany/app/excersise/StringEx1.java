package com.mycompany.app.excersise;

import com.sun.xml.internal.ws.util.StringUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringEx1 {
    public static void main(String[] args) {
//        String strOriginal = "this is a test string";
        String testA = "abcde";

         List<String> kpiList =  Arrays.asList(testA.split(""));
        System.out.println(kpiList.get(0));
        System.out.println(kpiList.get(1));
        String strOriginal = "a";
        System.out.println(strOriginal);
        String reversed = "";
        for (String item : strOriginal.split("\\s+")) {
            reversed =  reverseWord(item) + " " + reversed;
            System.out.println("in loop="+ reversed);
        }
        System.out.println("reversed is="+ reversed.trim());

    }
    public static String reverseWord(String original){
        String reversed="";
        for (String item:Arrays.asList(original.split(""))
             ) {
            reversed = item + reversed;
        }
        return reversed;
    }
}
