//25 November 2024

import java.util.*;
import java.util.stream.*;

import java.io.*;
import java.lang.*;


public class todayClass {
    public static void main(String[] arg){
        //List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", null);

        
        //uppercse all the name with null filter
        // List<String> upperCase = names.stream()
        // .filter(name->name!=null)
        // .map(String::toUpperCase) 
        // .collect(Collectors.toList()); 
        

        //combine all the names
        // String combinedNames = names.stream()
        // .filter(name->name!=null)
        // .reduce("",(a,b)-> a+b);

        
        
        
        //System.out.println(upperCase);
        //System.out.println(combinedNames);
        




        List<Integer> numbers =  Arrays.asList(1,2,3,4,5,6,7,8,9);

        Integer Sum = numbers.stream()
        //.reduce(0,(a,b) -> a+b);
        .reduce(0 , Integer :: sum);

        System.out.println(Sum);

        //Grouping

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // System.out.println(names.stream().collect(Collectors.groupingBy(name->name.charAt(0) ) ));

        Map<String, Long> countMap = names.stream()
        .collect(Collectors.groupingBy(String :: toLowerCase, Collectors.counting()));

        System.out.println(countMap);

        //Map<Integer,List<String>> length=name.stream().collect(Collectors.groupingBy((name1)->name1.length()));
    }
}
