package org.example.stream;
import java.util.*;
import java.util.stream.*;



public class listLengthWord {
    public static void main(String[]args){
        List<String> str = Arrays.asList("apple","banana","cat");
        Map<Integer,Long> res = str.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(res);
    }
}
