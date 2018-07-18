//
//  Solution.swift
//  Leet
//
//  Created by dominic_lian on 2018/4/1.
//  Copyright © 2018年 dominic_lian. All rights reserved.
//


class Solution {
    func rotate(_ nums: inout [Int], _ k: Int) {
        if nums.count == 0 || nums.count == 1 {
            return
        }
        
        let n = k % nums.count
        
        if n == 0 {
            return
        }
        
        self.reverse(&nums, 0, nums.count - 1 - n)
        self.reverse(&nums, nums.count - n, nums.count - 1)
        self.reverse(&nums, 0, nums.count - 1)
    }
    
    func reverse(_ nums: inout [Int], _ start: Int, _ end: Int) {
        for i in 0 ..< (nums.count + 1)/2  {
            if (start + i < end - i) {
                let temp = nums[start + i]
                nums[start + i] = nums[end - i]
                nums[end - i] = temp
            }
        }
    }
}







