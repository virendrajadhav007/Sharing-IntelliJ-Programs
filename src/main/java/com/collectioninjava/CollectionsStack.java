package com.collectioninjava;

import java.util.Stack;
import java.util.Vector;

public class CollectionsStack {
    public static void main(String[] args) {
        Stack l = new Stack();
      Stack l1 = new Stack();
        l.add("hello");
        l.add(007);
        l.add(007);
        l.add("India");
        l1.add(007);
        l1.add("India");
        l.push("hii");
        l.pop();                                 //l collection last object is removed
        for (Object z : l) {
            System.out.println(z);
        }
        for (Object z1 : l1) {
            System.out.println(z1);
        }

        System.out.println(l.empty());              //If collection is empty then true otherwise false
    }
}

