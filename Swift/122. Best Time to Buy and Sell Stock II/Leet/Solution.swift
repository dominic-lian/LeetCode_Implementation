//
//  Solution.swift
//  Leet
//
//  Created by dominic_lian on 2018/4/1.
//  Copyright © 2018年 dominic_lian. All rights reserved.
//

class Solution {
    func maxProfit(_ prices: [Int]) -> Int {
        if prices.count < 2 {
            return 0
        }
        
        var max = 0
        
        for i in 0 ..< (prices.count - 1) {
            let profit = prices[i+1] - prices[i]
            if profit > 0 {
                max += profit
            }
        }
        
        return max
    }
}






