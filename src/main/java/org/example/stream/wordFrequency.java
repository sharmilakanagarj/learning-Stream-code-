package org.example.stream;
import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class wordFrequency {
    public static void main(String[]args){
        String sentence = "the are cat whoes eat milk always in my home the cat are naughty";

        Map<String,Long> frequency = Arrays.stream(sentence.toLowerCase().split("\\s+"))
                                         .filter(w-> !w.isBlank())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(frequency);
    }
}
