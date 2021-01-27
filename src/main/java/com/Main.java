package com;

import com.cyber.core.Methods;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world");
        //==== Core ===

        Methods methods=new Methods();
        methods.methodA();
        methods.methodA("blA");
       // methods.methodB(5);
        System.out.println(methods.methodB(6));
        System.out.println(methods.methodB());
        methods.methodA();
        Methods.methodC();
    }
}
