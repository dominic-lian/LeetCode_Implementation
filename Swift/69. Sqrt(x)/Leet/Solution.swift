//
//  Solution.swift
//  Leet
//
//  Created by dominic_lian on 2018/4/1.
//  Copyright © 2018年 dominic_lian. All rights reserved.
//

import Foundation


class Solution {
    func mySqrt(_ x: Int) -> Int {
        if x == 0 {
            return 0
        }
        
        if x < 3 {
            return 1
        }
        
        var num = x
        var power = 0
        
        while num > 1 {
            num /= 2
            power += 1
        }
        
        var low = 1
        let halfPower = (power+1) / 2
        
        while power > halfPower {
            low *= 2
            power -= 1
        }
        
        for i in low..<low*2 {
            if (i * i) <= x && ((i + 1) * (i + 1) > x) {
                return i
            }
        }
        
        return 0
    }
}


