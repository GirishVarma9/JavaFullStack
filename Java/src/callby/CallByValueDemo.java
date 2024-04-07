package com.corejava.callby;

public class CallByValueDemo {
    public static void main(String[] args) {
        CallByValueDemo callByValueDemo = new CallByValueDemo();
        int a = 10;
        int b = 20;
        callByValueDemo.increaseBy10AndDisplay(a, b);
        System.out.println("in Main A : " + a);
        System.out.println("In Main B : " + b);
    }

    void increaseBy10AndDisplay(int a, int b) {
        a = a + 10;
        System.out.println("in child method A: " + a);
        b = b + 10;
        System.out.println("in child method B : " + b);
    }
}


