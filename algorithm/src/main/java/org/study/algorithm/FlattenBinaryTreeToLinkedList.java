package org.study.algorithm;

import org.study.algorithm.node.TreeNode;

/**
 * @author bby15929
 * @date 2021年02月24日 8:51 下午
 */
public class FlattenBinaryTreeToLinkedList {
    //https://leetcode-cn.com/problems/flatten-binary-tree-to-linked-list/
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        flatten(root.left);
        flatten(root.right);
        TreeNode left = root.left;
        TreeNode right = root.right;

        root.left = null;
        root.right = left;

        TreeNode p = root;
        while (p.right != null){
            p = p.right;
        }
        p.right = right;
    }
}
