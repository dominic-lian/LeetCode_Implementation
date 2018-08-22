package com.dominic;

import java.util.List;

public class Main {

    public static void main(String[] args) {


        ListNode listNode_0_1 = new ListNode(6);
        ListNode listNode_0_2 = new ListNode(7);
        ListNode listNode_0_3 = new ListNode(8);

        ListNode listNode_1_1 = new ListNode(1);
        ListNode listNode_1_2 = new ListNode(2);
        ListNode listNode_1_3 = new ListNode(3);
        ListNode listNode_1_4 = new ListNode(4);
        ListNode listNode_1_5 = new ListNode(5);

        listNode_1_1.next= listNode_1_2;
        listNode_1_2.next= listNode_1_3;
        listNode_1_3.next= listNode_1_4;
        listNode_1_4.next= listNode_1_5;

        listNode_0_1.next= listNode_0_2;
        listNode_0_2.next= listNode_0_3;
        listNode_0_3.next= listNode_1_4;


        Solution solution = new Solution();

        ListNode intersectionNode = solution.getIntersectionNode(listNode_0_1, listNode_1_1);

        System.out.println(intersectionNode.val);

    }
}
