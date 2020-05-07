
public class stackImplementationArray {

    int MAX = 5;
    int[] arr = new int[MAX];
    int top = -1;

    void push(int element) {

        if ( top+1 >= MAX ) {
            System.out.println("Overflow");
        }
        else {
            arr[top+1] = element;
            top = top + 1;
        }
    }

    void pop() {

        if ( top == -1 ) {
            System.out.println("Underflow");
        }
        else {
            int element = arr[top];
            top = top - 1;
            System.out.println(element);
        }
    }

    void peek() {

        System.out.println(arr[top]);
    }

    public static void main(String[] args) {

        stackImplementationArray obj = new stackImplementationArray();
        int[] arr = new int[5];
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.push(6);
        obj.pop();
        obj.pop();
        obj.pop();
        obj.peek();
        obj.pop();


    }
}