package com.javacode.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsMain {

    public static void main(String[] args) {

        Container<Integer> box = new Container(1);

        Container<String> box2 = new Container("2");

        System.out.println((Integer)box.getObject1()*2);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

    }
}
