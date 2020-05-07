import java.util.Stack;

public class stackImplementation {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
//        System.out.println(stack.push(9));
//        System.out.println(stack.pop());
//        System.out.println(stack.peek());
        System.out.println(stack.search(4));
        System.out.println(stack.empty());
    }
}