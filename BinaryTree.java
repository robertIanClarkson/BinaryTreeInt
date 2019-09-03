/* Note this node is for storing int values only */

public class BinaryTree {
    public static void main (String[] args) {
        Node root = new Node(5);

        System.out.println("Root: " + root.data);

        int[] myNums = {1, 9, 3, 7, 2, 8, 4, 6, 0, -2};

        for (int i = 0; i < myNums.length; i++) {
            System.out.println("Index " + i + " : " + myNums[i]);
            root.insert(myNums[i]);
        }

        System.out.println("\nRoot Contains 11: " + root.contains(11));
        System.out.println("Root Contains 6: " + root.contains(6));
        System.out.println("Root Contains 1: " + root.contains(1));

        System.out.println("\nprintInOrder: ");
        root.printInOrder();

        System.out.println("\nprintPreOrder: ");
        root.printPreOrder();

        System.out.println("\nprintPostOrder: ");
        root.printPostOrder();
    }
}
