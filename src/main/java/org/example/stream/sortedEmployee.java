package org.example.stream;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.toSet;

public class sortedEmployee {
     record Employee (String name, String dept , Integer salary,Integer age,Integer id){

    }

public static void main(String[]args){
         List<Employee> emp = Arrays.asList(
                 new Employee("xxx","IT",900,8,1),
                 new Employee("www","EEE",898,9,2),
                 new Employee("aaa","IT",789,11,3),
                 new Employee("ooo","CSE",19000,10,4)
         );
//1. sorted employlee with salary and display in list
       List<Employee> res = emp.stream().sorted(Comparator.comparingInt(Employee::salary)).toList();
       System.out.println(res);

//2. the avg age of a list of person

    Double avgRes = emp.stream().collect(Collectors.averagingInt(Employee::age));
    System.out.println(avgRes);

    //grouping the dept and avg salsry

    Map<String,Double> groSalary = emp.stream().
            collect(Collectors.groupingBy(Employee::dept,Collectors.averagingInt(Employee::salary)));

    System.out.println(groSalary);

    //highest-paid employee

    Map<String,Employee> highest = emp.stream()
            .collect(Collectors.groupingBy(Employee::dept,Collectors.collectingAndThen(
                    Collectors.maxBy(Comparator.comparingInt(Employee::salary)),Optional::get)));

    System.out.println(highest);

    // find all dept with more than 2 emp

    Map<String,Long> allDept = emp.stream().
            collect(Collectors.groupingBy(Employee::dept,Collectors.counting()
           ));

    System.out.println(allDept);

    List<String> countDept = allDept.entrySet().stream()
            .filter(x->x.getValue() >1).map(Map.Entry::getKey).toList();

System.out.println(countDept);

//find dept with avg salary

    Map<String,Double> highestS = emp.stream().collect(Collectors.groupingBy(Employee::dept
            ,Collectors.averagingDouble(Employee::salary)));

    System.out.println(highestS);
}
}
