package org.example.stream;

import java.util.*;
import java.util.stream.*;

public class distincitElement {
    public static void main(String[]args){
        List<Integer> num = Arrays.asList(1,2,2,2,3,3,4,5);

        List<Integer> res = num.stream().distinct().toList();

        System.out.println(res);

    }


}
