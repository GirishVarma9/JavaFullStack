package com.corejava.operators;

public class UnaryOperators {
    public static void main(String[] args) {

        //pre increment..
        int x = 10;
        int y = ++x;
        System.out.println("value of x="+x);
        System.out.println("value of y="+y);

        //post increment
        int a = 15;
        int b = a++;
        System.out.println("value of a="+a);
        System.out.println("value of b="+b);

        //pre decrement
        int c = 20;
        int d = --c;
        System.out.println("value of c="+c);
        System.out.println("value of d="+d);

        //post decrement
        int e = 25;
        int f = e--;
        System.out.println("value of e="+e);
        System.out.println("value of f="+f);

    }
}
