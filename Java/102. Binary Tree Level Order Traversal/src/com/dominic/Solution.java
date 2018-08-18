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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<List<Integer>>();

        if (root == null) {
            return answer;
        }

        List<TreeNode> nodeList = new ArrayList<TreeNode>();
        nodeList.add(root);

        List<Integer> list = new ArrayList<Integer>();

        while (nodeList.size() != 0) {
            List<TreeNode> newNodeList = new ArrayList<TreeNode>();

            for (int i = 0; i < nodeList.size(); i++) {
                TreeNode node = nodeList.get(i);
                list.add(node.val);
                if (node.left != null) {
                    newNodeList.add(node.left);
                }
                if (node.right != null) {
                    newNodeList.add(node.right);
                }
            }

            nodeList = newNodeList;

            answer.add(list);

            list = new ArrayList<Integer>();
        }

        return answer;
    }
}