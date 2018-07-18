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
        
        for _ in 0..<n {
            self.rotateOne(&nums)
            print("\(nums)")
        }
    }
    
    func rotateOne(_ nums: inout [Int]) {
        let num = nums[nums.count - 1]
        for j in (0...(nums.count - 1)).reversed() {
            if j > 0 {
                nums[j] = nums[j-1]
            } else {
                nums[j] = num
            }
            
        }
    }
}





