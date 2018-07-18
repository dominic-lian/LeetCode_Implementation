//
//  Solution.swift
//  Leet
//
//  Created by dominic_lian on 2018/4/1.
//  Copyright © 2018年 dominic_lian. All rights reserved.
//


class Solution {
    func rotate(_ matrix: inout [[Int]]) {
        
        matrix = matrix.reversed()
        
        for i in 0 ..< matrix.count {
            for j in i ..< matrix.count {
                let k = matrix[i][j]
                matrix[i][j] = matrix[j][i]
                matrix[j][i] = k
            }
        }
    }
}
