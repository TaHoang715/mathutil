package com.giaolang.tool.mathutiliy;

public class MathUtility {
    // Calculates factorial of n (n!)
    // Throws IllegalArgumentException for negative numbers
//    public static long getFactorial(int n) {
//        if (n < 0) {
//            throw new IllegalArgumentException("Negative numbers are not allowed");
//        }
//        if (n == 0 || n == 1) {
//            return 1;
//        }
//        long result = 1;
//        for (int i = 2; i <= n; i++) {
//            result *= i;
//        }
//        return result;
//    }
    public static long getFactorial(int n) {
        if (n < 0 || n >20) {
            throw new IllegalArgumentException("Negative numbers are not allowed");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n *getFactorial(-1);
        }
        //dem len sv
    //1.code toi uu ngon vi pass test case
    //2. test lai tung test rat mat cong, nay script tu dong , khoe re
    }
    //de quy goi lai chinh minh voi quy mo nho hon