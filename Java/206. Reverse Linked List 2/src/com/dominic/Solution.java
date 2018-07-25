package com.dominic;

import java.util.List;

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode p = head;
        ListNode q = head.next;
        ListNode r = head.next.next;

        p.next = null;

        while (r != null) {
            q.next = p;
            p = q;
            q = r;
            r = r.next;
        }

        q.next = p;
        return q;
    }
}