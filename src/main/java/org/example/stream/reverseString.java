package org.example.stream;
import java.util.stream.*;
import java.util.*;


public class reverseString {
    public static void main(String[]args){
        String str = "hello world from java";
      String reverse = Arrays.stream(str.toLowerCase().split("\\s+"))
                .map(words -> new StringBuilder(words).reverse().toString())
                .collect(Collectors.joining(" "));

      System.out.println(reverse);
    }
}
