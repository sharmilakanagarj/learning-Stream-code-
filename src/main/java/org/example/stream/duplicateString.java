package org.example.stream;

import java.util.*;
import java.util.stream.*;



public class duplicateString {
    public static void main(String[]args){
        String word = "programming";
        Map<Character,Long> duplicateword = word.chars().
                                            mapToObj(c -> (char) c)
                                        .collect(Collectors.groupingBy(c -> c,Collectors.counting()));

         duplicateword.entrySet().stream().filter(e-> e.getValue() > 1).map(Map.Entry :: getKey).forEach(System.out::println);


    }


}
