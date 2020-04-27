public class linkedListLength {
    Node head;
    static class Node {
        Node next;
        int data;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    void checkLength() {
        Node n = head;
        int i = 0;
        while (n != null) {
            i++;
            n = n.next;
        }
        System.out.println("Number of Nodes : " + i);
    }

    public static void main(String[] args) {
        linkedListLength obj = new linkedListLength();
        obj.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        obj.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = null;

        obj.checkLength();
    }
}