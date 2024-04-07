package com.corejava;

public class Assignment1 {
    static int a;


    public static void main(String[] args) {
        Assignment1 obj1 = new Assignment1();
        a++;
        Assignment1 obj2 = new Assignment1();
        a++;
        Assignment1 obj3 = new Assignment1();
        a++;

        System.out.println(obj3.a);

    }
}
