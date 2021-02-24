package org.study.algorithm.tree;

/**
 * @author bby15929
 * @date 2021年02月23日 5:46 下午
 */
public class InvertBinaryTree {
    // https://leetcode-cn.com/problems/invert-binary-tree/
   static TreeNode invertTree(TreeNode root) {
        // base case
        if (root == null) {
            return null;
        }

        /**** 前序遍历位置 ****/
        // root 节点需要交换它的左右子节点
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        // 让左右子节点继续翻转它们的子节点
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    public static void main(String[] args) {
//          4
//        /   \
//       7     2
//       / \   / \
//       9   6 3   1
        TreeNode.DLR(invertTree(TreeNode.getDemo1()));
    }
}
