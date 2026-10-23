package org.example.stream;
import java.util.stream.*;
import java.util.*;

public class maxMin {
    public static void main(String[]args){
        List<Integer> list = Arrays.asList(1,4,5,2,3);

        int max = list.stream().mapToInt(Integer::intValue).max().orElseThrow();
        int min = list.stream().mapToInt(Integer::intValue).min().orElseThrow();

        System.out.println("max:" + max + "min:" + min);

    }
}
