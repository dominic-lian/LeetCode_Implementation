//
//  Solution.swift
//  Leet
//
//  Created by dominic_lian on 2018/4/1.
//  Copyright © 2018年 dominic_lian. All rights reserved.
//


class Solution {
    func removeDuplicates(_ nums: inout [Int]) -> Int {
        if nums.count == 0 {
            return 0
        }
        
        var count = 0
        
        for i in 0..<nums.count {
            if nums[i] != nums[count] {
                count += 1
                nums[count] = nums[i]
            }
        }
        
        return count + 1
    }
}







