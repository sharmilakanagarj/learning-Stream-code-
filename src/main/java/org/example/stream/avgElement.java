package org.example.stream;
import java.util.*;
import java.util.stream.*;


public class avgElement {
    public static void main(String[]args){
        List<Integer> num = Arrays.asList(1,2,3,4,5);
      OptionalDouble res = num.stream().mapToInt(Integer::intValue).average();
      System.out.println(res);
    }
}
