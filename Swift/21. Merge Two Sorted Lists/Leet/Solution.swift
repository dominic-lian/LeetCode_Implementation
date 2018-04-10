//
//  Solution.swift
//  Leet
//
//  Created by dominic_lian on 2018/4/1.
//  Copyright © 2018年 dominic_lian. All rights reserved.
//


public class ListNode {
    public var val: Int
    public var next: ListNode?
    public init(_ val: Int) {
        self.val = val
        self.next = nil
    }
    
}


class Solution {
    func mergeTwoLists(_ l1: ListNode?, _ l2: ListNode?) -> ListNode? {

        if l1 == nil {
            return l2
        }
        
        if l2 == nil {
            return l1
        }
        
        if l1!.val < l2!.val {
            l1?.next = self.mergeTwoLists(l1?.next, l2)
            return l1
        } else {
            l2?.next = self.mergeTwoLists(l2?.next, l1)
            return l2
        }
    }
}



