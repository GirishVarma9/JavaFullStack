package com.corejava.callby;

public class CallByReferenceDemo {
    public static void main(String[] args) {
        CallByReferenceDemo callByReferenceDemo = new CallByReferenceDemo();
        Data data = new Data();
        callByReferenceDemo.incrementAndDisplay(data);
        System.out.println("In side main A :" + data.a);
        System.out.println("In side main B :" + data.b);

    }

    void incrementAndDisplay(Data data) {
        data.a = data.a + 10;
        System.out.println("In side method A: " + data.a);
        data.b = data.b + 10;

        System.out.println("In side method B: " + data.b);
    }
}

class Data {
    int a;
    int b;

    Data() {
        a = 10;
        b = 20;
    }
}
