package com.collectioninjava;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class FilrProperties {
    public static void main(String[] args) throws IOException {
        FileReader f1=new FileReader("D:/JAVA/File Class IN Java/File For Java 1.txt");
        Properties p1=new Properties();
        p1.load(f1);
        System.out.println(p1.getProperty("name"));
    }
}
