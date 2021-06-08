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
        E max = findMax(value1, value2, value3);
        printMaximum(max);
        return max;

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
    public static <E extends Comparable<E>> E findMoreMax(E... args){
        List<E> list = Arrays.asList(args);
        Collections.sort(list);
        return list.get(list.size()-1);
    }
    public static <E> void printMaximum(E max){
        System.out.println("Maximum Value is:" + max);
    }

}
