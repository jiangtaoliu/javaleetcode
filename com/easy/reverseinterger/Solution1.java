package com.easy.reverseinterger;

public class Solution1 {
    int reverse(int x) {
        long result = 0;
        int sign = x > 0 ? 1 : -1;
        int normalized = Math.abs(x);
        while (normalized > 0) {
            long val = normalized % 10;
            result = val + result * 10;
            normalized /= 10;

        }

        return result > Integer.MAX_VALUE ? 0 : (int) (sign * result);
    }
}
