package com.dominic;

// Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    public static void printNode(ListNode listNode) {
        if (listNode != null) {
            System.out.println(listNode.val);
        } else {
            return;
        }
        if (listNode.next != null)
            printNode(listNode.next);
    }
}
