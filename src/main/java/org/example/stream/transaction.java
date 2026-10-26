package org.example.stream;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.*;

public class transaction {
    record Transaction(String name, Integer salary, LocalDate date){}
    public static void main(String[]args){
List<Transaction> tra = Arrays.asList(
        new Transaction("aaaa",2300, LocalDate.of(1992, 7,20)),
        new Transaction("aaa",2300, LocalDate.of(1992, 7,20)),
        new Transaction("xxx",90000,LocalDate.of(1998,11,23)),
        new Transaction("sss",8000,LocalDate.of(2019,11,8)),
        new Transaction("sss",80000,LocalDate.of(2019,11,8))

);

//list of Transaction find the day with the highest total spend

        Map<LocalDate,Integer> find = tra.stream().collect(
                Collectors.groupingBy(Transaction::date,Collectors.summingInt(Transaction::salary)));


        Optional<Map.Entry<LocalDate, Integer>> res = find.entrySet().stream().collect(Collectors.
        maxBy(Comparator.comparingInt(Map.Entry::getValue)));
        System.out.println(find);
        System.out.println(res.orElse(null));

        Map<LocalDate,Transaction> findMax = tra.stream().collect(
                Collectors.groupingBy(Transaction::date,
                        Collectors.collectingAndThen(Collectors.maxBy
                                (Comparator.comparingInt(Transaction::salary)),Optional::get)));



        System.out.println(findMax);
    }
}
