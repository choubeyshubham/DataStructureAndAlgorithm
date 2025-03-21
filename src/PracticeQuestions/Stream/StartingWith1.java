package PracticeQuestions.Stream;

import java.util.Arrays;
import java.util.List;

public class StartingWith1 {

      /*
 Given a list of integers, find out all the numbers starting with 1 using Stream functions?
     */

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);


        myList.stream().map(s->s+"").filter(s->s.startsWith("1")).forEach(System.out::println);




    }

}
