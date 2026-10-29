package org.example.stream;
import java.util.*;
import java.util.stream.*;
public class test {
    // Online Java Compiler (Editor)
// Write and run Java online using this editor.


        record Employee(String name, String dept, Integer age,Integer salary){}
        public static void main(String[] args) {

            List<Employee> emp = Arrays.asList(
                    new Employee("xxx","IT",9,20000),
                    new Employee("zzz","CSE",10,10000),
                    new Employee("aaa","FINANCE",11,1100),
                    new Employee("sss","CSE",23,900),
                    new Employee("sss","CSE",24,900),
                    new Employee("aaa","FINANCE",90,100),
                    new Employee("aaa","FINANCE",78,1200),
                    new Employee("xxx","IT",92,25000),
                    new Employee("xxx","IT",93,30000)
            );

            // find 3 highest salary in each dept


            Map<String,Optional<Employee>> high = emp.stream().collect(Collectors.groupingBy(Employee::dept,Collectors.collectingAndThen(Collectors.toList(),
                    list -> list.stream().
                  sorted(Comparator.comparingInt(Employee::salary).reversed()).skip(2).findFirst())));


            System.out.println(high);

            Map<String ,List<Employee>> groupSalary = emp.stream().collect(Collectors.groupingBy(Employee::dept));

            System.out.println(groupSalary);

            Map<String,String> highestThreeSalary = groupSalary.entrySet().stream()
                                            .collect(Collectors.toMap(Map.Entry::getKey,
                                                    entry ->entry.getValue().stream()
                                                            .map(Employee::salary)
                                                            .distinct()
                                                            .sorted(Comparator.reverseOrder())
                                                            .skip(2).findFirst().map(String::valueOf).orElse("no highest salary")
                                            ));


System.out.println(highestThreeSalary);


        }
    }

