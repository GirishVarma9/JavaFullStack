package com.corejava;

public class DefaultValuesDemo {

    //Global Variables
    byte bt;
    short sh;
    int i;
    float f;
    long l;
    double d;
    char ch;
    boolean b;
    String str;

    public static void main(String[] args) {
        DefaultValuesDemo defaultValuesDemo = new DefaultValuesDemo();
        System.out.println(defaultValuesDemo.bt);
        System.out.println(defaultValuesDemo.sh);
        System.out.println(defaultValuesDemo.i);
        System.out.println(defaultValuesDemo.f);
        System.out.println(defaultValuesDemo.l);
        System.out.println(defaultValuesDemo.d);
        System.out.println(defaultValuesDemo.ch);
        System.out.println(defaultValuesDemo.b);
        System.out.println(defaultValuesDemo.str);
    }

    void display() {
        int localVariable = 10;//Local Variable
        System.out.println(localVariable);
    }
}
