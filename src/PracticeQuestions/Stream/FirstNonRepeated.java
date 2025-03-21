package PracticeQuestions.Stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeated {
    /*

Given a String, find the first non-repeated character in it using Stream functions?
     */

    public static void main(String[] args) {
        String s = "Java articles are Awesome";



//        Character ch=
                s.chars()
                .mapToObj(j->Character.toLowerCase((char) j))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue()==1l)
                .map(e->e.getKey())
                .findFirst()
//                .get();
                .ifPresent(System.out::println);


                //---------------Word
        String p = "Hello world hello world this is a test";

            String[] words=p.toLowerCase().split("\\s+");

        Arrays
                .stream(words)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue()==1)
                .map(m->m.getKey())
                .findFirst()
                .ifPresent(System.out::println);


    }



}
