package com.corejava;

import java.util.Scanner;

public class PrintNumbers1ToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Maximum Number");
        // data type_data name = data value;
        int n = scanner.nextInt();
        for (int a = 1; a <= n; a++) {
            System.out.println("the number ="+a);



        }
    }
}
