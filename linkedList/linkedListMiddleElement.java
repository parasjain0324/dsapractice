public class linkedListMiddleElement {

    Node head;

    static class Node {
        Node next;
        int data;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    void insert(int data) {
        Node n = head;
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }
        else {
            while (n.next != null) {
                n = n.next;
            }
            n.next = newNode;
        }
    }

    void printList(){
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public static void main(String[] args) {
        linkedListMiddleElement obj = new linkedListMiddleElement();

        obj.insert(1);
        obj.insert(2);
        obj.insert(3);
        obj.insert(4);
        obj.insert(5);
        obj.insert(6);
        obj.insert(7);

        obj.printList();
        System.out.println();
        obj.middleElement();
    }

//    using simple method
    void middleElement() {
        Node n = head;
        int i = 1;
        while ( n.next != null ) {
            if (n.next.next == null)
                break;
            i++;
            n = n.next.next;
        }
        System.out.println("Middle Element is present at : " + i + " postion.");
    }



}