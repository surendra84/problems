
import java.util.Deque;
import java.util.LinkedList;

/**
 * Test Program for the binary tree
 */
public class BinaryTreeTest {
    public static void main(String[] args) {
        System.out.println("This is the binary tree test program");
        /**
         * Print the below tree
         *              1
         *           2      3
         *        4     5  6    7
         */
        Binary binary = new Binary(1);
        binary.left = new Binary(2);
        binary.right = new Binary(3);
        binary.left.left = new Binary(4);
        binary.left.right = new Binary(5);
        binary.right.left = new Binary(6);
        binary.right.right = new Binary(7);
        System.out.println("Pre Order");
        printPreOrder(binary);
        System.out.println("\nIn Order");
        printInOrder(binary);
        System.out.println("\nPost Order");
        printPostOrder(binary);
        System.out.println("\nPrint Node Left Right");
        printNLR(binary);
        System.out.println("\n Height of the binary tree is: " + getHeight(binary));
    }

    public static void printPreOrder(Binary node) {
        if(node!=null) {
            System.out.print(node.data + "->");
            printPreOrder(node.left);
            printPreOrder(node.right);
        }
    }

    public static void printInOrder(Binary node) {
        if(node!=null) {
            printInOrder(node.left);
            System.out.print(node.data + "->");
            printInOrder(node.right);
        }
    }

    public static void printPostOrder(Binary node) {
        if(node!=null) {
            printPostOrder(node.left);
            printPostOrder(node.right);
            System.out.print(node.data + "->");
        }
    }

    public static void printNLR(Binary node) {
        Deque<Binary> deque = new LinkedList<>();
        deque.addFirst(node);
        while(!deque.isEmpty()) {
            node = deque.removeLast();
            System.out.print(node.data + "->");
            if(node.left != null) {
                deque.addFirst(node.left);
            }
            if(node.right != null) {
                deque.addFirst(node.right);
            }
        }
    }

    public static int getHeight(Binary node) {
        if(node == null) {
            return 0;
        }
        int lHeight = getHeight(node.left);
        int rHeight = getHeight(node.right);
        return 1+Math.max(lHeight, rHeight);
    }
}

class Binary {
    int data;
    Binary left, right;
    Binary(int data) {
        this.data = data;
        left = right = null;
    }
}
