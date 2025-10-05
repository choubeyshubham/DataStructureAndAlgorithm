package LinkedLists;

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

    public void insertSinglyLL(int nodeValue,int loc) {
        Node node = new Node();
        node.value= nodeValue;
        if (head == null) {
            createSinglyLL(nodeValue);
            return;
        } else if (loc==0) {
            node.next=head;
            head=node;
        } else if (loc>=size) {
            node.next=null;
            tail.next=node;
            tail=node;
        }else {
            Node tempNode=head;
            int index=0;
            while (index < loc - 1) {
                tempNode=tempNode.next;
                index++;
            }
            Node nextNode=tempNode.next;
            tempNode.next=node;
            node.next=nextNode;
        }
    }







}
