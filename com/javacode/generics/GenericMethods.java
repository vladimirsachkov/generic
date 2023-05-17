package com.javacode.generics;

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
}
