package org.example.stream;

import java.util.*;
import java.util.stream.*;

public class greaterThan {
    public static void main(String[]args){
        List<Integer> num = Arrays.asList(2,8,10,12,90);
        List<Integer> res = num.stream().filter(x-> x>10).limit(1).toList();
        System.out.println(res);
    }
}
