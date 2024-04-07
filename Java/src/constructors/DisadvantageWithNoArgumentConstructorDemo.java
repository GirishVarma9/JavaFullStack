package com.corejava.constructors;

public class DisadvantageWithNoArgumentConstructorDemo {
    public static void main(String[] args) {
        System.out.println("1::");
        LocalEmployee localEmployee = new LocalEmployee();
        System.out.println(localEmployee.getId());
        System.out.println(localEmployee.getName());
        System.out.println(localEmployee.getSalary());

        System.out.println("2::");
        LocalEmployee localEmployee1 = new LocalEmployee();
        System.out.println(localEmployee1.getId());
        System.out.println(localEmployee1.getName());
        System.out.println(localEmployee1.getSalary());

        System.out.println("3::");
        LocalEmployee localEmployee2 = new LocalEmployee();
        System.out.println(localEmployee2.getId());
        System.out.println(localEmployee2.getName());
        System.out.println(localEmployee2.getSalary());


        System.out.println("P1::");
        LocalEmployee localEmployeeP1 = new LocalEmployee(1, "Girish", 60000);
        System.out.println(localEmployeeP1.getId());
        //System.out.println(localEmployeeP1.g
        //System.ou

        System.out.println("P2::");
        LocalEmployee localEmployeeP2 = new LocalEmployee(2, "Bharath", 80000);
        System.out.println(localEmployeeP2.getId());
        System.out.println(localEmployeeP2.getName());
        System.out.println(localEmployeeP2.getSalary());
        

        System.out.println("P3::");
        LocalEmployee localEmployeeP3 = new LocalEmployee(3, "Sathish", 80000);
        System.out.println(localEmployeeP3.getId());
        System.out.println(localEmployeeP3.getName());
        System.out.println(localEmployeeP3.getSalary());


    }
}
