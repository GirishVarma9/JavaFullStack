package com.corejava.constructors;

public class ConstructorsDemo {
    public static void main(String[] args) {
        System.out.println("With No argument Constructor");
        LocalEmployee localEmployee = new LocalEmployee();
        localEmployee.display();

        /*localEmployee.setId(10);
        localEmployee.setName("Girish");
        localEmployee.setSalary(60000);*/
        System.out.println(localEmployee.getId());
        System.out.println(localEmployee.getName());
        System.out.println(localEmployee.getSalary());

        System.out.println("With Parameterized Constructor");
        LocalEmployee localEmployeeWithParameters = new LocalEmployee(200, "Satish", 80000);
        System.out.println(localEmployeeWithParameters.getId());
        System.out.println(localEmployeeWithParameters.getName());
        System.out.println(localEmployeeWithParameters.getSalary());


    }
}

class LocalEmployee {
    public Object g;
    private int id;
    private String name;
    private double salary;


    //Default Constructor or No argument constructor
    LocalEmployee() {
        id = 100;
        name = "Bharath";
        salary = 800000;
    }

    //Parameterized Constructor

    LocalEmployee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("This is display method");
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

// It s same as method
// It does not have return type
// It has the same name as class name
// It is used for initializing n object
