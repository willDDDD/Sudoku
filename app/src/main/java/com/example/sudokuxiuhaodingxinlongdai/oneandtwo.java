package com.example.sudokuxiuhaodingxinlongdai;

public class oneandtwo {
    public static int[] one(int[][] a) {
        int[] r = new int[81];
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                r[k] = a[i][j];
                k++;
            }
        }
        return r;
    }
    public static int[][] two(int[] a) {
        int[][] r = new int[9][9];
        int k = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                r[i][j] = a[k];
                k++;
            }
        }
        return r;
    }
}
