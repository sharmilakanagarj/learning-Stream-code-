package org.example.stream;
import java.util.*;
import java.util.stream.*;

public class flattedList {
    public static void main(String[] args) {
        List<List<Integer>> num = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(2, 3, 4)
        );

        List<Integer> res = num.stream().flatMap(List::stream).distinct().toList();
        System.out.println(res);

        List<List<String>> str = Arrays.asList(
                Arrays.asList("apple","banana"),
                Arrays.asList("cat","apple")
        );

        List<String> strResult = str.stream().flatMap(List::stream).distinct().toList();
        System.out.println(strResult);

    }
}
