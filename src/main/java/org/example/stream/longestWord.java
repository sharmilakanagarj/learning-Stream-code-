package org.example.stream;
import java.util.stream.*;
import java.util.*;

public class longestWord {
    public static void main(String[]args){
        String str = " I love java programing";

        Optional<String> longest = Arrays.stream(str.split("\\s+"))
                                        .max(Comparator.comparingInt(String::length));

        System.out.println(longest.orElse(null));
    }
}
