package com.example.sudokuxiuhaodingxinlongdai;

/**
 * switch between int[] and Integer[] array.
 */
public class InttoInteger {
    public static Integer[] cii(int[] a) {
        Integer[] r = new Integer[81];
        for (int i = 0; i < 81; i++) {
            r[i] = a[i];
        }
        return r;
    }
}
