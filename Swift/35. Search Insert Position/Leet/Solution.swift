//
//  Solution.swift
//  Leet
//
//  Created by dominic_lian on 2018/4/1.
//  Copyright © 2018年 dominic_lian. All rights reserved.
//


class Solution {
    func searchInsert(_ nums: [Int], _ target: Int) -> Int {
        if nums.count == 0 {
            return 0
        }
        var lowerBound = 0
        var upperBound = nums.count - 1
        while lowerBound <= upperBound {
            let midIndex = lowerBound + (upperBound - lowerBound) / 2
            
            if nums[midIndex] == target {
                return midIndex
            } else if nums[midIndex] < target {
                lowerBound = midIndex + 1
            } else {
                upperBound = midIndex - 1
            }
        }
        return lowerBound
    }
}






