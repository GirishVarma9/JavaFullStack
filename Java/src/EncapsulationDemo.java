package com.corejava;


class Student{
    private int age;
     private String name;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}



public class EncapsulationDemo {
    public static void main(String[] args) {

        Student s = new Student();

        s.setAge(20);
        s.setName("mubeena");

        System.out.println(s.getAge()+"  "+s.getName());

    }
}
