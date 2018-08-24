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
    List<Integer> answer = new ArrayList<Integer>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root != null) {
            answer.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }

        return answer;
    }
}