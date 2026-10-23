package org.example.stream;
import java.util.*;
import java.util.stream.*;

public class countOccurences {
    public static void main(String[]args){
        List<Integer> num = Arrays.asList(1,2,2,2,3,3,3,4,4,4,4);

        Map<Integer,Long> res = num.stream().collect(Collectors.groupingBy(x->x,Collectors.counting()));

        System.out.println(res);

      String str = "swiss";

      Map<Character, Long> occur = str.chars().mapToObj(c->(char) c).
              collect(Collectors.groupingBy(x->x, Collectors.counting()));

      System.out.println(occur);
    }
}
