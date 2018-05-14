package come.class04.binarytree;

public class SearchNodeIterativeInBST {
    private TreeNode search(TreeNode root, int target) {
        while (root != null && root.key != target) {
            if (root.key < target) {
                root = root.right;
            } else {
                root = root.left;
            }
        }
        return root;
    }
}