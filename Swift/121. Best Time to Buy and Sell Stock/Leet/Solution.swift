//
//  Solution.swift
//  Leet
//
//  Created by dominic_lian on 2018/4/1.
//  Copyright © 2018年 dominic_lian. All rights reserved.
//

//https://blog.csdn.net/chenvast/article/details/78950392

class Solution {
    func maxProfit(_ prices: [Int]) -> Int {
        if prices.count < 2 {
            return 0
        }
        
        var diffArray = [Int]()
        
        for i in 0 ..< prices.count - 1 {
            diffArray.append((prices[i + 1] - prices[i]))
        }
        
        var max = 0
        var profit = 0
        
        for i in diffArray {
            if profit + i > 0 {
                profit += i
            } else {
                profit = 0
            }
            
            max = profit > max ? profit : max
        }
        
        return max
    }
}
