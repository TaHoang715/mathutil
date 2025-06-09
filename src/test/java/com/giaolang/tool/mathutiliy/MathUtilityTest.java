package com.giaolang.tool.mathutiliy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    @Test
    void testFactorialGivenRightArgument0RunsWell() {
        int n = 0;
        long expected =1;
        long actual = MathUtility.getFactorial(n);
        assertEquals(expected,actual);

    }


    @Test
        //test with n =0
    void testFactorialGivenRightArgument1RunsWell() {
        int n = 1;
        long expected =1; //hy vọng n =0 có giá trị là 1
        long actual = MathUtility.getFactorial(n);
        assertEquals(expected,actual);


    }



    @Test
        //test with n =3
    void testFactorialGivenRightArgumentRunsWell() {

        assertEquals(2,MathUtility.getFactorial(2)); //so sánh thực tế có như kì vọng ko
        //nếu ko thì ra màu đỏ
        //nếu có ra màu tick xanh
        assertEquals(6,MathUtility.getFactorial(3));
        assertEquals(24,MathUtility.getFactorial(4));
        assertEquals(120,MathUtility.getFactorial(5));

    }


    //test bat ngoai le
    //verify getFactorial( with n <0
    //steps
    //1.given an invalid number n =-5
    //2.invoke the function getFactorial(-5)
    //expected result
    //an IllegalArgumentException will be thrown
    //neu dua -5 hy vong se nem ve ngoai le


    @Test
    public void testFactorialGivenMinus5ThrowException() {
        //Mathuility.getFactorial(-5);
        //ta phai kiem soat, ta phai do xem ngoai le da den chua neu la -5 dua vao!!!!
        assertThrows(IllegalArgumentException.class, () -> MathUtility.getFactorial(-5));
        //so sanh, do xem, ngoai le da xh chua neu chua goi -5!
        //cu phap lamda
    }






}
