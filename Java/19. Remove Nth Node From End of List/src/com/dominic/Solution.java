package com.dominic;

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode listNode_1 = head;

        while (n-- != 0)
            listNode_1 = listNode_1.next;

        if (listNode_1 == null)
            return head.next;

        ListNode listNode_2 = head;

        while (listNode_1.next != null) {
            listNode_2 = listNode_2.next;
            listNode_1 = listNode_1.next;
        }

        listNode_2.next = listNode_2.next.next;

        return head;
    }
}