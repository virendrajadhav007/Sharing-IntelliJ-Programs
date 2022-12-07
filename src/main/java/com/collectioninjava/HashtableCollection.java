package com.collectioninjava;

import java.util.Hashtable;
import java.util.Map;

public class HashtableCollection {
    public static void main(String args[]){
        Hashtable<Integer,String> hm=new Hashtable<>();

        hm.put(1,"Mango");
        hm.put(3,"Bannanna");
        hm.put(2,"Orange");
        hm.put(6,"Pineaple");

        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
