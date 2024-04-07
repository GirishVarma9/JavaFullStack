package com.corejava.constructors;

public class DefaultConstructorDemo {
    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.getId());
        System.out.println(user.getName());
        System.out.println(user.getSalary());
    }
}

class User {
    private int id;
    private String name;
    private double salary;

    /*User(int id, String name, double salary) {}*/

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