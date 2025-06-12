package com.giaolang.tool.mathutiliy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {

    //tách data ra khỏi hàm tt
    //dựng mảng 2 chiều , input , expected
    //sau đó fill vào câu lệnh so sánh
    //mảng này sẽ là nguồn dữ liệu đẻ hàm so sánh gọi và nhiêều lần như thế do nhiều data
    //->nguồn này là static để tìm kiếm nhanh chóng
    public static Object[][] initTestData() {
        return new Object[][] { {0,1},
                {1,1},
                {2,2},
                {3,6},
                {4,24},
                {5,120},
                {6,7200}
        };
    }

    @ParameterizedTest
    @MethodSource("initTestData")
    public void testFactorialGivenRightArgumentRunsWell(int n, long expected){
        assertEquals(expected,MathUtility.getFactorial(n));
    }
}