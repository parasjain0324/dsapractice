import java.util.Stack;

public class infixToPostfix {

    int checkPrecedence ( char symbol ) {
        switch ( symbol ) {
            case '+' :
            case '-' :
                return 1;
            case '*' :
            case '/' :
                return 2;
            case '^' :
                return 3;
            default:
                return -1;
        }
    }

    String infixToPostfix( String infixExpression ){

        String postFixExpression = new String("");
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < infixExpression.length(); i++) {
            char c = infixExpression.charAt(i);

            if ( Character.isLetterOrDigit( c ) ) {
                postFixExpression += c;
            }
            else if ( c == '(' ) {
                stack.push( c );
            }
            else if ( c == ')' ) {
                while ( !stack.isEmpty() && stack.peek() != '(' ) {
                    postFixExpression += stack.pop();
                }
                if ( !stack.isEmpty() && stack.peek() != '(' ) {
                    System.out.println("Invalid Expression");
                }
                stack.pop();
            }
            else {
                while ( !stack.isEmpty() && checkPrecedence(c) <= checkPrecedence(stack.peek()) ) {
                    postFixExpression += stack.pop();
                }
                stack.push( c );
            }
        }

        while ( !stack.isEmpty() ) {
            postFixExpression += stack.pop();
        }

        return postFixExpression;
    }

    public static void main(String[] args) {
        infixToPostfix obj = new infixToPostfix();
        String infixExpression = "(a+b*(c^d-e)^(f+g*h)-i)";
        System.out.println(obj.infixToPostfix( infixExpression ));
    }
}