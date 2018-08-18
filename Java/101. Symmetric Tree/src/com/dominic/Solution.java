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
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return compare(root.left, root.right);
    }

    public static boolean compare(TreeNode left, TreeNode right) {
        if ((left == null && right != null) ||
                (left != null && right == null)) {
            return false;
        } else if (left == null && right == null) {
            return true;
        } else {
            if (left.val != right.val) {
                return false;
            } else {
                return compare(left.left, right.right) && compare(right.left, left.right);
            }
        }
    }
}