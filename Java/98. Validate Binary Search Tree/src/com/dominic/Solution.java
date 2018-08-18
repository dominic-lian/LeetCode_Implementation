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
    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();

        if (root == null) {
            return true;
        }

        inOrderTraversal(root, list);

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) >= list.get(i + 1)) {
                return false;
            }
        }

        return true;
    }

    public static void inOrderTraversal(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        } else {
            inOrderTraversal(root.left, list);
            list.add(root.val);
            inOrderTraversal(root.right, list);
        }
    }
}