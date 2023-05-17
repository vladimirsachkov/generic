package com.javacode.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericMethods {

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 0, 8, 5, 6};
        Double[] doubleArray = {0.234, 6.45, 9.034, 1.345, 4.675};
        String[] stringArray = {"abc", "vir", "rtw", "ert"};

        printArray(intArray);
        printArray(doubleArray);
        printArray(stringArray);

        Integer max = findMax(intArray);
        System.out.println("Max for array for Integers " + max);
        System.out.println("Max for array for Double " + findMax(doubleArray));
//        System.out.println("Max for array for String " + findMax(stringArray));

        Number n = Integer.valueOf(20);

//        List<Number> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(6);


        printElements(Arrays.asList(intArray));

        MyBox<Integer> myBox = new MyBox<Integer>("");

        Double aDouble = MyBox.returnValue(0.03);
        System.out.println(aDouble);

    }

    private static <T>  void printArray(T[] intArray) {
        System.out.println("Generic method called");
        for (T element : intArray) {
            System.out.printf("%s, ", element);
        }
        System.out.println();
    }

    private static  void printArray(Integer[] intArray) {
        System.out.println("Non generic method called");
        for (Integer element : intArray) {
            System.out.printf("%s, ", element);
        }
        System.out.println();
    }

    private static <T extends Number & Comparable> T findMax(T[] array) {
        T max = array[0];
        for (T e : array) {
            if(e.compareTo(max) > 0) {
                max = e;
            }
        }

        return max;
    }

    private static void printElements(List<Number> list) {
        for (Number n: list) {
            System.out.println(n);
        }
    }
}
