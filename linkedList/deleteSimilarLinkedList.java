// 1,2,2,3,5,5.

public class deleteSimilarLinkedList {

    Node head;
    static class Node {
        Node next;
        int data;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    void insertLinkedList(int d) {
        Node newNode = new Node(d);
        newNode.next = null;
        Node n = head;
        if (head == null) {
            head = newNode;
        }
        else {
            while (n != null) {
                if (n.next == null) {
                    n.next = newNode;
                    break;
                }
                else
                    n = n.next;
            }
        }
    }

    void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println("");
    }

    void deleteSimilar() {
        Node n = head;
        while (n != null) {
            Node m = n.next;
            Node prev = n;
            while (m != null) {
                if(n.data == m.data) {
                    prev.next = m.next;
                    m = m.next;

                }
                else {
                    prev = m;
                    m = m.next;
                }
            }
            n = n.next;
        }
    }

    public static void main(String[] args) {
        deleteSimilarLinkedList obj = new deleteSimilarLinkedList();
        obj.insertLinkedList(1);
        obj.insertLinkedList(2);
        obj.insertLinkedList(2);
        obj.insertLinkedList(3);
        obj.insertLinkedList(5);
        obj.insertLinkedList(5);
        obj.insertLinkedList(1);
        obj.insertLinkedList(2);
        obj.insertLinkedList(4);

        obj.printList();

        obj.deleteSimilar();

        obj.printList();
    }
}