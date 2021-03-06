package com.dominic;

import java.util.*;

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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> averageArray = new ArrayList<Double>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if (root == null) {
            return averageArray;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);

        List<Integer> list = new ArrayList<Integer>();

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> levelList = new LinkedList<Integer>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                levelList.add(node.val);

                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            result.add(levelList);
        }

        for (int i = 0; i < result.size(); i++) {
            double average = 0;
            long sum = 0;
            List<Integer> level = result.get(i);
            for (int j = 0; j < level.size(); j++) {
                sum += level.get(j);
            }

            average = (double) sum / level.size();
            averageArray.add(average);
        }

        return averageArray;
    }
}