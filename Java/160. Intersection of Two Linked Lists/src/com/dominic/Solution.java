package com.dominic;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;

        while (a != null && b != null) {
            if (a != b) {
                a = a.next;
                b = b.next;

                if (a == null && b == null) {
                    return null;
                }
                if (a == null) {
                    a = headB;
                }
                if (b == null) {
                    b = headA;
                }
            } else {
                return a;
            }
        }

        return null;
    }
}