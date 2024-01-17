package Linked_List.Deletion;

import java.util.LinkedList;
class Node{
    int data;
    Node next;
    
    public Node() {
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
    public void deleteAtFirst(LinkedList list){
        
    }
}

public class DeleteAtFirst {
    public static void main(String[] args) {
        Node temp = new Node();
        LinkedList<Integer> Linky = new LinkedList<>();
        Linky.push(12);
        Linky.push(10);
        Linky.push(8);
        Linky.push(6);
        Linky.push(4);
        Linky.push(2);

        temp.deleteAtFirst(Linky);

        System.out.println(Linky);

    }


}
