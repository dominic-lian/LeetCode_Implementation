//
//  Solution.swift
//  Leet
//
//  Created by dominic_lian on 2018/4/1.
//  Copyright © 2018年 dominic_lian. All rights reserved.
//


class Solution {
    func intersect(_ nums1: [Int], _ nums2: [Int]) -> [Int] {
        var l1 = 0, l2 = 0
        var array = [Int]()
        
        let num_1_sorted = nums1.sorted()
        let num_2_sorted = nums2.sorted()
        
        
        while ((l1 < num_1_sorted.count) && (l2 < num_2_sorted.count)) {
            if (num_1_sorted[l1] < num_2_sorted[l2]) {
                l1 += 1
            } else if (num_1_sorted[l1] > num_2_sorted[l2]) {
                l2 += 1
            } else {
                array.append(num_1_sorted[l1])
                l1 += 1
                l2 += 1
            }
        }
        
        return array
    }
}

