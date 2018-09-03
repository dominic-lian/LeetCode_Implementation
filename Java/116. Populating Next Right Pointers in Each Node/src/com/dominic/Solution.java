package com.dominic;

import javax.swing.tree.TreeNode;
import java.util.*;

/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {

        if (root == null) {
            return;
        }

        Queue<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
        queue.offer(root);

        List<Integer> list = new ArrayList<Integer>();

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<TreeLinkNode> levelList = new LinkedList<TreeLinkNode>();

            for (int i = 0; i < levelSize; i++) {
                TreeLinkNode node = queue.poll();
                levelList.add(node);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            for (int i = 0; i < levelList.size() - 1; i++) {
                TreeLinkNode node_1 = levelList.get(i);
                TreeLinkNode node_2 = levelList.get(i + 1);
                node_1.next = node_2;
            }

            TreeLinkNode node = levelList.get(levelList.size() - 1);

            node.next = null;
        }

    }
}