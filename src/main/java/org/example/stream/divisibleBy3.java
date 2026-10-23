package org.example.stream;
import java.util.*;
import java.util.stream.*;

public class divisibleBy3 {
    public static void main(String[]args){
        List<Integer> num = Arrays.asList(3,6,9,12);
      boolean res = num.stream().anyMatch(x->x % 3 == 0);
      System.out.println(res);
    }
}
