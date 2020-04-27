// Do this again after finishing Stacks

//Sample Input -  4,7,1,7,4


public class linkedListPalindrome {
    Nodee head;
    static class Nodee {
        int data;
        Nodee next;
        Nodee(int d){
            data = d;

        }
    }
    Nodee rev(Nodee node) {
        Nodee prev = null;
        Nodee next = null;
        Nodee current = node;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
    void printList(Nodee node) {
        Nodee n = node;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    public static void main(String[] args) {
        linkedListPalindrome obj = new linkedListPalindrome();
        obj.head = new Nodee(1);
        Nodee second = new Nodee(2);
        Nodee third = new Nodee(1);
        Nodee fourth = new Nodee(2);
        Nodee fifth = new Nodee(1);

        obj.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = null;

        obj.printList(obj.head);

        Nodee node = obj.rev(obj.head);

        System.out.println(" ");

        obj.printList(node);
    }
}