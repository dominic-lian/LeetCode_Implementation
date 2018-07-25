package com.dominic;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ListNode listNode_1 = new ListNode(1);
        ListNode listNode_2 = new ListNode(2);

        listNode_1.next= listNode_2;
        listNode_2.next= null;

        Solution solution = new Solution();

        System.out.println("Oringinal List");
        ListNode.printNode(listNode_1);

        solution.removeNthFromEnd(listNode_1, 1);

        System.out.println("New List");
        ListNode.printNode(listNode_1);

    }
}
