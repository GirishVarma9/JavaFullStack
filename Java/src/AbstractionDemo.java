package com.corejava;

abstract class Cycle {

    // variables in Java classes are always concrete
    int heroCycle =4;
    int atlasCycle = 3;


    // we can have both abstract and concrete methods in abstract class
    public int wheels(int a) {  //---> (concrete method)

        System.out.println("wheels are rotating");
        return a;

    }

    abstract public void handle();

    abstract public void lights();
}

class Bike extends Cycle {

    //when we extend the abstract class we should have to implement the undefined methods of abstract class
    @Override
    public void handle() {
        System.out.println("we use handle to change the directions");
    }

    public void lights() {
        System.out.println("lights are lightning");
    }
}


public class AbstractionDemo {
    public static void main(String[] args) {

        Bike x = new Bike();

        int c = x.heroCycle;
        int d = x.atlasCycle;
        int w = x.wheels(2);

        // if there is nothing to return we just have to call the methods but we cannot print the methods
        x.handle();
        x.lights();

        System.out.println(w+"    "+c+"     "+d);

    }
}
