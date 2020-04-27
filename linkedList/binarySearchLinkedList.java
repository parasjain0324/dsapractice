// Binary Search on Linked List

class binarySearchLinkedList {

    Node head;

    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    void insertNode(int data) {
        Node n = head;
        if (head == null) {
            head = new Node(data);
        }
        else {
            while (n.next != null) {
                n = n.next;
            }
            n.next = new Node(data);
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
        binarySearchLinkedList obj = new binarySearchLinkedList();
        obj.insertNode(2);
        obj.insertNode(4);
        obj.insertNode(7);
        obj.insertNode(11);
        obj.insertNode(19);
        obj.insertNode(21);
        obj.insertNode(51);
        obj.insertNode(122);

        obj.printList();

        Node resultantNode = obj.binarySearchLinkedList(5, obj.head, null);
        if (resultantNode != null) {
            System.out.println("\nValue is present");
        }
        else System.out.println("\nValue is not present");
    }

    Node binarySearchLinkedList(int element, Node start, Node end) {

        Node mid = middleNode(start, end);

        if ( mid.data > element) {
            return binarySearchLinkedList(element, start, mid);
        }
        if (mid.data > element){
            return binarySearchLinkedList(element, mid.next, end);
        }
        if ( mid.data == element) {
            return mid;
        }
        else
            return null;
    }

    Node middleNode(Node start, Node end) {
        Node slow = start;
        Node fast = start.next;
        while (fast != end) {
            fast = fast.next;
            if(fast != null) {
                fast = fast.next;
                slow = slow.next;
            }
        }
        return slow;
    }

}