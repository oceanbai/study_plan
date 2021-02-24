package org.study.algorithm.tree;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bby15929
 * @date 2021年02月23日 6:26 下午
 */
@Slf4j
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

   static TreeNode getDemo1(){
//          4
//        /   \
//       2     7
//       / \   / \
//       1   3 6   9
        TreeNode treeNode = new TreeNode(4);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(7);
        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        TreeNode treeNode3 = new TreeNode(1);
        TreeNode treeNode4 = new TreeNode(3);
        treeNode1.left = treeNode3;
        treeNode1.right = treeNode4;
        TreeNode treeNode5 = new TreeNode(6);
        TreeNode treeNode6 = new TreeNode(9);
        treeNode2.left = treeNode5;
        treeNode2.right = treeNode6;
        return treeNode;
    }

   static void DLR(TreeNode node) {
       if (node == null) {
           return;
       }
       log.info(node.val + "");
       DLR(node.left);

       DLR(node.right);
   }
}
