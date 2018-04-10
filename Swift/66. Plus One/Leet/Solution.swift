//
//  Solution.swift
//  Leet
//
//  Created by dominic_lian on 2018/4/1.
//  Copyright © 2018年 dominic_lian. All rights reserved.
//


class Solution {
    func plusOne(_ digits: [Int]) -> [Int] {
        var result: Array<Int> = []
        
        var carry = 0
        
        for i in 0..<digits.count {
            result.insert((digits[digits.count - i - 1] + carry + (i == 0 ? 1 : 0)) % 10, at: 0)
            carry = (digits[digits.count - i - 1] + carry + (i == 0 ? 1 : 0)) / 10
        }
        
        if carry > 0 {
            result.insert(carry, at: 0)
        }
        
        return result
        
    }
}


