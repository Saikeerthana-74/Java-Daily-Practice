class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class RemoveDuplicatesFromLinkedList {

    public static Node removeDuplicates(Node head) {

        Node current = head;

        while(current != null && current.next != null) {

            if(current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }

    public static void display(Node head) {

        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(10);
        head.next.next = new Node(20);
        head.next.next.next = new Node(20);
        head.next.next.next.next = new Node(30);

        System.out.println("Before Removing Duplicates:");
        display(head);

        head = removeDuplicates(head);

        System.out.println("After Removing Duplicates:");
        display(head);
    }
}
