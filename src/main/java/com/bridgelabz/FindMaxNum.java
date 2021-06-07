package com.bridgelabz;

public class FindMaxNum {

    public int findMaxIntNumber(Integer num1, Integer num2, Integer num3) {
        Integer maxNumber = num1;
        if (num2.compareTo(maxNumber) > 0){
            maxNumber = num2;
        }
        if (num3.compareTo(maxNumber) > 0){
            maxNumber = num3;
        }
        return maxNumber;
    }

    public float findMaxFloatNumber(Float num1, Float num2, Float num3) {
        Float maxNumber = num1;
        if (num2.compareTo(maxNumber) > 0){
            maxNumber = num2;
        }
        if (num3.compareTo(maxNumber) > 0){
            maxNumber = num3;
        }
        return maxNumber;
    }

    public String findMaxString(String str1, String str2, String str3) {
        String maxString = str1;
        if (maxString.equals(str2)){
            maxString = str2;
        }
        if (maxString.equals(str2)){
            maxString = str3;
        }
        return maxString ;
    }
}
