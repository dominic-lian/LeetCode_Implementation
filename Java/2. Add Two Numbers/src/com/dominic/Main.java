package com.dominic;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode listNode_0_1 = new ListNode(1);
        ListNode listNode_0_2 = new ListNode(1);
        ListNode listNode_0_3 = new ListNode(1);

        ListNode listNode_1_1 = new ListNode(9);
        ListNode listNode_1_2 = new ListNode(2);
        ListNode listNode_1_3 = new ListNode(4);

        listNode_0_1.next = listNode_0_2;
        listNode_0_2.next = listNode_0_3;

        listNode_1_1.next = listNode_1_2;
        listNode_1_2.next = listNode_1_3;

        ListNode.printNode(solution.addTwoNumbers(listNode_0_1, listNode_1_1));
    }
}
