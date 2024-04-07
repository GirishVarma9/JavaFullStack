package com.corejava;


class Ball{
    void A(){
        System.out.println("this is method in ball class");
    }
}
class Bat{
    void A(){
        System.out.println("this is method in bat class");
    }
}
public class OverloadingDemo {
    public static void main(String[] args) {
        OverloadingDemo overloadingDemo = new OverloadingDemo();
        Ball v= new Ball();
        v.A();
        Bat u = new Bat();
        u.A();
        System.out.println(overloadingDemo.addition(10, 20));
        System.out.println(overloadingDemo.addition(10, 20, 30));
        System.out.println(overloadingDemo.addition(10, 20, 30, 40));
        System.out.println(overloadingDemo.addition(1.2, 3.4, 5.6));
    }

     int addition(int a, int b) {
        return a+b;
    }

    int addition(int a, int b, int c) {
        return a + b + c;
    }

    int addition(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    double addition(double a, double b, double c) {
        return a + b + c;
    }
}

/// If Methods are sharing the same name but may be same or different return type and type signature/argument list called as method overloading
