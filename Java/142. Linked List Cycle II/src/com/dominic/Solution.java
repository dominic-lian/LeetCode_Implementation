package com.dominic;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode listNode_1 = head;
        ListNode listNode_2 = head;

        while (listNode_2 != null && listNode_2.next != null) {
            listNode_1 = listNode_1.next;
            listNode_2 = listNode_2.next.next;

            if (listNode_1 == listNode_2) {
                listNode_1 = head;
                while (listNode_1 != listNode_2) {
                    listNode_1 = listNode_1.next;
                    listNode_2 = listNode_2.next;
                }
                return listNode_1;

            }
        }

        return null;
    }
}