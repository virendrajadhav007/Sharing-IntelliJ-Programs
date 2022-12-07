package com.collectioninjava;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
    public static void main(String[] args) {
        Map<Integer,String> m1=new HashMap<>();
            m1.put(1,"Morning");
            m1.put(4,"Monday");
        m1.put(5,"Monday");
        m1.put(2,"afternoon");
        m1.put(3,"Evening");
        m1.put(4,"Sunday");
        for (Map.Entry<Integer,String>s:(m1.entrySet())){
            System.out.println(s.getKey()+" "+s.getValue());
        }
    }
}
