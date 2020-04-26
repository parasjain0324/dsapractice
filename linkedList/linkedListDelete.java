// Linked List Program to delete en element from starting, middle(works on the basis of position), end

class linkedListDelete {
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    Node linkedListInsert(int data) {
        Node n = head;
        Node node = new Node(data);
        if (head == null) {
            head = node;
        }
        else {
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
        return head;
    }

    void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println("");
    }

    Node deleteAtStart() {
        head = head.next;
        return head;
    }

    Node deleteAtEnd() {
        Node n = head;
        while (n != null) {
            if (n.next.next == null) {
                n.next = null;
                break;
            }
            n = n.next;
        }
        return head;
    }

    Node deleteAtMiddle(int pos) {
        Node n = head;
        int i = 1;
        while (n.next != null) {
            if(i+1 == pos) {
                n.next = n.next.next;
                break;
            }
            i++;
            n = n.next;
        }
        return head;
    }

    public static void main(String[] args) {
        linkedListDelete obj = new linkedListDelete();
        obj.linkedListInsert(11);
        obj.linkedListInsert(21);
        obj.linkedListInsert(31);
        obj.linkedListInsert(41);
        obj.linkedListInsert(51);

        obj.printList();

//        obj.deleteAtStart();
//        obj.printList();

//        obj.deleteAtEnd();
//        obj.printList();

        obj.deleteAtMiddle(2);
        obj.printList();


    }
}