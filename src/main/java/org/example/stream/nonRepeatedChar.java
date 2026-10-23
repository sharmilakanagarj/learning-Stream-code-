package org.example.stream;
import java.util.stream.*;
import java.util.*;

public class nonRepeatedChar {
    public static void main(String[] args){
        String str = "swiss";
        Map<Character,Long>  nonRepetedChar = str.chars()
                .mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(c->c , Collectors.counting()));
        Optional<Character> nonReapt = nonRepetedChar.entrySet().stream().filter(e->e.getValue() == 1)
                .map(Map.Entry::getKey).findFirst();
        System.out.println(nonReapt.orElse(null));
    }
}
