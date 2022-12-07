package com.arrayinjava;

public class InstanceVariable {
    int z=45;
float v=4.5f;
    int x=12;

    public static void main(String[] args) {
        //int x=12;
       InstanceVariable c =new InstanceVariable();
        System.out.println(c.z*c.x);
        System.out.println(c.v+c.z-c.x);

    }
}
