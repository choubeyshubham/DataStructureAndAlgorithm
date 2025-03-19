package LinkedListIntro;

public class SinglyLL {


    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLL(int nodeValue) {//O(1) space O(1)
        head= new Node();
        Node node = new Node();
        node.next=null;
        node.value=nodeValue;
        head=node;
        tail=node;
        size=1;
        return head;
    }

    public Node insertSinglyLL(int nodeValue) {


        return null;

    }







}
