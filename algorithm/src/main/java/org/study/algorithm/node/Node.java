package org.study.algorithm.node;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bby15929
 * @date 2021年02月24日 6:02 下午
 */
@Slf4j
public class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }

    public static Node getDemo1() {
//          4
//        /   \
//       2     7
//       / \   / \
//       1   3 6   9
        Node treeNode = new Node(4);
        Node treeNode1 = new Node(2);
        Node treeNode2 = new Node(7);
        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        Node treeNode3 = new Node(1);
        Node treeNode4 = new Node(3);
        treeNode1.left = treeNode3;
        treeNode1.right = treeNode4;
        Node treeNode5 = new Node(6);
        Node treeNode6 = new Node(9);
        treeNode2.left = treeNode5;
        treeNode2.right = treeNode6;
        return treeNode;
    }

    public static void DLR(Node node) {
        if (node == null ) {
            return;
        }
        if (node.next != null){
            log.info(node.next.val + "");
        }

        DLR(node.left);

        DLR(node.right);
    }
}
