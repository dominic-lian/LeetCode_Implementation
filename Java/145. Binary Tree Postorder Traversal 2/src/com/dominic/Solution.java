package com.dominic;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();

        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<TreeNode>();

        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.peek();

            if (node.left == null && node.right == null) {
                result.add(node.val);
                stack.pop();
            } else {
                if (node.right != null) {
                    stack.push(node.right);
                    node.right = null;
                }

                if (node.left != null) {
                    stack.push(node.left);
                    node.left = null;
                }
            }
        }

        return result;
    }
}