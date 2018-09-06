package com.dominic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if (root == null) {
            return result;
        }

        Queue<Node> queue = new LinkedList<Node>();
        queue.offer(root);

        List<Integer> list = new ArrayList<Integer>();

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> levelList = new LinkedList<Integer>();

            for (int i = 0; i < levelSize; i++) {
                Node node = queue.poll();
                levelList.add(node.val);

                for (int j = 0; j < node.children.size(); j++) {
                    Node childNode = node.children.get(j);
                    queue.offer(childNode);
                };
            }

            result.add(levelList);
        }

        return result;
    }
}