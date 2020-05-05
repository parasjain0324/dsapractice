class loopDetectLinkedList {

    Node head;

    static class Node {
        int data;
        Node next;
        int visited;
        Node(int d) {
            data = d;
            next = null;
            visited = 0;
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
        loopDetectLinkedList obj = new loopDetectLinkedList();
        obj.insertNode(12);
        obj.insertNode(4);
        obj.insertNode(7);
        obj.insertNode(1);
        obj.insertNode(9);
        obj.insertNode(2);
        obj.insertNode(5);
        obj.insertNode(22);

        obj.head.next.next.next.next.next = obj.head;

//        obj.printList();

        int n = obj.loopDetection();
        if (n == 1) {
            System.out.println("There is a loop");
        }
        else if (n == 0) {
            System.out.println("There is NO loop");
        }
    }

    int loopDetection() {
        Node n = head;
        int i = 1;
        while ( n != null ) {
            if ( n.visited == 1 ) {
                return 1;
            }
            else {
                System.out.println("Node Data : " + n.data + ", Node Visited : " + n.visited);
                n.visited = 1;
                n = n.next;
            }
        }
        return 0;
    }
}