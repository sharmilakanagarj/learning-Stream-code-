package org.example.stream;

import java.util.*;
import java.util.stream.*;

public class countNumber {
    public static void main(String[]args){
        List<Integer> num = Arrays.asList(1,9,10,17);
        Long res = num.stream().filter(x-> x > 5)

                .collect(Collectors.counting());
        System.out.println(res);
    }
}
