package Linked_List.Traversing;

/**
 * Tester
 */ 
class Node{
    int data;
    Node next;
    public Node(int x) {
        this.data = x;
        this.next = null;
    }
}
public class Tester {

    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(55);
        Node temp2 = new Node(30);
        Node temp3 = new Node(44);
        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3; 
        printList(head);
    }

    private static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
}