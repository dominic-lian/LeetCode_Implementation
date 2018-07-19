//
//  Solution.swift
//  Leet
//
//  Created by dominic_lian on 2018/4/1.
//  Copyright © 2018年 dominic_lian. All rights reserved.
//


class Solution {
    
    var line = Array.init(repeating: false, count: 10)
    
    func isValidSudoku(_ board: [[Character]]) -> Bool {
        
        for i in 0 ..< 9 {
            for j in 0 ..< 9 {
                if (!self.isValidLine(board[i][j])) {
                    return false
                }
            }
            line = Array.init(repeating: false, count: 10)
        }
        
        
        for j in 0 ..< 9 {
            for i in 0 ..< 9 {
                if (!self.isValidLine(board[i][j])) {
                    return false
                }
            }
            line = Array.init(repeating: false, count: 10)
        }
        
        
        for i in 0 ..< 9 {
            for j in 0 ..< 9 {
                if (!self.isValidLine(board[i/3*3+j/3][i%3*3+j%3])) {
                    return false
                }
            }
            line = Array.init(repeating: false, count: 10)
        }
        
        return true
        
    }
    
    func isValidLine(_ char: Character) -> Bool {
        if char == "." {
            return true
        }
        
        let num = Int(String.init(char))!
        
        if num < 0 || num > 9 {
            return false
        }
        
        if line[num] {
            return false
        } else {
            line[num] = true
        }
        
        return true
    }
}


