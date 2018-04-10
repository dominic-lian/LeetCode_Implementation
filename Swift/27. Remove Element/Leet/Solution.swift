//
//  Solution.swift
//  Leet
//
//  Created by dominic_lian on 2018/4/1.
//  Copyright © 2018年 dominic_lian. All rights reserved.
//


class Solution {
    func removeElement(_ nums: inout [Int], _ val: Int) -> Int {
        if nums.count == 0 {
            return 0
        }
        
        var count = 0
        
        for i in 0..<nums.count {
            if nums[i] != val {
                nums[count] = nums[i]
                count += 1
            }
        }
        
        
        return count
    }
}






