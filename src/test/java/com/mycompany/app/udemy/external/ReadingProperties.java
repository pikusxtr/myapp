package com.mycompany.app.udemy.external;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {
    public static void main(String[] args) throws IOException {
        String path = "C:\\NewDev\\myapp\\src\\test\\java\\com\\mycompany\\app\\udemy\\external\\test.properties";
        Properties prop = new Properties();
        FileInputStream fs = new FileInputStream(path);
        prop.load(fs);
        System.out.println(prop.getProperty("name"));
        System.out.println(prop.getProperty("course"));
        prop.setProperty("name", "changed propAAAA");
        prop.setProperty("name2", "AAAASDDDchanged propAAAA");
        System.out.println(prop.getProperty("name"));
        System.out.println(prop.getProperty("name2"));
        System.out.println("conatins value = "+ prop.containsValue("python"));
        //prop.save();
    }
}
