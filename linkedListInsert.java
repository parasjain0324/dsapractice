public class linkedListInsert{
    Node head;
    static class Node {
        Node next;
        int data;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node insertAtStart(Node node) {
        node.next = head;
        head = node;

        return head;
    }

    Node insertAtLast(Node node) {
        Node n = head;
        while (n != null) {
            if (n.next == null) {
                n.next = node;
                break;
            }
                n = n.next;
        }
        return head;
    }

    Node insertAtMiddle(Node node, int pos) {
        Node n = head;
        int i = 1;
        while (n != null) {
            if (i+1 == pos) {
                node.next = n.next;
                n.next = node;
                break;
            }
            n = n.next;
            i++;
        }
        return head;
    }

    void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(" " + n.data);
            n = n.next;
        }
    }
    public static void main(String[] args) {
        linkedListInsert obj = new linkedListInsert();
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
        obj.printList();

        Node newNode = new Node(10);
        Node newNode2 = new Node(20);
        Node newNode3 = new Node(30);
        newNode.next = null;

        obj.insertAtStart(newNode);
        obj.insertAtLast(newNode2);
        obj.insertAtMiddle(newNode3, 3);

        System.out.println("");

        obj.printList();

    }
}