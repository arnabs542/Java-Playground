package come.class05_BinaryTree_BinarySearchTree;

public class Q1_1_CheckIfBinaryTreeIsBalanced {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        if (-1 == getHeight(root)) {
            return false;
        }

        return true;
    }

    /**
     * @param root: A root node of a tree
     * @return: If the differ of heights is greater than 1, return -1. If not, return height
     */
    private int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        if (leftHeight == -1 || rightHeight == -1) {
            return -1;
        }
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
