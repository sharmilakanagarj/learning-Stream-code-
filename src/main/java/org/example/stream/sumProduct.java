package org.example.stream;

import java.util.*;
import java.util.stream.*;

public class sumProduct {
    public static void main(String[]args){
        List<Integer> num = Arrays.asList(1,2,3,4);
       int res = num.stream().reduce(1,(a,b)-> a*b);
       int sum = num.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
        System.out.println(res);
    }
}
