package org.example.stream;

import java.util.*;
import java.util.stream.*;

//logic
// 1. convert into stream() and use condition in filter  and then list them
// print the output
public class evenNumber {
    public static void main(String[]args){
        List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8);

        List<Integer>res = num.stream().filter(n->n%2 == 0).collect(Collectors.toList());

        System.out.println(res);

        List<Integer> odd  = num.stream().filter(n->n%2!=0).collect(Collectors.toList());
        System.out.println(odd);
    }


}
