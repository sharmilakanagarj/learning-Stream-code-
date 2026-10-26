package org.example.stream;
import java.util.*;
import java.util.stream.*;


//group character its by uppercase,lowercase,Digit,other
public class GroupCharacter {
    public static void main(String[]args){
String str = "An lower Case @19";

        Map<String,List<Character>> groupThem = str.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->{
                    if(Character.isUpperCase(c)){
                        return "Uppercase";
                    }
                    else if(Character.isLowerCase(c)){
                        return "Lowercase";
                    }else if(Character.isDigit(c)){
                        return "Digit";
                    }
                    else return "Other";
                }));
        System.out.println(groupThem);
    }

}
