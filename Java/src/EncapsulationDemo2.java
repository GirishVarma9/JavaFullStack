package com.corejava;


class Employee{
    private String name;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }
     public double getSalary(){
        return salary;
     }
}

public class EncapsulationDemo2 {
    public static void main(String[] args) {
        Employee e = new Employee();

        e.setName("vineela");
        e.setSalary(10500.254);
        System.out.println(e.getName()+"                                   "+e.getSalary());

    }

}
