package com.corejava;

import java.util.Scanner;

public class Calculator {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of no1");
        int no1 = sc.nextInt();

        System.out.println("enter the value of no2");
        int no2 = sc.nextInt();

        System.out.println("enter required operation[+,-,*,/]");
        char operator = sc.next().charAt(0);

        int result = calculate(no1, no2, operator);


        System.out.println(no1 + " " + operator + " " + no2 + "= " + result);


        sc.close();

    }

    // METHOD TO PERFORM OPERATIONS
    static int calculate(int x, int y, char operator) {
        int result = 0;

        switch (operator) {

            case '+':
                result = x + y;
                break;

            case '-':
                result = x - y;
                break;

            case '*':
                result = x * y;
                break;

            case '/':
                result = x / y;
                break;

        }
        return result;
    }
}
