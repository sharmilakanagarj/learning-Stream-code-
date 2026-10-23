package org.example.stream;
import java.util.*;
import java.util.stream.*;
import java.time.LocalDate;


public class employeePrbm {
    record Employee(String name , String dept, int id , double salary
            , LocalDate joining, String gender  ){}

    public static void main(String[]args){
        List<Employee> emp = Arrays.asList(
                new Employee("Ali" , "IT", 1001, 1000, LocalDate.of(2021,2,2),"F"),
                new Employee("Bob","CSE",1002,2000,LocalDate.of(2022,2,1),"M"),
                new Employee("Alice","EEE",1003,28000,LocalDate.of(2023,9,2),"F"),
                new Employee("Charlie" , "IT",1004,30000,LocalDate.of(2024,10,2),"M")
        );

        Optional<Employee> highest = emp.stream().max(Comparator.comparingDouble(Employee::salary));

        System.out.println(highest.orElse(null));

        Optional<Employee> secondHighest = emp.stream().sorted(Comparator.comparingDouble(Employee::salary).reversed()).skip(1).findFirst();

        System.out.println(secondHighest.orElse(null));

        Map<String,Long> groupDept = emp.stream().collect(Collectors.groupingBy(Employee::dept,Collectors.counting()));

        System.out.println(groupDept);

        Map<String,Employee> highestEachDept = emp.stream().collect(Collectors.groupingBy(Employee::dept,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee::salary)), Optional::get)));
        System.out.println(highestEachDept);

        Map<String,List<Employee>> top2Highest = emp.stream().collect(Collectors.groupingBy(Employee::dept,Collectors.collectingAndThen(Collectors.toList(),
                                list->list.stream().sorted(Comparator.comparingDouble(Employee::salary).reversed()).limit(2).collect(Collectors.toList()))));

        emp.stream().collect(Collectors.groupingBy(Employee::dept,Collectors.collectingAndThen(Collectors.toList(),
        list->list.stream().sorted(Comparator.comparingDouble(Employee::salary).reversed()).limit(2).collect(Collectors.toList()))));

        System.out.println(top2Highest);
    }
}
