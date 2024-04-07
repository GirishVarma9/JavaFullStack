package com.corejava;

public class CreateAnObject {

    int a;
    long l;
    double d;

    //public :every body can access
    //static : it will be executed without creating an object
    //void : it returns nothing
    //
    public static void main(String[] args) {
        //Class-name reference-name = new class-name();
        CreateAnObject createAnObject = new CreateAnObject();

        createAnObject.showDetails();
        System.out.println(createAnObject.a);
        System.out.println(createAnObject.l);
        System.out.println(createAnObject.d);




        thisIsStaticMethod();
    }

    static {
        System.out.println("I am first");
    }

    void showDetails() {
        System.out.println("This is showDetails()....");
    }

    static void thisIsStaticMethod() {
        System.out.println("This is thisIsStaticMethod()....");
    }
}
