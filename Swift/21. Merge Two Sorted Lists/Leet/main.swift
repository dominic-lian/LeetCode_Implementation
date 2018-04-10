//
//  main.swift
//  Leet
//
//  Created by dominic_lian on 2018/4/9.
//  Copyright © 2018年 dominic_lian. All rights reserved.
//



let node11 = ListNode.init(1)
let node12 = ListNode.init(2)
let node13 = ListNode.init(4)

let node21 = ListNode.init(1)
let node22 = ListNode.init(3)
let node23 = ListNode.init(4)

node11.next = node12
node12.next = node13

node21.next = node22
node22.next = node23

func po(_ l1: ListNode?) {
    if l1 != nil {
        print("\(l1!.val)")
        if l1?.next != nil {
            po(l1?.next)
        }
    }
}

let solution = Solution.init()

solution.mergeTwoLists(node11, node21)

po(node11)

