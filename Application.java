public class Application {

    /**
     * Main method to test the tree creation and DFS traversal.
     *
     * @param args Tree Height
     */
    public static void main(String[] args) {
        Tree aTree = new Tree();  // Creates a tree with root
        Node root = aTree.generatePracticeTree(5);

        DepthFirstSearch dfs = new DepthFirstSearch();
        dfs.DFS(root);

        // Print the number of nodes traversed
        System.out.println("Number of nodes traversed: " + dfs.getNodesTraversed());

        // Print the height of the tree
        int treeHeight = dfs.calculateHeight(root);
        System.out.println("Height of the tree: " + treeHeight);
    }
}