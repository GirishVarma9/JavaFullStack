package com.corejava;

public class HelloWorld {

    //date_type name_of_the_member
    int a1;//Global variables


    //return_type method_name(argument_list){
        //body
    //}
    //Definition Of the method
    static void display() {
        int a;//local variables
        System.out.println("Girish");
        System.out.println("Sathish");
        System.out.println("Bharath");
    }

    static void show(String name1, String name2, String name3) {//formal arguments
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
    }

    //Members
        //1. Data Members
        //2. Blocks
            //2.1 Methods or Member Functions
            //2.2 Instantiation Blocks
            //2.3 Static Blocks

    public static void main(String[] args) {

        System.out.println("Hello Java 8");

        //Calling statement of the method
        display();
        show("Girish", "Sathish", "Bharath");//argument-list (actual arguments)

    }
}

//Always class is the starting point for compilation
//Always main method is starting point for execution