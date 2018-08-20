package com.dominic;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        return getTree(nums, 0, nums.length - 1);
    }

    public static TreeNode getTree(int[] nums, int left, int right) {
        if (left <= right) {
            int mid = (left + right) / 2;

            TreeNode treeNode = new TreeNode(nums[mid]);

            treeNode.left = getTree(nums, left, mid - 1);
            treeNode.right = getTree(nums, mid + 1, right);

            return treeNode;
        } else {
            return null;
        }
    }
}