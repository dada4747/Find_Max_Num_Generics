package com.bridgelabz;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindMaxNumTest {
    FindMaxNum findMaxNum = new FindMaxNum();
    @Test
    void givenThreeIntegerNumber_shouldReturn_firstNumberIsMaximum(){
        int result = findMaxNum.findMaxNumber(100,50,30);
        Assertions.assertEquals(100, result);
    }

    @Test
    void givenThreeIntegerNumber_shouldReturn_secondNumberIsMaximum(){
        int result = findMaxNum.findMaxNumber(50,100,30);
        Assertions.assertEquals(100, result);
    }
    @Test
    void givenThreeIntegerNumber_shouldReturn_thirdNumberIsMaximum(){
        int result = findMaxNum.findMaxNumber(30,50,100);
        Assertions.assertEquals(100, result);
    }

}
