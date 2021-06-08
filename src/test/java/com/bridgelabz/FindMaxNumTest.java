package com.bridgelabz;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindMaxNumTest {
    FindMaxNum findMaxNum = new FindMaxNum();
    @Test
    void givenThreeIntegerNumber_shouldReturn_firstNumberIsMaximum(){
        FindMaxNum<Integer> findMaxNum = new FindMaxNum<>(100, 50, 25);
        int result = findMaxNum.findMax();
        Assertions.assertEquals(100, result);
    }


    @Test
    void givenThreeIntegerNumber_shouldReturn_secondNumberIsMaximum(){
        FindMaxNum<Integer> findMaxNum = new FindMaxNum<>(50, 100, 25);
        int result = findMaxNum.findMax();
        Assertions.assertEquals(100, result);
    }
    @Test
    void givenThreeIntegerNumber_shouldReturn_thirdNumberIsMaximum(){
        FindMaxNum<Integer> findMaxNum = new FindMaxNum<>(50, 25, 100);
        int result = findMaxNum.findMax();
        Assertions.assertEquals(100, result);
    }
    @Test
    void givenThreeFloatNumber_shouldReturn_firstNumberIsMaximum(){
        FindMaxNum<Float> findMaxNum = new FindMaxNum<>(10.0F, 5.0F, 3.0F);
        float result = findMaxNum.findMax();
        Assertions.assertEquals(10.0, result);
    }

    @Test
    void givenThreeFloatNumber_shouldReturn_secondNumberIsMaximum(){
        FindMaxNum<Float> findMaxNum = new FindMaxNum<>(5.0F, 10.0F,3.0F);
        float result = findMaxNum.findMax();
        Assertions.assertEquals(10.0, result);
    }
    @Test
    void givenThreeFloatNumber_shouldReturn_thirdNumberIsMaximum(){
        FindMaxNum<Float> findMaxNum = new FindMaxNum<>(3.0F, 5.0F, 10.0F);
        float result = findMaxNum.findMax();
        Assertions.assertEquals(10.0, result);
    }
    @Test
    void givenThreeString_shouldReturn_firstStringIsMaximum(){
        FindMaxNum<String> findMaxNum = new FindMaxNum<>("peach","apple","banana");
        String result = findMaxNum.findMax();
        Assertions.assertEquals("peach", result);
    }

    @Test
    void givenThreeString_shouldReturn_secondStringIsMaximum(){
        FindMaxNum<String> findMaxNum = new FindMaxNum<>("apple", "peach","banana");
        String result = findMaxNum.findMax();
        Assertions.assertEquals("peach", result);
    }
    @Test
    void givenThreeString_shouldReturn_thirdStringIsMaximum(){
        FindMaxNum<String> findMaxNum = new FindMaxNum<>("apple", "banana", "peach");
        String result = findMaxNum.findMax();
        Assertions.assertEquals("peach", result);
    }

}
