//
//  Solution.swift
//  Leet
//
//  Created by dominic_lian on 2018/4/1.
//  Copyright © 2018年 dominic_lian. All rights reserved.
//

import Foundation

class Solution {
    func myPow(_ x: Double, _ n: Int) -> Double {
        if n == 0 && x != 0 {
            return 1
        } else if x == 0 {
            return 0
        } else {
            let half = myPow(x, n / 2)
            
            if (n % 2 == 0) {
                return half * half
            } else if (n > 0) {
                return half * half * x
            } else {
                return half * half / x
            }
        }
    }
}


