//Raul X Gonzalez
//Y00339371
import java.util.ArrayList;

public class BinaryTree {
    private String        data;
    private BinaryTree leftChild;
    private BinaryTree rightChild;

    // A constructor that makes a Sentinel node
    public BinaryTree() {
        data = null;
        leftChild = null;
        rightChild = null;
    }

    // This constructor now uses sentinels for terminators instead of null
    public BinaryTree(String d) {
        data = d;
        leftChild = new BinaryTree();
        rightChild = new BinaryTree();
    }

    // This constructor is unchanged
    public BinaryTree(String d, BinaryTree left, BinaryTree right) {
        data = d;
        leftChild = left;
        rightChild = right;
    }

    // Get methods
    public String getData() { return data; }
    public BinaryTree getLeftChild() { return leftChild; }
    public BinaryTree getRightChild() { return rightChild; }

    // Set methods
    public void setData(String d) { data = d; }
    public void setLeftChild(BinaryTree left) { leftChild = left; }
    public void setRightChild(BinaryTree right) { rightChild = right; }

    // Return a list of all data within the leaves of the tree
    public ArrayList<String> leafData()  {
        ArrayList<String>  result = new ArrayList<String>();

        if (data != null) {
            if ((leftChild.data == null) && (rightChild.data == null))
                result.add(data);
            result.addAll(leftChild.leafData());
            result.addAll(rightChild.leafData());
        }
        return result;
    }

    // Determines the height of the tree, which is the number of branches
    // in the path from the root to the deepest leaf.
    public int height()  {
        // Check if this is a sentinel node
        if (data == null)
            return -1;

        return 1 + Math.max(leftChild.height(),
                rightChild.height());
    }

    public boolean isTheSameAs(BinaryTree t) {
        return false;  //. Replace this code with your own
    }
}


public class BinaryTreeTestProgram {
    public static void main(String[] args) {
        BinaryTree     root;

        root = new BinaryTree("A",
                new BinaryTree("B",
                        new BinaryTree("C",
                                new BinaryTree("D"),
                                new BinaryTree("E",
                                        new BinaryTree("F",
                                                new BinaryTree("G"),
                                                new BinaryTree("I")),
                                        new BinaryTree("H"))),
                        new BinaryTree("J",
                                new BinaryTree("K",
                                        new BinaryTree(),
                                        new BinaryTree("L",
                                                new BinaryTree(),
                                                new BinaryTree("M"))),
                                new BinaryTree("N",
                                        new BinaryTree(),
                                        new BinaryTree("O")))),
                new BinaryTree("P",
                        new BinaryTree("Q"),
                        new BinaryTree("R",
                                new BinaryTree("S",
                                        new BinaryTree("T"),
                                        new BinaryTree()),
                                new BinaryTree("U"))));

        System.out.println("Tree Height = " + root.height());
        System.out.println("Tree Leaves = " + root.leafData());
    }
}


public class BinaryTreeTestProgram2 {
    public static void main(String[] args) {
        BinaryTree     tree1, tree2, tree3, tree4, tree5;

        tree1 = new BinaryTree("A",
                new BinaryTree("B",
                        new BinaryTree("C",
                                new BinaryTree("D"),
                                new BinaryTree("E",
                                        new BinaryTree("F",
                                                new BinaryTree("G"),
                                                new BinaryTree("I")),
                                        new BinaryTree("H"))),
                        new BinaryTree("J",
                                new BinaryTree("K",
                                        new BinaryTree(),
                                        new BinaryTree("L",
                                                new BinaryTree(),
                                                new BinaryTree("M"))),
                                new BinaryTree("N",
                                        new BinaryTree(),
                                        new BinaryTree("O")))),
                new BinaryTree("P",
                        new BinaryTree("Q"),
                        new BinaryTree("R",
                                new BinaryTree("S",
                                        new BinaryTree("T"),
                                        new BinaryTree()),
                                new BinaryTree("U"))));
        tree2 = new BinaryTree("A",
                new BinaryTree("B",
                        new BinaryTree("C",
                                new BinaryTree("D"),
                                new BinaryTree("E",
                                        new BinaryTree("F",
                                                new BinaryTree("Z"), //different letter here
                                                new BinaryTree("I")),
                                        new BinaryTree("H"))),
                        new BinaryTree("J",
                                new BinaryTree("K",
                                        new BinaryTree(),
                                        new BinaryTree("L",
                                                new BinaryTree(),
                                                new BinaryTree("M"))),
                                new BinaryTree("N",
                                        new BinaryTree(),
                                        new BinaryTree("O")))),
                new BinaryTree("P",
                        new BinaryTree("Q"),
                        new BinaryTree("R",
                                new BinaryTree("S",
                                        new BinaryTree("T"),
                                        new BinaryTree()),
                                new BinaryTree("U"))));
        tree3 = new BinaryTree("A",
                    new BinaryTree("B",
                        new BinaryTree("C",
                                new BinaryTree("D"),
                                new BinaryTree("E",
                                        new BinaryTree("F",
                                                new BinaryTree("G"),
                                                new BinaryTree("I")),
                                        new BinaryTree("H"))),
                        new BinaryTree()),  // "J" tree removed
                new BinaryTree("P",
                        new BinaryTree("Q"),
                        new BinaryTree("R",
                                new BinaryTree("S",
                                        new BinaryTree("T"),
                                        new BinaryTree()),
                                new BinaryTree("U"))));
        tree4 = new BinaryTree("A",
                new BinaryTree("B",
                        new BinaryTree("C",
                                new BinaryTree("D"),
                                new BinaryTree("E",
                                        new BinaryTree("F",
                                                new BinaryTree("G"),
                                                new BinaryTree("I")),
                                        new BinaryTree("H"))),
                        new BinaryTree("J",
                                new BinaryTree("K",
                                        new BinaryTree(),
                                        new BinaryTree("L",
                                                new BinaryTree(),
                                                new BinaryTree("M"))),
                                new BinaryTree("N",
                                        new BinaryTree(),
                                        new BinaryTree("O")))),
                new BinaryTree("P",
                        new BinaryTree("Q"),
                        new BinaryTree("R",
                                new BinaryTree("S",
                                        new BinaryTree("T"),
                                        new BinaryTree()),
                                new BinaryTree())));  // "U" tree removed
        tree5 = new BinaryTree("A", new BinaryTree(), new BinaryTree()); // only single node tree

        System.out.println("Tree 1 is the same as Tree 1 = " + tree1.isTheSameAs(tree1)); // true
        System.out.println("Tree 1 is the same as Tree 2 = " + tree1.isTheSameAs(tree2)); // false
        System.out.println("Tree 1 is the same as Tree 3 = " + tree1.isTheSameAs(tree3)); // false
        System.out.println("Tree 1 is the same as Tree 4 = " + tree1.isTheSameAs(tree4)); // false
        System.out.println("Tree 1 is the same as Tree 5 = " + tree1.isTheSameAs(tree5)); // false
        System.out.println("Tree 5 is the same as Tree 1 = " + tree5.isTheSameAs(tree1)); // false
        System.out.println("Tree 5 is the same as Tree 5 = " + tree5.isTheSameAs(tree5)); // true

    }
}