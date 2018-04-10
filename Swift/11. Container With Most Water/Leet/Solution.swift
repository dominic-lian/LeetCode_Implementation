//
//  Solution.swift
//  Leet
//
//  Created by dominic_lian on 2018/4/1.
//  Copyright © 2018年 dominic_lian. All rights reserved.
//


//https://segmentfault.com/a/1190000008824222

class Solution {
    func maxArea(_ height: [Int]) -> Int {
        var max = 0
        if height.count < 2 {
            return 0
        }
        
        var i = 0
        
        var j = height.count - 1
        
        while i < j {
            let area = (j-i) * min(height[i], height[j])
            max = (max > area ? max : area)
            
            if height[i] < height[j] {
                i += 1
            } else {
                j -= 1
            }
        }
        
        return max
    }
}



