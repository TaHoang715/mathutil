package com.giaolang.tool;

import com.giaolang.tool.mathutiliy.MathUtility;

public class Main {
    public static void main(String[] args) {
        // Original welcome message and loop
        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        // Call the separate method to test factorial
        testFactorial();
    }

    // Separate method to test factorial logic
    public static void testFactorial() {
        // Test case 1: n = 1
        int n = 1;
        long expected = 1;
        long actual = MathUtility.getFactorial(n);
        if (actual == expected) {
            System.out.println("Test passed: Factorial of " + n + " is " + actual + " as expected.");
        } else {
            System.out.println("Test failed: Factorial of " + n + " is " + actual + ", but expected " + expected + ".");
        }

        // Test case 2: n = 0
        n = 0;
        expected = 1;
        actual = MathUtility.getFactorial(n);
        if (actual == expected) {
            System.out.println("Test passed: Factorial of " + n + " is " + actual + " as expected.");
        } else {
            System.out.println("Test failed: Factorial of " + n + " is " + actual + ", but expected " + expected + ".");
        }

        // Test case 3: n = 5
        n = 5;
        expected = 120;
        actual = MathUtility.getFactorial(n);
        if (actual == expected) {
            System.out.println("Test passed: Factorial of " + n + " is " + actual + " as expected.");
        } else {
            System.out.println("Test failed: Factorial of " + n + " is " + actual + ", but expected " + expected + ".");
        }

        // Test case 4: n = -1 (should throw exception)
        try {
            n = -1;
            actual = MathUtility.getFactorial(n);
            System.out.println("Test failed: Expected IllegalArgumentException for n = " + n);
        } catch (IllegalArgumentException e) {
            System.out.println("Test passed: Correctly threw IllegalArgumentException for n = " + n);
        }
    }
}

    //tdo test driven development
    //viết code chính tả và viết test case run song song với nhau
    //cứ viết đc deo nào thì có test case cho nó
    //tesr case dùng để test hàm (ko nhầm với tesr aopp- tets màn hình và nhập liệu ) chỉ dành cho dân dev )
    //nhờ tdd tdd đóng góp 1 phần giúp ta tự động hóa quá trình build check bug đóng gói nếu code ổn , deploy lên staging server
    //code ---> check code (unit test )
    //okk thì đóng gói app
    //đưa app lên server
    //quy trình này có ci/cd

    //cv có 1 mục
    //technical skills
    //junit
    //TDD
    //ci/cd
    //maven





