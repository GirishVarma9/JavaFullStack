package com.corejava;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("which number's factorial:");
        int num = sc.nextInt();

        Factorial fobj = new Factorial();
        int fact = fobj.factorial(num);

        System.out.println("factorial of" + num + "=" + fact);
    }

    int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <=n; i++){
            fact *= i;
            System.out.print(i + " * ");
        }
        return fact;
    }
}

