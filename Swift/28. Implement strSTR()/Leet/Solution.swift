//
//  Solution.swift
//  Leet
//
//  Created by dominic_lian on 2018/4/1.
//  Copyright © 2018年 dominic_lian. All rights reserved.
//


import Foundation

class Solution {
    func strStr(_ haystack: String, _ needle: String) -> Int {
        
        if needle == "" {
            return 0
        }
        
        if let range = haystack.range(of: needle) {
            let first = haystack.index(haystack.startIndex, offsetBy: 0)...haystack.index(range.lowerBound, offsetBy: 0)
            let string = String.init(haystack[first])
            return string.count - 1
        } else {
            return -1
        }
    }
}


