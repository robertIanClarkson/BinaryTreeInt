/* Note this node is for storing int values only */

class Node {
    // Children Nodes
    Node left, right;

    // data in THIS node
    int data;

    // contructor
    public Node( int data) {
        this.data = data;
    }

    // insert an int into the binary tree by ultimately creating a new Node
    public void insert( int value ) {
        if (value <= data) { // data goes left
            if (left == null) { // no left Node
                left = new Node(value); // create a new left child node
            } else { // there is already a left node
                left.insert(value); // ask the left child node to insert the value
            }
        } else { // data goes right
            if (right == null) { // no right node
                right = new Node(value); // create a new right child node
            } else { // there is already a right node
                right.insert(value); // ask the right child node to insert the value
            }
        }
    }

    // see if the tree already has a node with the value --> TRUE = tree does contain the VALUE
    public boolean contains( int value ) {
        if (value == data) { // this node
            return true;
        } else if (value < data) { // LEFT Node
            if (left == null) { // there is no left node --> tree DOES NOT contain the VALUE
                return false;
            } else { // ask the left child node
                return left.contains(value);
            }
        } else { // RIGHT Node
            if (right == null) { // there is no right node --> tree DOES NOT contain the VALUE
                return false;
            } else { // ask the right child node
                return right.contains(value);
            }
        }
    }

    // print all the values from left to right OR least to greatest -->PRINT--> left node -> this node -> right node
    public void printInOrder() {
        if (left != null) { // there IS a left node
            left.printInOrder(); // PRINT LEFT NODES
        }

        System.out.println(data); // THEN PRINT THIS NODE

        if (right != null) { // there IS a right node
            right.printInOrder(); // PRINT RIGHT NODES
        }
    }

    // print all the values in root to children order --> PRINT--> root node --> left node --> right node
    public void printPreOrder() {
        System.out.println(data); // PRINT THIS NODE

        if (left != null) { // there IS a left node
            left.printPreOrder(); // PRINT LEFT NODES
        }

        if (right != null) {
            right.printPreOrder(); // PRINT RIGHT NODES
        }
    }

    // print all values  in children to root order --> PRINT--> left node --> right node --> root node
    public void printPostOrder() {
        if (left != null) { // there IS a left node
            left.printPostOrder(); // PRINT LEFT NODES
        }

        if(right != null) { // there IS a right node
            right.printPostOrder(); // PRINT RIGHT NODES
        }

        System.out.println(data); // PRINT THIS NODE
    }
}
