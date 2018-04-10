//
//  Solution.swift
//  Leet
//
//  Created by dominic_lian on 2018/4/1.
//  Copyright © 2018年 dominic_lian. All rights reserved.
//


class Solution {
    func threeSum(_ nums: [Int]) -> [[Int]] {
        
        var solutions: Array<Array<Int>> = []
        
        let sortedNums = nums.sorted()
        
        if sortedNums.count >= 3 {
            for i in 0..<sortedNums.count-2 {
                
                if i == 0 || (sortedNums[i] > sortedNums[i - 1]) {
                    var lo = i + 1
                    var ho = sortedNums.count - 1
                    
                    while (lo < ho) {
                        if sortedNums[i] + sortedNums[lo] + sortedNums[ho] == 0 {
                            solutions.append([sortedNums[i], sortedNums[lo], sortedNums[ho]])
                            
                            lo += 1
                            ho -= 1
                            
                            while lo < ho && sortedNums[lo - 1] == sortedNums[lo]  {
                                lo += 1
                            }
                            while lo < ho && sortedNums[ho + 1] == sortedNums[ho]  {
                                ho -= 1
                            }
                        } else if sortedNums[i] + sortedNums[lo] + sortedNums[ho] > 0 {
                            ho -= 1
                        } else {
                            lo += 1
                        }
                        
                    }
                }
                
            }
        }
        
        return solutions
    }
}



