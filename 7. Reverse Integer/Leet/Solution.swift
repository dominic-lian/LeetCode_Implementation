//
//  Solution.swift
//  Leet
//
//  Created by dominic_lian on 2018/4/1.
//  Copyright © 2018年 dominic_lian. All rights reserved.
//


class Solution {
    func reverse(_ x: Int) -> Int {
        var i = x
        var j = 0
        
        while i != 0  {
            let max = Int32.max
            if (abs(j) > (max / 10)) {
                return 0;
            }
            j = j * 10 + i % 10
            i = i / 10
        }
        
        return j
    }
}


