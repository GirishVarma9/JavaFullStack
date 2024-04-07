package com.corejava;

public class StaticAndNonStaticDemo {

    int a = 100;
    static int b = 200;

    public static void main(String[] args) {
        /*StaticAndNonStaticDemo staticAndNonStaticDemo = new StaticAndNonStaticDemo();
        int a = 300;
        System.out.println("staticAndNonStaticDemo.a: " + staticAndNonStaticDemo.a);
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        //System.out.println(display());

        display();

        int addition = staticAndNonStaticDemo.addition(10, 20);

        System.out.println(staticAndNonStaticDemo.addition(10, 20));
        System.out.println(addition);*/

        Product product = new Product();
        product.showProduct();

        Product.thisIsStaticInAnotherClass();
    }

    static {

    }

    static void display() {
        System.out.println("I am display()...1....!");



        System.out.println("I am display()...2....!");
        System.out.println("I am display()...3....!");
        System.out.println("I am display()...4....!");

        show();

        System.out.println("End of Display....!");
    }

    int addition(int num1, int num2) {

        System.out.println("Addition");
        show();
        System.out.println("Multiplication:" + multiplication(num1, num2));
        return num1 + num2;//should always be the last stmt

        //System.out.println("Girish");Unreachable code, and it leads to compile time error
    }

    static void show() {
        System.out.println("I am show()...1....!");
        System.out.println("I am show()...2....!");
        System.out.println("I am show()...3....!");
        System.out.println("I am show()...4....!");
    }

    int multiplication(int num1, int num2) {
        return num1 * num2;
    }
}


class Product {
    int id = 20;
    String name = "IPad";
    int quantity = 1;
    double price = 130000.78;

    void showProduct(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(quantity);
        System.out.println(price);
    }

    static void thisIsStaticInAnotherClass(){
        System.out.println("This is static method in different class");
    }
}

//from static context we can access only static data


