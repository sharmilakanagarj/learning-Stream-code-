package org.example.stream;
import java.util.*;
import java.util.stream.*;

public class joinString {
    public static void main(String[]args){

        List<String> str = Arrays.asList("apple","banna","cat");
        String res = str.stream().collect(Collectors.joining("-"));
            System.out.println(res);

    }
}
