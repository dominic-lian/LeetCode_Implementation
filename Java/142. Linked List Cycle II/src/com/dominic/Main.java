package com.dominic;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ListNode listNode_1 = new ListNode(1);
        ListNode listNode_2 = new ListNode(2);
        ListNode listNode_3 = new ListNode(3);
        ListNode listNode_4 = new ListNode(4);

        listNode_1.next = listNode_2;
        listNode_2.next = listNode_3;
        listNode_3.next = listNode_4;
        listNode_4.next = listNode_2;

        Solution solution = new Solution();

        ListNode listNode = solution.detectCycle(listNode_1);

        System.out.println(listNode.val);

    }
}
