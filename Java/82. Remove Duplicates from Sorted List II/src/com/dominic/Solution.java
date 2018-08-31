package com.dominic;

class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode start = new ListNode(-1);
        start.next = head;
        ListNode pre = start;

        while (pre.next != null) {
            ListNode cur = pre.next;
            while (cur.next != null && cur.val == cur.next.val) {
                cur = cur.next;
            }
            if (cur != pre.next) {
                pre.next = cur.next;
            } else {
                pre = pre.next;
            }
        }

        return start.next;
    }
}