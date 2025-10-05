package LinkedLists;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LinkedListIntro {
/*
Linked List is a form of a sequential collection and its does not have
to order. A linked List is made up of independent nodes that may
contain any type of data and each node has a reference to the next node
in link

Type
Singly LL
Circular Singly LL
Doubly LL
Circular Doubly LL

*/

    public static void main(String[] args) {

        SinglyLL singlyLL=new SinglyLL();
        singlyLL.createSinglyLL(5);
        System.out.println(singlyLL.head.value);





    }




}
