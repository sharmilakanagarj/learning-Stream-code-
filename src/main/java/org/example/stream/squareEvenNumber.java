package org.example.stream;

import java.util.*;
import java.util.stream.*;

public class squareEvenNumber {
    public static void main(String[]args){
        List<Integer> num = Arrays.asList(1,2,3,4,6);
        List<Double> res = num.stream().filter(x->x % 2 ==0)
                .map(x->Math.sqrt(x)).collect(Collectors.toList());
        System.out.println(res);
    }
}
