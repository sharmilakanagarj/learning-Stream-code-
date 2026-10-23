package org.example.stream;
import java.util.*;
import java.util.stream.*;

public class constantVowels {
    public static void main(String[]args){
        String str = "Hello world";
        Map<Boolean,Long> counting = str.chars().filter(Character::isLetter)
                                                .mapToObj(c-> (char) c)
                                                .collect(Collectors.partitioningBy( c -> "aeiou".indexOf(c) >= 0,
                                                Collectors.counting()));

         System.out.println(counting);
    }
}
