//
//  Solution.swift
//  Leet
//
//  Created by dominic_lian on 2018/4/1.
//  Copyright © 2018年 dominic_lian. All rights reserved.
//


class Solution {
    func lengthOfLongestSubstring(_ s: String) -> Int {
        var array: Array<Int> = []
        var len = 0
        var res = 0
        
        for character in s {
            if array.contains(character.hashValue) {
                array.removeSubrange(0...array.index(of: character.hashValue)!)
                len = array.count + 1
                res = max(res, len)
                array.append(character.hashValue)
                continue
            }
            
            array.append(character.hashValue)
            len = len + 1
            res = max(res, len)
        }
        
        return res
    }
}



