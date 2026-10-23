package org.example.stream;
import java.util.*;
import java.util.stream.*;

public class paritionEvenOdd {
    public static void main(String[]args){
        List<Integer> num = Arrays.asList(1,2,3,4,5);
        Map<Boolean,List<Integer>> res = num.stream().collect(Collectors.partitioningBy(x->x%2 ==0));
        System.out.println(res);
    }
}
