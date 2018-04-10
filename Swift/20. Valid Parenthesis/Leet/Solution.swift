//
//  Solution.swift
//  Leet
//
//  Created by dominic_lian on 2018/4/1.
//  Copyright © 2018年 dominic_lian. All rights reserved.
//


class Solution {
    func isValid(_ s: String) -> Bool {
        var leftParenthesis: [Character] = []
        
        var leftNum = 0
        var rightNum = 0
        
        
        for character in s {
            switch character {
            case "{", "[", "(":
                leftParenthesis.append(character)
                leftNum += 1
            case "}":
                if leftParenthesis.last == "{" {
                    leftParenthesis.removeLast()
                }
                rightNum += 1
            case "]":
                if leftParenthesis.last == "[" {
                    leftParenthesis.removeLast()
                }
                rightNum += 1
            case ")":
                if leftParenthesis.last == "(" {
                    leftParenthesis.removeLast()
                }
                rightNum += 1
            default:
                break
            }
        }
        
        if leftParenthesis.count == 0 && leftNum == rightNum {
            return true
        } else {
            return false
        }
        
    }
}






