package com.dominic;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ListNode listNode_1 = new ListNode(6);
        ListNode listNode_2 = new ListNode(3);
        ListNode listNode_3 = new ListNode(5);
        ListNode listNode_4 = new ListNode(1);
        ListNode listNode_5 = new ListNode(8);

        listNode_1.next= listNode_2;
        listNode_2.next= listNode_3;
        listNode_3.next= listNode_4;
        listNode_4.next= listNode_5;

        Solution solution = new Solution();

        System.out.println("Oringinal List");
        ListNode.printNode(listNode_1);

        ListNode listNode_final = solution.reverseList(listNode_1);

        System.out.println("New List");
        ListNode.printNode(listNode_final);

    }
}
