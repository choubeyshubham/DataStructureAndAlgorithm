package PracticeQuestions.Stream;

import java.util.Arrays;
import java.util.List;

public class FindTheTotalNumberOfElements {

 /*
Given a list of integers, find the total number of elements present in the list using Stream functions?

     */

    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

        myList.stream().max(Integer::compare).ifPresent(System.out::println);
//        System.out.println(data);

    }



}
