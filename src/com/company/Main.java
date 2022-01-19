package com.company;

import java.util.*;

@FunctionalInterface
interface Test {
    public int check(int a1, int a2);
}

public class Main {

    public static void main(String[] args) {

        Test a = (int a1,int a2) -> {
            System.out.println("Hello " + (a1+a2));
            return 123;
        };

        int tmp = a.check(5,3);

        System.out.println(tmp);

//        List <String> a = Arrays.asList("apple");
//        System.out.println(a);
//
//
//
//        Fruit f = new Fruit();
//
//        f.name = "Apple";
//        f.eat();
//        f.eat();
    }
}
