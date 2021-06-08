package com.bridgelabz;

public class FindMaxNum {

    public <E extends Comparable<E>> E findMax(E value1, E value2, E value3) {
        E maxNumber = value1;
        if (value2.compareTo(maxNumber) > 0){
            maxNumber = value2;
        }
        if (value3.compareTo(maxNumber) > 0){
            maxNumber = value3;
        }
        return maxNumber;
    }
}
