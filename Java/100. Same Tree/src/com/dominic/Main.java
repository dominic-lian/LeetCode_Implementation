package com.dominic;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode treeNode_01_01 = new TreeNode(10);
        TreeNode treeNode_01_02 = new TreeNode(10);
        TreeNode treeNode_01_03 = new TreeNode(10);

        TreeNode treeNode_02_01 = new TreeNode(10);
        TreeNode treeNode_02_02 = new TreeNode(10);
        TreeNode treeNode_02_03 = new TreeNode(10);

        treeNode_01_01.left = treeNode_01_02;
        treeNode_01_01.right = treeNode_01_03;

        treeNode_02_01.left = treeNode_02_02;
        treeNode_02_01.right = treeNode_02_03;

        System.out.println(solution.isSameTree(treeNode_01_01, treeNode_02_01));
    }
}
