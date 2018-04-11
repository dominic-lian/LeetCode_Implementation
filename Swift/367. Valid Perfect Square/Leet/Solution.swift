//
//  Solution.swift
//  Leet
//
//  Created by dominic_lian on 2018/4/1.
//  Copyright © 2018年 dominic_lian. All rights reserved.
//

import Foundation


class Solution {
    func isPerfectSquare(_ num: Int) -> Bool {
        if num == 0 || num == 1 {
            return true;
        }
        
        if num < 3 {
            return false;
        }
        
        var number = num
        var power = 0
        
        while number > 1 {
            number /= 2
            power += 1
        }
        
        var low = 1
        let halfPower = (power+1) / 2
        
        while power > halfPower {
            low *= 2
            power -= 1
        }
        
        for i in low..<low*2 {
            if (i * i) == num {
                return true
            }
        }
        
        return false
    }
}


