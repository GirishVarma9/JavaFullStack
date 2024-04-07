package com.corejava.wrapperclasses;

public class PrimitiveAndObject {
    public static void main(String[] args) {
        int x =100;
        Integer y = Integer.valueOf(x);    // Converted primitive to object
        int z = y.intValue();              // Converted object to primitive

    }
}
