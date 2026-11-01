package org.example.stream;
import java.util.*;
import java.util.stream.*;
public class test {
    // Online Java Compiler (Editor)
// Write and run Java online using this editor.


//        record Employee(String name, String dept, Integer age,Integer salary){}

    record Employee(int id, String name, int age, String departNames, String address, double salary, String gender) {
        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    ", departNames='" + departNames + '\'' +
                    ", address='" + address + '\'' +
                    ", salary=" + salary +
                    ", gender='" + gender + '\'' +
                    '}';
        }
    }
        public static void main(String[] args) {

//            List<Employee> emp = Arrays.asList(
//                    new Employee("xxx","IT",9,20000),
//                    new Employee("zzz","CSE",10,10000),
//                    new Employee("aaa","FINANCE",11,1100),
//                    new Employee("sss","CSE",23,900),
//                    new Employee("sss","CSE",24,900),
//                    new Employee("aaa","FINANCE",90,100),
//                    new Employee("aaa","FINANCE",78,1200),
//                    new Employee("xxx","IT",92,25000),
//                    new Employee("xxx","IT",93,30000)
//            );


            List<Employee> emp = List.of(
                    new Employee(101, "Arun Kumar", 28, "IT", "Chennai", 65000.0, "Male"),
                    new Employee(102, "Priya Sharma", 32, "HR", "Bangalore", 72000.0, "Female"),
                    new Employee(103, "Rahul Verma", 26, "IT", "Hyderabad", 58000.0, "Male"),
                    new Employee(104, "Sneha Reddy", 30, "Finance", "Pune", 81000.0, "Female"),
                    new Employee(105, "Vikram Singh", 35, "Operations", "Mumbai", 95000.0, "Male"),
                    new Employee(106, "Anjali Nair", 29, "HR", "Chennai", 68000.0, "Female"),
                    new Employee(107, "Karthik Raj", 41, "IT", "Coimbatore", 125000.0, "Male"),
                    new Employee(108, "Meera Iyer", 27, "Finance", "Bangalore", 76000.0, "Female"),
                    new Employee(109, "Suresh Babu", 38, "Operations", "Hyderabad", 89000.0, "Male"),
                    new Employee(110, "Divya Krishnan", 31, "IT", "Chennai", 92000.0, "Female"),
                    new Employee(111, "Amit Patel", 45, "Management", "Ahmedabad", 180000.0, "Male"),
                    new Employee(112, "Neha Gupta", 33, "IT", "Delhi", 98000.0, "Female"),
                    new Employee(113, "Ravi Shankar", 24, "Support", "Chennai", 45000.0, "Male"),
                    new Employee(114, "Pooja Mehta", 37, "Finance", "Mumbai", 110000.0, "Female"),
                    new Employee(115, "Manoj Das", 29, "Support", "Kolkata", 52000.0, "Male"),
                    new Employee(116, "Lakshmi Narayanan", 34, "IT", "Chennai", 115000.0, "Female"),
                    new Employee(117, "Ganesh Prasad", 28, "Operations", "Bangalore", 74000.0, "Male"),
                    new Employee(118, "Aishwarya Rao", 26, "HR", "Pune", 62000.0, "Female"),
                    new Employee(119, "Naveen Kumar", 39, "Management", "Hyderabad", 165000.0, "Male"),
                    new Employee(120, "Keerthana S", 25, "Support", "Chennai", 48000.0, "Female")
            );
            // find 3 highest salary in each dept


//            Map<String,Optional<Employee>> high = emp.stream().collect(Collectors.groupingBy(Employee::dept,Collectors.collectingAndThen(Collectors.toList(),
//                    list -> list.stream().
//                  sorted(Comparator.comparingInt(Employee::salary).reversed()).skip(2).findFirst())));
//
//
//            System.out.println(high);
//
//            Map<String ,List<Employee>> groupSalary = emp.stream().collect(Collectors.groupingBy(Employee::dept));
//
//            System.out.println(groupSalary);
//
//            Map<String,String> highestThreeSalary = groupSalary.entrySet().stream()
//                                            .collect(Collectors.toMap(Map.Entry::getKey,
//                                                    entry ->entry.getValue().stream()
//                                                            .map(Employee::salary)
//                                                            .distinct()
//                                                            .sorted(Comparator.reverseOrder())
//                                                            .skip(2).findFirst().map(String::valueOf).orElse("no highest salary")
//                                            ));
//
//
//System.out.println(highestThreeSalary);
//
////find the count of employee in each dep
//
//            Map<String,Long> count = emp.stream().collect(Collectors.groupingBy(Employee::dept,Collectors.counting()));
//
//System.out.println(count + "list of employee");

//cse -3 , It - 3,finance -3


            //find the dept who is having max numb of employe

            //dept - name


            Map<String ,Long> deptemp = emp.stream().collect(Collectors.groupingBy(Employee::departNames,Collectors.counting()));

            System.out.println(deptemp);

           String countdept =deptemp.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).get();

            //support -3 ,financial -3, hr -3 , mgmt -2 ,it -6 oper-3
            // result - It -6

System.out.println(countdept);


        }
    }

