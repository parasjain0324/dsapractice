//print all the middle element in linked list

class linkedListPrintMiddle {
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    void printMiddle() {
        Node n = head;
        n = n.next;
        while(n.next != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    public static void main(String[] args) {
        linkedListPrintMiddle obj = new linkedListPrintMiddle();
        obj.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);

        obj.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = null;

        obj.printMiddle();
    }
}