//Linked list Traversal

class linkedlist {
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
        }
    }
    void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    public static void main(String[] args) {
        linkedlist obj = new linkedlist();
        obj.head = new Node(5);
        Node second = new Node(4);
        Node third = new Node(3);

        obj.head.next = second;
        second.next = third;
        third.next = null;

        obj.printList();
    }
}