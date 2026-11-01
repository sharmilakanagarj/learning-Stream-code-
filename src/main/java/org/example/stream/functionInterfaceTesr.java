package org.example.stream;

@FunctionalInterface
interface sumTwo{
    int add(int a, int b);
}



public class functionInterfaceTesr {

    public static void main(String[]args){
        sumTwo obj = (a,b) -> a+b;

        System.out.println(obj.add(10,20));
    }
}
