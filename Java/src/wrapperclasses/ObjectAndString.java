package com.corejava.wrapperclasses;

public class ObjectAndString {
    public static void main(String[] args) {
        long x = 2000;
        Long y = Long.valueOf(x);   //Converted primitive to object
        String s = y.toString();    //converted object to string
        Long z =  Long.valueOf(s);  // converted string to object
    }
}