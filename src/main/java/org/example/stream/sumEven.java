package org.example.stream;

import java.util.*;
import java.util.stream.*;

public class sumEven {
    public static void main(String[]args){
        List<Integer> num = Arrays.asList(1,2,3,4,6);
        int res = num.stream().filter(x-> x%2 == 0 )
                .mapToInt(Integer::intValue).sum();
        System.out.println(res);

    }
}
