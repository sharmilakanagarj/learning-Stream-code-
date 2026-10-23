package org.example.stream;
import java.util.*;
import java.util.stream.*;

public class nonEmptyString {
    public static void main(String[]args){
        List<String> str = Arrays.asList("apple","","banana");
        List<String>  res = str.stream().filter(x->!x.isBlank()).toList();
        System.out.println(res);


    }
}
