package org.example.stream;
import java.util.*;
import java.util.stream.*;


//compute average number of every 3 element slinding window
public class listInteger {
    public static void main(String[] args) {
        List<Integer> slid = Arrays.asList(1, 2, 3, 4, 5, 6);
        int k = 3;
        //op : 1+2+3 = 6/3 = 2  2+3+4 = 9/3 = 3  3+4+5 = 12/3 = 4 4+5+6 = 15/3= 5


        List<List<Integer>> res = IntStream.range(0, slid.size() - k + 1)
                .mapToObj(i -> slid.subList(i, i + k)).toList();

        System.out.println(res);
     List<Double> avgres= res.stream().map(x-> x.stream()
             .mapToInt(Integer::intValue).average().orElse(0.0)).toList();

     System.out.println(avgres);


    }
}
