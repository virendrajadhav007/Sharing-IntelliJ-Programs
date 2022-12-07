package com.collectioninjava;

import java.util.ArrayList;

public class CollectionArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> listofarray = new ArrayList();
        ArrayList<Integer> listofarray1 = new ArrayList();
        listofarray1.add(15);
        listofarray1.add(16);
        listofarray.add("GoodMorning");
        listofarray1.add(20);
        listofarray.add("Java");
        listofarray.add("Collections");
        listofarray.add(null);
        listofarray1.add(41);
        listofarray.add("Har har Mahadev");

        for (Object z : listofarray) {
            System.out.println(z);
        }
        for(Object z1:listofarray1){
            System.out.println(z1);
        }
    }
}
