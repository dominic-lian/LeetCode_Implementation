//
//  main.swift
//  Leet
//
//  Created by dominic_lian on 2018/4/9.
//  Copyright © 2018年 dominic_lian. All rights reserved.
//


let listNode01 = ListNode.init(2)
let listNode02 = ListNode.init(4)
let listNode03 = ListNode.init(3)

listNode01.next = listNode02
listNode02.next = listNode03

let listNode11 = ListNode.init(5)
let listNode12 = ListNode.init(6)
let listNode13 = ListNode.init(6)
let listNode14 = ListNode.init(2)
let listNode15 = ListNode.init(1)

listNode11.next = listNode12
listNode12.next = listNode13
listNode13.next = listNode14
listNode14.next = listNode15

let solution = Solution.init()

let lsum = solution.addTwoNumbers(listNode01, listNode11)

solution.po(lsum)


