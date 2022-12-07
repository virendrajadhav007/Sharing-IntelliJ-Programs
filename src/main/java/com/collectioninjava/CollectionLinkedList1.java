package com.collectioninjava;

import java.util.LinkedList;

public class CollectionLinkedList1 {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList();
        LinkedList<String> l1 = new LinkedList();
        LinkedList<Float> l2 = new LinkedList();
        l.add(147);
        l1.add("Welcome");
        l.add(159);
        l1.add("to the");
        l1.add("India");
        l2.add(1.05f);
        l2.add(12.05f);
        l1.addFirst("First");
        l1.addLast("Last");
        for (Object z : l) {
            System.out.println(z);
        }
        for (Object z1 : l1) {
            System.out.println(z1);
        }
        for (Object z2 : l2) {
            System.out.println(z2);
        }
    }
}