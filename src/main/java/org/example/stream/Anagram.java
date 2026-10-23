package org.example.stream;
import java.util.*;
import java.util.stream.*;

public class Anagram {
    public static void main(String[]args){
        String s1 = "listen";
        String s2 = "silent";

        Map<Character,Long> groupA = s1.chars().mapToObj(c->(char) c)
                        .collect(Collectors.groupingBy(c->c , Collectors.counting()));

        Map<Character,Long> groupB = s2.chars().mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(c->c , Collectors.counting()));

            System.out.println(groupA.equals(groupB));

    }
}
