//WAP to find the boundary elements in Tree

//class TNode {
//    TNode left, right;
//    int data;
//    TNode( int item ) {
//        this.data = item;
//        left = right = null;
//    }
//}

class ques2{
    TNode root;
    ques2() {
        root = null;
    }

    void printLeafNode ( TNode node ) {
        if ( node == null ) {
            return;
        }
        printLeafNode ( node.left );
        printLeafNode ( node.right );
        if ( node.left == null && node.right == null ) {
            System.out.println( " Leaf Node : " + node.data );
        }
    }

    void printLeftNode ( TNode node ) {
        if ( node.left == null && node.right == null ) {
            return;
        }

        System.out.println(" Left Node : " + node.data);
        printLeftNode( node.left );
    }

    void printRightNode ( TNode node ) {
        if ( node.left == null && node.right == null ) {
            return;
        }

        System.out.println(" Right Node : " + node.data);
        printRightNode( node.right );
    }

    public static void main(String[] args) {
        ques2 obj = new ques2();
        obj.root = new TNode(1);
        obj.root.left = new TNode(2);
        obj.root.right = new TNode(3);
        obj.root.left.left = new TNode(4);
        obj.root.left.right = new TNode(5);
        obj.root.left.right.right = new TNode(8);
        obj.root.right.left = new TNode(6);
        obj.root.right.right = new TNode(7);

        obj.printLeftNode( obj.root );
        obj.printLeafNode( obj.root );
        obj.printRightNode( obj.root.right );
    }
}