package org.example.stream;
import java.util.*;
import java.util.stream.*;

public class startWidth {
    public static void main(String[]args){
        List<String> str = Arrays.asList("Apple","charile","Aha");
        Long res = str.stream().filter(x-> x.toLowerCase().startsWith("a")).collect(Collectors.counting());
        System.out.println(res);
    }
}
