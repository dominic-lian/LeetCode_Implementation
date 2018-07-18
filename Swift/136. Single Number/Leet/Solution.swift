//
//  Solution.swift
//  Leet
//
//  Created by dominic_lian on 2018/4/1.
//  Copyright © 2018年 dominic_lian. All rights reserved.
//


class Solution {
    func singleNumber(_ nums: [Int]) -> Int {
        
        var n = nums[0]
        
        for i in 1 ..< nums.count {
            n = n ^ nums[i]
        }
        
        return n
        
    }
}
