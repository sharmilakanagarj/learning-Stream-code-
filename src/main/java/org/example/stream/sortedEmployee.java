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
                 new Employee("aww","EEE",898,9,2),
                 new Employee("kkk","IT",789,11,3),
                 new Employee("aww","CSE",19000,10,4),
                 new Employee("oo","CSE",490000,11,5),
                 new Employee("kkk","IT",40000,12,6),
                 new Employee("oo","kkk",1000,13,7),
                 new Employee("kkk","it",100,14,8),
                 new Employee("oo","CSE",300,15,9)
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

    System.out.println(highest + "highest");

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

    // find the most common  letter Among all employee name
    //o/p: a


   Map<Character,Long> com = emp.stream().map(Employee::name).
            flatMap(name->name.chars().mapToObj(c->(char) c))
            .collect(Collectors.groupingBy(x->x,Collectors.counting()));


    Optional<Character>  eachChar = com.entrySet().stream()
            .filter(x->x.getValue()>1).map(Map.Entry :: getKey).findFirst();
    System.out.println(eachChar.orElse(null) );




    System.out.println(eachChar.orElse(null));


// find first commom  first letter ammong all employee

    Map<Character,Long> firtCom = emp.stream()
            .map(e->e.name().charAt(0))
            .collect(Collectors.groupingBy(x->x,Collectors.counting()));

    System.out.println(firtCom);

    Optional<Character> firstLett = firtCom.entrySet().stream()
            .filter(x->x.getValue()>1).map(Map.Entry::getKey).findFirst();

System.out.println(firstLett.orElse(null));

//Categories the emp based upon  salary with lower ,med,high


    Map<String, List<Employee>> category = emp.stream().collect(Collectors.groupingBy(
                                                                  e-> {
                                                                      if (e.salary < 900) {
                                                                          return "LOW";
                                                                      } else if (e.salary == 900) {
                                                                          return "MIDDLE";
                                                                      }
                                                                      else return "HIGH";
                                                                  },Collectors.toList()
            ));

    System.out.println(category);


   List<Employee> sorted = emp.stream().sorted(Comparator.comparingDouble(Employee::salary).reversed()).toList();
System.out.println(sorted.size());
   Map<String,List<Employee>> sortCategory = IntStream.range(0,sorted.size()).boxed().
           collect(Collectors.groupingBy(e->{
               if(e < sorted.size() / 3){  // 0 >
                   return "LOW";
               }else if(e <  (sorted.size() * 2) / 3){
                   return "MIDDLE";
               }
               else return "HIGH";
           },Collectors.mapping(
                   sorted::get,
                   Collectors.toList())));

   System.out.println(sortCategory);


   // find all employee who work in all 3 dept

    Map<String,List<String>>work = emp.stream().collect(Collectors.groupingBy(Employee::name,Collectors.mapping(Employee::dept,Collectors.toList())));

    System.out.println(work);

    List<String> allEmpl = work.entrySet().stream().filter(e->e.getValue().size() >=3)
                            .map(Map.Entry::getKey).toList();

    System.out.println(allEmpl);

    //using set


    Map<String,Set<String>>workSet = emp.stream().collect(Collectors.groupingBy(Employee::name,Collectors.mapping(Employee::dept,Collectors.toSet())));

    System.out.println(workSet);

    List<String> allEmplSet = work.entrySet().stream().filter(e->e.getValue().size() >=2)
            .map(Map.Entry::getKey).toList();

    System.out.println(allEmplSet);

}
}
