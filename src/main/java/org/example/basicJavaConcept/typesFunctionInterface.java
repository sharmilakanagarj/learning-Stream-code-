package org.example.basicJavaConcept;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class typesFunctionInterface {
    public static void main(String[] args){
        //predicate -> take one argument return boolean output which methos of test
        Predicate<Integer> p = (num)->{
            if(num % 2 == 0) return true;
            else return false;
        };
        System.out.println(p.test(3));
        System.out.println(p.test(6));

        // function -> takes one argument return any argument which method of apply whenever you to map we can use function

        Function<String, Integer> f = (str)-> str.length();
        System.out.println(f.apply("sha"));

        //Consumer is pre defined function here we have one argument but does not return anything so mehod is accept

        Consumer<String> co = (str)-> System.out.println("my consumer:" + str);
        co.accept("ddd");

        // suppier is also pre defined but here its not has argument but its some return type so method is get mainly used for get or suppier data

        Supplier<String> s =() ->{
            String s1 = "hello";
            String s2 = " world";
            return s1.concat(s2);
        };

        System.out.println("supplier :" +s.get());
    }
}
