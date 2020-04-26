// Checking, how the Linked list Works...

public class testingExperiment {
    Nodee head;
    static class Nodee {
        int data;
        Nodee next;
        Nodee (int d) {
            data = d;
            next = null;
        }
    }
    public static void main(String[] args) {
        testingExperiment obj = new testingExperiment();
        obj.head = new Nodee(1);
        Nodee second = new Nodee(2);
        Nodee third = new Nodee(3);
        Nodee fourth = new Nodee(4);
        Nodee fifth = new Nodee(5);

        obj.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = null;

        Nodee n = obj.head;
        while (n != null) {
            System.out.println("Address of current Node" + n + "\n Value of current Node " + n.data);
            n = n.next;
        }

        System.out.println("\n \n Fifth -> Next : " + fifth.next );

    }
}
