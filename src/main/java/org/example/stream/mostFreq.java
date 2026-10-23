package org.example.stream;
import java.util.*;
import java.util.stream.*;

public class mostFreq {
    public static void main(String[]args){
        String str = "swissll";

      Map<Character,Long> res = str.chars()
                .mapToObj(c->(char) c).collect(Collectors.groupingBy(x->x,Collectors.counting()));
//repeated char
      List<Character> freq = res.entrySet().stream().filter(x->x.getValue() >1)
              .map(Map.Entry::getKey).collect(Collectors.toList());

        System.out.println(freq);

      //find first non repeat char

        Optional<Character> nonfreq = res.entrySet().stream().filter(x->x.getValue() == 1)
                .map(Map.Entry::getKey).findFirst();

        System.out.println(nonfreq.orElse(null));



    }
}
