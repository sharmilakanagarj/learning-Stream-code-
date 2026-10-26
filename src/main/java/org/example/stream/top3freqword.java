package org.example.stream;
import java.util.*;
import java.util.stream.*;

//find top3 most frequency words in paragraph
public class top3freqword {
    public static void main(String[]args){
        String str = "god please help for a project ,will selected on that project ,project is a important that work. ";

        //op -> project ,a, that

       Map<String,Long> res = Arrays.stream(str.toLowerCase().replaceAll("[^a-z0-9\\s]", "").split("\\s+"))
                .collect(Collectors.groupingBy(x->x,Collectors.counting()));

       System.out.println(res);

       List<String> top3 = res.entrySet().stream()
               .filter(x->x.getValue() >1)
               .sorted(Map.Entry.<String,Long>comparingByValue().reversed())
               .map(Map.Entry::getKey).limit(3).toList();

       System.out.println(top3);


    }
}
