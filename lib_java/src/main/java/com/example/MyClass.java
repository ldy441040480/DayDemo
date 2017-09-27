package com.example;

import com.example.quick.QuickSort;

public class MyClass {

    public static void main(String[] args) {
        int[] array = QuickSort.sort(QuickSort.ARRAY);
        for (int i : array) {
            System.out.println(i);
        }
    }
}
