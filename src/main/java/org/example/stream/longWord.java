package org.example.stream;
import java.util.*;
import java.util.stream.*;

public class longWord {
    public static void main(String[]args){
        String str = "I like";


        Optional<String> res = Arrays.stream(str.toLowerCase().split("\\s+"))
                .max(Comparator.comparing(String::length));

        System.out.println(res.orElse(null));
    }
}
