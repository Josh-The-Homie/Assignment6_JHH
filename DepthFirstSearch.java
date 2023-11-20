/**
 * DepthFirstSearch class for performing depth-first traversal on a binary tree.
 */
public class DepthFirstSearch {

    Node root;
    private int nodesTraversed;

    /**
     * Constructor for DepthFirstSearch class.
     */
    public DepthFirstSearch() {
        System.out.println("Call DFS with root node to do a Depth First Search.");
        nodesTraversed = 0;
    }

    /**
     * Recursive method to perform depth-first traversal in preorder manner.
     *
     * @param node The current node being traversed.
     */
    public void DFS(Node node) {
        if (node == null) {
            return;
        }

        // Print the value of the current node
        System.out.println("Node Value: " + node.getData());

        // Increment the number of nodes traversed
        nodesTraversed++;

        // Recursively traverse the left subtree
        DFS(node.getlChild());

        // Recursively traverse the right subtree
        DFS(node.getrChild());
    }

    /**
     * Get the number of nodes traversed during the DFS traversal.
     *
     * @return The number of nodes traversed.
     */
    public int getNodesTraversed() {
        return nodesTraversed;
    }

    /**
     * Calculate the height of the tree starting from a given node.
     *
     * @param node The starting node for height calculation.
     * @return The height of the tree.
     */
    public int calculateHeight(Node node) {
        if (node == null) {
            return 0;
        }

        // Calculate the height of the left and right subtrees
        int leftHeight = calculateHeight(node.getlChild());
        int rightHeight = calculateHeight(node.getrChild());

        // Return the height of the tree rooted at the current node
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
