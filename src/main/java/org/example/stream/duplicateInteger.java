package org.example.stream;
import java.util.*;
import java.util.stream.*;

public class duplicateInteger {
    public static void main(String[]args){
        List<Integer> nums = Arrays.asList(1,2,2,3,4,4,5);

        Map<Integer,Long> duplicateInteger = nums.stream()
                .collect(Collectors.groupingBy(c->c,Collectors.counting()));

        duplicateInteger.entrySet().stream().filter(e->e.getValue() > 1)
                .map(Map.Entry::getKey).forEach(System.out::println);
    }
}
