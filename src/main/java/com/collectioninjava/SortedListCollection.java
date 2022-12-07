package com.collectioninjava;


import java.util.SortedSet;
import java.util.TreeSet;

public class SortedListCollection {
    public static void main(String[] args) {
        SortedSet l1=new TreeSet();
        SortedSet l2=new TreeSet();
        l1.add(54);
        l1.add(84);
        l2.add("Ants");
        l2.add("Baloon");
        l2.add("Zebra");
        l2.add("Ants");
        l1.add(64);
        l1.add(8);
        l1.add(846);
        for(Object o1:l1){
            System.out.println(o1);
        }
        for(Object o2:l2){
            System.out.println(o2);
        }
    }
}
