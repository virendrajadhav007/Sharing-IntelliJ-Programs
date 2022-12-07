package com.collectioninjava;

import java.util.*;

public class CollectionVector {
    public static void main(String[] args) {
       Vector l = new Vector();
       Vector l1 =new Vector();
        l.add("hello");
        l.add("World");
        l.add("Welcome");
        l.add("to the");
        l1.add("India");
        l.add(007);
        l1.add(007);
        l1.add(007);
        l.add("collections");
        l1.add("India");
        l.add("India");
        l.add("India");
     //   l.removeAll(l);                      //remove all the objects present in given collections
      //  l.remove(7);                       //remove given value and if duplication is there then remove first come
     //   l.addAll(l);
      //  l.clear();

        for (Object z1 : l1) {
            System.out.println(z1);
        }
        for(Object z2:l){
            System.out.println(z2);
        }

//        System.out.println(l.contains("hello"));     //only one variable
//        System.out.println(l.containsAll(l));         //total collection name
//        System.out.println(l.equals(8));
  //      System.out.println(l.hashCode());               //hashCod code value of collection
 //       System.out.println(l.isEmpty());                   //true if collection is empty
  //      System.out.println(l.iterator());            //returns iterator value
   //     System.out.println(l.parallelStream());
      //  System.out.println(l.retainAll(l));
      //  System.out.println(l.retainAll(l1));
      //  System.out.println(l.size());                 //give the size of collection
       // System.out.println(l.stream());                 //returns sequential stream
      //  System.out.println(l.toArray());
    }
}
