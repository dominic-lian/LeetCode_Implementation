//
//  Solution.swift
//  Leet
//
//  Created by dominic_lian on 2018/4/1.
//  Copyright © 2018年 dominic_lian. All rights reserved.
//


class Solution {
    func romanToInt(_ s: String) -> Int {
        
        if s.count == 0 {
            return 0
        }
        
        var sum = 0
        var preNumber = 0
        
        for character in s.reversed() {
            
            let number = self.getIntValue(romanCharacter: character)
            
            if preNumber == 0 {
                preNumber = number
                sum += number
                continue
            }
            
            if preNumber > number {
                sum -= number
            } else {
                sum += number
            }
            
            preNumber = number
            
        }
        return sum
    }
    
    func getIntValue(romanCharacter: Character) -> Int {
        var number = 0
        switch romanCharacter {
        case "I":
            number = 1
        case "V":
            number = 5
        case "X":
            number = 10
        case "L":
            number = 50
        case "C":
            number = 100
        case "D":
            number = 500
        case "M":
            number = 1000
        default:
            number = 0
        }
        
        return number
    }
}




