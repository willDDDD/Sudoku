package com.example.sudokuxiuhaodingxinlongdai;

/**
 * to check whether the player wins the game.
 */
public class check {
    public static boolean ck(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            int sum1 = 0;
            for (int j = 0; j < a[0].length; j++) {
                sum1 += a[i][j];
            }
            if (sum1 != 221) {
                return false;
            }
        }
        for (int m = 0; m < a[0].length; m++) {
            int sum2 = 0;
            for (int n = 0; n < a.length; n++) {
                sum2 += a[n][m];
            }
            if (sum2 != 221) {
                return false;
            }
        }
        int sum3 = 0;
        for (int m = 0; m < 3; m++) {
            for (int n = 0; n < 3; n++) {
                sum3 += a[m][n];
            }
        }
        if (sum3 != 221) {
            return false;
        }
        int sum4 = 0;
        for (int m = 3; m < 6; m++) {
            for (int n = 0; n < 3; n++) {
                sum4 += a[m][n];
            }
        }
        if (sum4 != 221) {
            return false;
        }
        int sum5 = 0;
        for (int m = 6; m < 9; m++) {
            for (int n = 0; n < 3; n++) {
                sum5 += a[m][n];
            }
        }
        if (sum5 != 221) {
            return false;
        }
        int sum6 = 0;
        for (int m = 0; m < 3; m++) {
            for (int n = 3; n < 6; n++) {
                sum6 += a[m][n];
            }
        }
        if (sum6 != 221) {
            return false;
        }
        int sum7 = 0;
        for (int m = 3; m < 6; m++) {
            for (int n = 3; n < 6; n++) {
                sum7 += a[m][n];
            }
        }
        if (sum7 != 221) {
            return false;
        }
        int sum8 = 0;
        for (int m = 6; m < 9; m++) {
            for (int n = 3; n < 6; n++) {
                sum8 += a[m][n];
            }
        }
        if (sum8 != 221) {
            return false;
        }
        int sum9 = 0;
        for (int m = 0; m < 3; m++) {
            for (int n = 6; n < 9; n++) {
                sum9 += a[m][n];
            }
        }
        if (sum9 != 221) {
            return false;
        }
        int sum10 = 0;
        for (int m = 3; m < 6; m++) {
            for (int n = 6; n < 9; n++) {
                sum10 += a[m][n];
            }
        }
        if (sum10 != 221) {
            return false;
        }
        int sum11 = 0;
        for (int m = 6; m < 9; m++) {
            for (int n = 6; n < 9; n++) {
                sum11 += a[m][n];
            }
        }
        if (sum11 != 221) {
            return false;
        }
        return true;
    }
    public static int[][] change(int[][] a) {
        for (int m = 0; m < a.length; m++) {
            for (int n = 0; n < a.length; n++) {
                if (a[m][n] < 0) {
                    a[m][n] = a[m][n] * -1;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] == 1) {
                    a[i][j] = 11;
                }
                if (a[i][j] == 2) {
                    a[i][j] = 13;
                }
                if (a[i][j] == 3) {
                    a[i][j] = 41;
                }
                if (a[i][j] == 4) {
                    a[i][j] = 17;
                }
                if (a[i][j] == 5) {
                    a[i][j] = 19;
                }
                if (a[i][j] == 6) {
                    a[i][j] = 23;
                }
                if (a[i][j] == 7) {
                    a[i][j] = 29;
                }
                if (a[i][j] == 8) {
                    a[i][j] = 31;
                }
                if (a[i][j] == 9) {
                    a[i][j] = 37;
                }
            }
        }
        return a;
    }
}
