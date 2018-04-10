//
//  Solution.swift
//  Leet
//
//  Created by dominic_lian on 2018/4/1.
//  Copyright © 2018年 dominic_lian. All rights reserved.
//


class Solution {
    func isPalindrome(_ x: Int) -> Bool {
        
        if x < 0 {
            return false
        }
        
        var i = x
        var j = 0
        let max = Int32.max
        
        while i != 0  {
            if (abs(j) > (max / 10)) {
                return false
            }
            j = j * 10 + i % 10
            i = i / 10
        }
        
        if j == x {
            return true
        } else {
            return false
        }
    }
}

