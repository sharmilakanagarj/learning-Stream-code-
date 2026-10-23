package org.example.stream;


import java.util.*;
import java.util.List;

import static java.util.Arrays.stream;
import static java.util.stream.Stream.concat;

// thread 1 -> 2,4,6,8
//thread 2 -> 1,3,5,7
//output -> 1,2,3,4,5,6,7,8 -> grouping odd or even
public class THREAD {

    public static void main(String[] args){

        List<Integer> number1 = Arrays.asList(2,4,6,8);
        List<Integer> number2 = Arrays.asList(1,3,5,7);

//        number1+number2  => map , or flatmap

//       List<Integer> result = Stream.concat(number1.stream(),number2.stream()).sorted().collect(Collectors.toList());

//System.out.println(result);

        System.out.println(concat(number1.stream(),number2.stream()).sorted().toList());

    }
}
