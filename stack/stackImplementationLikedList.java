public class stackImplementationLikedList {

    Node head;

    static class Node {

        Node next;
        int data;
        Node (int d) {
            data = d;
            next = null;
        }
    }

    void push (int data) {

        Node newNode = new Node(data);
        Node n = head;
        if ( head == null ) {

            head = newNode;
        }
        else {

            while ( n!= null ) {
                if (  n.next == null) {
                    n.next = newNode;
                    break;
                }
                n = n.next;
            }
        }
    }

    void pop () {

        Node n = head;
        if ( n == null ) {
            System.out.println("Underflow");
        }
        else {
            while ( n.next != null ) {
                if ( n.next.next == null ) {
                    System.out.println(n.next.data);
                    n.next = null;
                    break;
                }
                else {
                    n = n.next;
                }
            }
        }
    }

    void peek () {

        Node n = head;
        if ( n == null ) {
            System.out.println("Underflow");
        }
        else {
            while ( n != null ) {
                if ( n.next == null ) {
                    System.out.println(n.data);
                    break;
                }
                else {
                    n = n.next;
                }
            }
        }
    }

    public static void main(String[] args) {

        stackImplementationLikedList obj = new stackImplementationLikedList();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.push(6);
        obj.push(7);
        obj.pop();
        obj.peek();
    }
}