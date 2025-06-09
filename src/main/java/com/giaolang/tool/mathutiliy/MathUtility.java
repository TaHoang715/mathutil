package com.giaolang.tool.mathutiliy;

public class MathUtility {
    // Calculates factorial of n (n!)
    // Throws IllegalArgumentException for negative numbers
    public static long getFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}