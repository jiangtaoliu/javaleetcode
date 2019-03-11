package com.easy.reverseinterger;

public class Solution3 {
    int reverse(int x) {
        long result = 0;
        int sign = x > 0 ? 1 : -1;
        int normalized = 0;
        if (x<0) {
            normalized = 0-x;
        } else {
            normalized = x;
        }
        while (normalized > 0) {
            long val = normalized % 10;
            result = val + result * 10;
            normalized /= 10;

        }

        return result > 2147483647 ? 0 : (int) (sign * result);
    }
}
