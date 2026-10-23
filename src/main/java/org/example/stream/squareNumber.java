package org.example.stream;

import java.util.*;
import java.util.stream.*;

public class squareNumber {
    public static void main(String[]args){
        List<Integer> num = Arrays.asList(1,2,4,6,8);
        List<Double> square = num.stream().map(x-> Math.sqrt(x)).collect(Collectors.toList());
        System.out.println(square);
    }
}
