//
//  Solution.swift
//  Leet
//
//  Created by dominic_lian on 2018/4/1.
//  Copyright © 2018年 dominic_lian. All rights reserved.
//


class Solution {
    func longestCommonPrefix(_ strs: [String]) -> String {
        
        if strs.count == 0 {
            return ""
        }
        
        var prefix = strs[0]
        
        for i in 1..<strs.count {
            while !(strs[i].hasPrefix(prefix)) {
                prefix = String(prefix.prefix(prefix.count - 1))
            }
        }
        
        return prefix
    }
}







