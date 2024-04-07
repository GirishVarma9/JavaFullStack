package com.corejava;

public class Print1To100EvenNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2  == 0) {
                System.out.println(i);
            }
        }
    }
}
