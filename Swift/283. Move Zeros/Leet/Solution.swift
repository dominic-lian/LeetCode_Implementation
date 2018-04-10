//
//  Solution.swift
//  Leet
//
//  Created by dominic_lian on 2018/4/1.
//  Copyright © 2018年 dominic_lian. All rights reserved.
//


class Solution {
    func moveZeroes(_ nums: inout [Int]) {
        var pointer = 0
        
        for i in 0..<nums.count {
            if (nums[i] != 0) {
                let swap = nums[i]
                nums[i] = nums[pointer]
                nums[pointer] = swap

                pointer += 1
            }
        }
    }
}






