public class doublyLinkedListImplementation {

    Node head;

    static class Node {

        Node next;
        Node prev;
        int data;
        Node(int d) {
            data = d;
            next = null;
            prev = null;
        }
    }

    void insert(int data) {

        Node newNode = new Node(data);
        Node temp;
        Node n = head;
        if ( head == null ) {

            head = newNode;
        }
        else {

            while ( n.next != null ) {
                n = n.next;
            }
            n.next = newNode;
            newNode.prev = n;
        }
    }

    void printLinkedList() {

        Node n = head;
        while ( n != null ) {
            System.out.println(n.data);
            n = n.next;
        }
    }

    public static void main(String[] args) {

        doublyLinkedListImplementation obj = new doublyLinkedListImplementation();
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.insert(40);

        obj.printLinkedList();
    }
}
