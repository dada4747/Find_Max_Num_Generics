package com.bridgelabz;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FindMaxNum<E extends  Comparable<E>> {
    E value1;
    E value2;
    E value3;

    public FindMaxNum(E value1, E value2, E value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public FindMaxNum() {

    }
    public E findMax(){
        return findMax(value1, value2, value3);
    }

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
