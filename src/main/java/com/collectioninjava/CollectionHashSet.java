package com.collectioninjava;

import java.util.HashSet;

public class CollectionHashSet {
    public static void main(String[] args) {
        HashSet l = new HashSet();
        l.add("hello");
        l.add(007);
        l.add(007);
        l.add("India");
        l.add(007);
        l.add("India");

        for (Object z : l) {
            System.out.println(z);
        }
    }
}
