package com.corejava.wrapperclasses;

public class PrimitiveAndString {
    public static void main(String[] args) {
             byte x = 100;
             String s =Byte.toString(x);      // Converted primitive to string
             int y = Integer.parseInt(s);     // Converted string to primitive
    }
}
