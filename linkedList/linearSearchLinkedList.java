class linearSearchLinkedList {

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
        while (n.next != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public static void main(String[] args) {
        linearSearchLinkedList obj = new linearSearchLinkedList();
        obj.insert(1);
        obj.insert(2);
        obj.insert(3);
        obj.insert(4);
        obj.insert(5);
        obj.insert(6);

        obj.printList();

        obj.searchElement(39);
    }


    void searchElement(int element) {
        Node n = head;
        int i = 1;
        int flag = 0;
        while (n != null) {
            if (n.data == element) {
                System.out.println("\n Element found at position : " + i);
                flag = 1;
                break;
            }
            else {
                n = n.next;
                i++;
            }
        }
        if (flag == 0) {
            System.out.println("\n Element not found in the given Linked list");
        }
    }


}