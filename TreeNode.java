import java.util.ArrayList;
import java.util.List;

class TreeNode<T> {
    T data;
    List<TreeNode<T>> children;

    // Constructor
    public TreeNode(T data) {
        this.data = data;
        this.children = new ArrayList<>();
    }

    // Method to add a child node
    public void addChild(TreeNode<T> child) {
        children.add(child);
    }

    // Recursive method to print the tree
    public void printTree(String prefix) {
        System.out.println(prefix + data);
        for (TreeNode<T> child : children) {
            child.printTree(prefix + "--");
        }
    }

    public static void main(String[] args) {
        // Creating nodes
        TreeNode<String> root = new TreeNode<>("Root");
        TreeNode<String> child1 = new TreeNode<>("Child 1");
        TreeNode<String> child2 = new TreeNode<>("Child 2");
        TreeNode<String> child3 = new TreeNode<>("Child 3");

        // Adding children to root
        root.addChild(child1);
        root.addChild(child2);
        root.addChild(child3);

        // Adding children to one of the child nodes
        child1.addChild(new TreeNode<>("Child 1.1"));
        child1.addChild(new TreeNode<>("Child 1.2"));

        // Printing the tree structure
        root.printTree("");
    }
}