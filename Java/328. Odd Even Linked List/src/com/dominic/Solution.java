package com.dominic;

class Solution {
    public ListNode oddEvenList(ListNode head) {

        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }

        int location = 2;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode even_old = head.next;
        ListNode node = head.next.next;

        while (node != null) {
            if (location % 2 == 0) {
                odd.next = node;
                odd = odd.next;
            } else {
                even.next = node;
                even = even.next;
            }

            node = node.next;

            location += 1;
        }

        if (location % 2 == 0) {
            odd.next = null;
        } else {
            even.next = null;
        }

        odd.next = even_old;

        return head;
    }
}