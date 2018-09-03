package com.dominic;

import javax.swing.tree.TreeNode;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeLinkNode treeNode_1 = new TreeLinkNode(1);
        TreeLinkNode treeNode_2 = new TreeLinkNode(2);
        TreeLinkNode treeNode_3 = new TreeLinkNode(3);
        TreeLinkNode treeNode_4 = new TreeLinkNode(4);
        TreeLinkNode treeNode_5 = new TreeLinkNode(5);
        TreeLinkNode treeNode_6 = new TreeLinkNode(6);
        TreeLinkNode treeNode_7 = new TreeLinkNode(7);


        treeNode_1.left = treeNode_2;
        treeNode_1.right = treeNode_3;
        treeNode_2.left = treeNode_4;
        treeNode_2.right = treeNode_5;
        treeNode_3.left = treeNode_6;
        treeNode_3.right = treeNode_7;

        solution.connect(treeNode_1);

    }
}
