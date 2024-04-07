package com.corejava.test;

public class Test {
    public static void main(String[] args) {
        A a = new B();
        a.test();
    }
}

class A {
    void test() {
        System.out.println("Inside A");
    }
}

class B extends A {
    @Override
    void test() {
        System.out.println("Inside B");
    }
}
