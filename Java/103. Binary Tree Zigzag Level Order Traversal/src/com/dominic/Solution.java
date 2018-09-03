package com.dominic;

import com.sun.org.apache.xerces.internal.impl.dv.xs.YearDV;
import com.sun.org.apache.xpath.internal.operations.Bool;

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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if (root == null) {
            return result;
        }

        boolean leftToRight = true;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);

        List<Integer> list = new ArrayList<Integer>();

        while (!queue.isEmpty()) {
            leftToRight = !leftToRight;

            int levelSize = queue.size();
            List<Integer> levelList = new ArrayList<Integer>();

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

            if (leftToRight) {
                Collections.reverse(levelList);
            }

            result.add(levelList);
        }

        return result;
    }
}