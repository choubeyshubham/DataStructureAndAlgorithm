package PracticeQuestions.Stream;

import java.util.*;

public class FindFirstElement {
   /*
Given the list of integers, find the first element of the list using Stream functions?

     */

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,15,8,49,25,98,98,32,15);

        list.stream().sorted().distinct().findFirst().ifPresent(System.out::println);


    }

}

