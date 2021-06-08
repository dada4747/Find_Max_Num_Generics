package com.bridgelabz;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindMaxNumTest {
    FindMaxNum findMaxNum = new FindMaxNum();
    @Test
    void givenThreeIntegerNumber_shouldReturn_firstNumberIsMaximum(){
        int result = findMaxNum.findMax(100,50,30);
        Assertions.assertEquals(100, result);
    }

    @Test
    void givenThreeIntegerNumber_shouldReturn_secondNumberIsMaximum(){
        int result = findMaxNum.findMax(50,100,30);
        Assertions.assertEquals(100, result);
    }
    @Test
    void givenThreeIntegerNumber_shouldReturn_thirdNumberIsMaximum(){
        int result = findMaxNum.findMax(30,50,100);
        Assertions.assertEquals(100, result);
    }
    @Test
    void givenThreeFloatNumber_shouldReturn_firstNumberIsMaximum(){
        float result = findMaxNum.findMax(10.0F, 5.0F, 3.0F);
        Assertions.assertEquals(10.0, result);
    }

    @Test
    void givenThreeFloatNumber_shouldReturn_secondNumberIsMaximum(){
        float result = findMaxNum.findMax(5.0F, 10.0F,3.0F);
        Assertions.assertEquals(10.0, result);
    }
    @Test
    void givenThreeFloatNumber_shouldReturn_thirdNumberIsMaximum(){
        float result = findMaxNum.findMax(3.0F, 5.0F, 10.0F);
        Assertions.assertEquals(10.0, result);
    }
    @Test
    void givenThreeString_shouldReturn_firstStringIsMaximum(){
        String result = findMaxNum.findMax("peach","apple","banana");
        Assertions.assertEquals("peach", result);
    }

    @Test
    void givenThreeString_shouldReturn_secondStringIsMaximum(){
        String result = findMaxNum.findMax("apple", "peach","banana");
        Assertions.assertEquals("peach", result);
    }
    @Test
    void givenThreeString_shouldReturn_thirdStringIsMaximum(){
        String result = findMaxNum.findMax("apple", "banana", "peach");
        Assertions.assertEquals("peach", result);
    }

}
