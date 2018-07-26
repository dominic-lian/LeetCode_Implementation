package com.dominic;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode last = slow.next;
        ListNode pre = head;

        ListNode reversed = reverseList(last);

        while (reversed != null) {
            if (pre.val != reversed.val) {
                return false;
            }
            pre = pre.next;
            reversed = reversed.next;
        }

        reverseList(slow.next);

        return true;

    }

    private static ListNode reverseList(ListNode head) {
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