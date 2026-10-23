package org.example.stream;
import java.util.*;
import java.util.stream.*;

public class topKFrequency {
    public static void main(String[]args){
        List<Integer> num = Arrays.asList(12,10,15,2,3,4,5);

        List<Integer> topK = num.stream().sorted(Comparator.reverseOrder())
                .limit(3).collect(Collectors.toList());

        System.out.println(topK);
    }
}
