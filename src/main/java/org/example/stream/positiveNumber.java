package org.example.stream;
import java.util.*;
import java.util.stream.*;

public class positiveNumber {
    public static void main(String[]args){

        List<Integer> num = Arrays.asList(1,-2,3,-4);
        List<Integer> res = num.stream().filter(x->x > 0).toList();
        boolean positive = num.stream().allMatch(x->x>0);
        System.out.println(positive);
        System.out.println(res);
    }
}
