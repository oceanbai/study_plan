package org.study.algorithm;

import org.study.algorithm.node.TreeNode;

/**
 * @author bby15929
 * @date 2021年02月25日 4:50 下午
 */
// 最大二叉树 https://leetcode-cn.com/problems/maximum-binary-tree/
public class MaximumBinaryTree {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return build(nums, 0, nums.length - 1);
    }

    public TreeNode build(int[] nums, int lo, int hi) {
        if (lo > hi) {
            return null;
        }
        // 找到数组中的最大值和对应的索引
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = lo; i <= hi; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        TreeNode treeNode = new TreeNode(max);
        // 递归调用构造左右子树
        treeNode.left = build(nums, lo, index - 1);
        treeNode.right = build(nums, index + 1, hi);
        return treeNode;
    }
}
