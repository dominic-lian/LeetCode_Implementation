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
    var isFirst = true
    var carry: Int = 0
    func addTwoNumbers(_ l1: ListNode?, _ l2: ListNode?) -> ListNode? {
        if l1 != nil && l2 != nil {
            isFirst = false
            
            let sum: Int! = l1!.val + l2!.val + carry
            let lsum = ListNode.init(sum % 10)
            carry = sum / 10
            lsum.next = self.addTwoNumbers(l1?.next, l2?.next)
            
            return lsum
        } else if (l1 == nil && l2 != nil) || (l1 != nil && l2 == nil) {
            isFirst = false
            
            let lsum = ListNode.init(0)
            
            if (l1 == nil) {
                lsum.val = (l2!.val + carry) % 10
                carry = (l2!.val + carry) / 10
                lsum.next = self.addTwoNumbers(nil, l2?.next)
            } else if (l2 == nil) {
                lsum.val = (l1!.val + carry) % 10
                carry = (l1!.val + carry) / 10
                lsum.next = self.addTwoNumbers(l1?.next, nil)
            }
            return lsum
        } else {
            if carry > 0 {
                let lsum = ListNode.init(carry)
                return lsum
            } else {
                return nil
            }
        }
    }
    
    func po(_ l1: ListNode?) {
        print("\(l1!.val)")
        if l1?.next != nil {
            self.po(l1?.next)
        }
    }
}




