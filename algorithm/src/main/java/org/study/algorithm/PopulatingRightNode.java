package org.study.algorithm;

import org.study.algorithm.node.Node;

/**
 * @author bby15929
 * @date 2021年02月24日 5:12 下午
 */
public class PopulatingRightNode {
    // https://leetcode-cn.com/problems/populating-next-right-pointers-in-each-node/
    public Node connect(Node root) {
        if(root == null || root.left == null){
            return root;
        }
        root.left.next  = root.right;
        populating(root.left,root.right);
        return root ;
    }

    public void populating(Node node1 , Node node2) {
        if (node1 == null || node2 == null) {
            return;
        }
        node1.next = node2;
        // 左节点指向
        populating(node1.left, node1.right);
        // 右节点指向
        populating(node2.left, node2.right);

        // 左节点的右节点指向右节点的左节点
        populating(node1.right, node2.left);
    }

    public static void main(String[] args) {
//          4
//        /   \
//       7     2
//       / \   / \
//       9   6 3   1
        Node node = Node.getDemo1();
        PopulatingRightNode populatingRightNode = new PopulatingRightNode();
        Node.DLR(populatingRightNode.connect(node));
    }
}
