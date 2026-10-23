package org.example.stream;
import java.util.*;
import java.util.stream.*;

public class sortingElement {
    public static void main(String[]args){
        List<Integer> num = Arrays.asList(11,2,23,4,5);
        List<Integer> res = num.stream().sorted().toList();
        List<Integer> reverse = num.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(reverse);
        System.out.println(res);
    }

}
