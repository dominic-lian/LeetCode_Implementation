package com.dominic;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode treeNode_1 = new TreeNode(3);

        TreeNode treeNode_2 = new TreeNode(9);
        TreeNode treeNode_3 = new TreeNode(20);

        TreeNode treeNode_4 = new TreeNode(15);
        TreeNode treeNode_5 = new TreeNode(7);

        treeNode_1.left = treeNode_2;
        treeNode_1.right = treeNode_3;
        treeNode_3.left = treeNode_4;
        treeNode_3.right = treeNode_5;

        System.out.println(solution.maxDepth(treeNode_1));

    }
}
