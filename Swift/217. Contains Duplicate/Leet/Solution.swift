//
//  Solution.swift
//  Leet
//
//  Created by dominic_lian on 2018/4/1.
//  Copyright © 2018年 dominic_lian. All rights reserved.
//


class Solution {
    func containsDuplicate(_ nums: [Int]) -> Bool {
        
        if nums.count < 2 {
            return false
        }
        
        let numsSorted = nums.sorted()
        
        for i in 0 ..< numsSorted.count - 1 {
            if numsSorted[i] == numsSorted[i+1] {
                return true
            }
        }
        
        return false
        
    }
}




