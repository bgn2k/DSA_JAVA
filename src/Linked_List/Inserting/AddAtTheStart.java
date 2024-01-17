package Linked_List.Inserting;

/**
 * Node
 */
class Node {
    int data;
    Node next;

    public Node(int x) {
        data = x;
        next = null;
    }
}

public class AddAtTheStart {
    public static void main(String[] args) {
        Node head = null;
        head = addNode(head, 30);
        head = addNode(head, 20);
        head = addNode(head, 10);
        head = addNode(head, 40);
        printList(head);
    }

    private static Node addNode(Node head, int i) {
        Node temp = new Node(i);
        temp.next = head;
        head = temp;
        return head;
    }

    private static void printList(Node head) {
        if (head == null)
            return;
        System.out.println(head.data + " ");
        printList(head.next);
    }
}
