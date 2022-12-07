package com.collectioninjava;

import java.util.Vector;

public class CollectionVectorClass1 {
    public static void main(String[] args) {
        Vector l = new Vector();
        Vector l1 = new Vector();
        l.add("hello");
        l.add(007);
        l.add(007);
        l.add("India");
        l1.add(007);
        l1.add("India");
        l.addAll(l1);                           //adds objects of l1 collections
       l1.clear();
       l.remove(0);                       //remove object at given index
       l.removeAll(l);                        //remove all objects from given collection
        for (Object z : l) {
            System.out.println(z);
        }
        for (Object z1 : l1) {
            System.out.println(z1);
        }
        System.out.println(l.contains(7));            //if objects in l collections contains same object then true
        System.out.println(l1.containsAll(l));    //if objects in l1 containts objects in collection l then true if not then false
        System.out.println(l.equals(l1));         //compares objects in given collections if same then true otherwise false
        System.out.println(l.hashCode());
        System.out.println(l1.hashCode());         //display hashcode values
        System.out.println(l.isEmpty());           //shows true value if collections is empty otherwise false
        System.out.println(l.iterator());
        System.out.println(l1.iterator());
        System.out.println(l.parallelStream());
        System.out.println(l1.parallelStream());
        System.out.println(l.retainAll(l1));           //  give us boolean result if change happens then result is true if not then false
        System.out.println(l.size());                   //size of l collection is 5
        System.out.println(l1.size());                   //sixeof collection l1 is 2
        System.out.println(l.stream());
        System.out.println(l1.stream());
    }
}
