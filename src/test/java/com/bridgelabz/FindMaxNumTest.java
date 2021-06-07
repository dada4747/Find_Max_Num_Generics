package com.bridgelabz;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindMaxNumTest {
    FindMaxNum findMaxNum = new FindMaxNum();
    @Test
    void givenThreeIntegerNumber_shouldReturn_firstNumberIsMaximum(){
        int result = findMaxNum.findMaxIntNumber(100,50,30);
        Assertions.assertEquals(100, result);
    }

    @Test
    void givenThreeIntegerNumber_shouldReturn_secondNumberIsMaximum(){
        int result = findMaxNum.findMaxIntNumber(50,100,30);
        Assertions.assertEquals(100, result);
    }
    @Test
    void givenThreeIntegerNumber_shouldReturn_thirdNumberIsMaximum(){
        int result = findMaxNum.findMaxIntNumber(30,50,100);
        Assertions.assertEquals(100, result);
    }
    @Test
    void givenThreeFloatNumber_shouldReturn_firstNumberIsMaximum(){
        float result = findMaxNum.findMaxFloatNumber(10.0F, 5.0F, 3.0F);
        Assertions.assertEquals(10.0, result);
    }

    @Test
    void givenThreeFloatNumber_shouldReturn_secondNumberIsMaximum(){
        float result = findMaxNum.findMaxFloatNumber(5.0F, 10.0F,3.0F);
        Assertions.assertEquals(10.0, result);
    }
    @Test
    void givenThreeFloatNumber_shouldReturn_thirdNumberIsMaximum(){
        float result = findMaxNum.findMaxFloatNumber(3.0F, 5.0F, 10.0F);
        Assertions.assertEquals(10.0, result);
    }
}
