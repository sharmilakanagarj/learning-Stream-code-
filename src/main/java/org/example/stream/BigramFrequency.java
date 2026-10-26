package org.example.stream;
import java.util.*;
import java.util.stream.*;


//bigram frequiences (Pairs concectuive )in par
public class BigramFrequency {
    public static void main(String[]args){
 String str = "banana is an sweet fruit";

        Map<String, Long> big = IntStream.range(0,str.length() - 1).mapToObj(i -> str.substring(i, i + 2))
         .collect(Collectors.groupingBy(x->x , Collectors.counting()));

        List<String> bigPattern = big.entrySet().stream().filter(x->x.getValue()>1)
                        .map(Map.Entry::getKey).toList();

        System.out.println(big);
        System.out.println(bigPattern);

    }
}
