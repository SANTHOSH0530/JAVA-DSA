package SortingPrograms;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}
class LinkedList {
    Node head, tail;
    public void insert(int data) {
        Node n1 = new Node(data);
        n1.next = null;
        if (head == null) {
            head = n1;
            tail = n1;
        } else {
            tail.next = n1;
            tail = n1; 
        }
    }
    public void display() {
        Node temp = head;
        while (temp != null) { 
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
public class SingleLinkedList {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.insert(10);
        l1.insert(20);
        l1.insert(30);
        l1.insert(40);
        l1.insert(50);
        l1.insert(60);
        l1.insert(70);
        l1.display();
    }
}
