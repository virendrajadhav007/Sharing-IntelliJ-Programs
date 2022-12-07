package com.collectioninjava;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionLinkedlist {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("hello");
        l.add("World");
        l.add("Welcome");
        l.add("to the");
        l.add("India");
        l.add(007);
        l.add("collections");
        l.addFirst("First");
        l.addLast("Last");
        for (Object z : l) {
            System.out.println(z);
        }
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
        System.out.println(l.removeFirst());
        System.out.println(l.removeLast());
    }
}
