package com.collectioninjava;

import java.util.ArrayList;

public class CollectionArrayList {
    public static void main(String[] args) {
      ArrayList listofarray=new ArrayList();
        listofarray.add("hello");
        listofarray.add("My");
        listofarray.add("Name");
        listofarray.add("Is");
        listofarray.add("Virendra");
        listofarray.add(54.6);
        listofarray.add(007);
        listofarray.add(null);
        listofarray.add("collections");
        listofarray.add(10101010);



        for(Object z:listofarray){
            System.out.println(z);
        }
    }
}
