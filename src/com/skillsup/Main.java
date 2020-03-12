package com.skillsup;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a = { 2, 3, 1, 7, 11 };
        Arrays.sort(a, 1, 3);

        System.out.println(Arrays.toString(a));    // [4, 1, 2, 5, 3]
    }
}
