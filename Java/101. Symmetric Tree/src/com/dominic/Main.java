package com.dominic;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode treeNode_1 = new TreeNode(1);

        TreeNode treeNode_2 = new TreeNode(2);
        TreeNode treeNode_3 = new TreeNode(2);

        TreeNode treeNode_4 = new TreeNode(3);
        TreeNode treeNode_5 = new TreeNode(3);

        treeNode_1.left = treeNode_2;
        treeNode_1.right = treeNode_3;
        treeNode_2.right = treeNode_4;
        treeNode_3.left = treeNode_5;

        System.out.println(solution.isSymmetric(treeNode_1));

    }
}
