package Linked_List.Inserting;

/**
 * Node
 */
class Node {
    int data;
    Node next;

    public Node(int x) {
        this.data = x;
        this.next = null;
    }
}

public class AddAtTheEnd {
    public static void main(String[] args) {
        Node head = null;
        head = addNode(head, 30);
        head = addNode(head, 20);
        head = addNode(head, 10);
        printList(head);
    }

    private static Node addNode(Node head, int i) {
        Node temp = new Node(i);
        // Node ptr = head;
        if (head == null)
            return temp;
        Node curr = head;
        while (curr != null) {
            curr = curr.next;
        }
        curr.next = temp;
        return head;
        // while (ptr.next != null) {
        // ptr = ptr.next;
        // }
        // ptr.next = temp;
    }

    private static void printList(Node head) {
        if (head == null) {
            return;
        }
        System.out.println(head.data + ' ');
        printList(head.next);
    }
}
