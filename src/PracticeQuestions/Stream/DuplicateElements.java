package PracticeQuestions.Stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElements {

      /*
 How to find duplicate elements in a given integers list in java using Stream functions?     */

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

        Set<Integer> set=new HashSet();

        myList.stream().filter(s->!set.add(s)).forEach(System.out::println);
        System.out.println("==================Unique Elements");
        myList.stream().distinct().forEach(System.out::println);
        System.out.println("==================Unique Elements");
        Set<Integer> newSet=new HashSet<>(myList);
        newSet.stream().forEach(System.out::println);

    }



}
