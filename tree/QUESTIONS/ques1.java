//WAP to find 4th Node in Inorder and Post Order Traversal in Tree

class TNode {
    TNode left, right;
    int data;
    TNode( int item ) {
        this.data = item;
        left = right = null;
    }
}

class ques1{
    TNode root;
    ques1() {
        root = null;
    }

    static int n = 1;

    void printPostfix ( TNode node ) {
        if ( node == null ) {
            return;
        }
        printPostfix ( node.left );
        printPostfix ( node.right );
        if ( n == 4 ) {
            System.out.println( n + "th Term : " +  node.data );
        }
        n++;
    }

    public static void main(String[] args) {
        ques1 obj = new ques1();
        obj.root = new TNode(1);
        obj.root.left = new TNode(2);
        obj.root.right = new TNode(3);
        obj.root.left.left = new TNode(4);
        obj.root.left.right = new TNode(5);
        obj.root.right.left = new TNode(6);
        obj.root.right.right = new TNode(7);

        obj.printPostfix( obj.root );

    }
}