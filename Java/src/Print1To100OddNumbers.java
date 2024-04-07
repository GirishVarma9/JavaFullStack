package com.corejava;

public class Print1To100OddNumbers {
    public static void main(String[] args) {
        /*for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }*/

        String department = "HR111 ,HR";

        String firstDepartment = department.split(",")[0].trim();

        System.out.println(firstDepartment);
    }
}
