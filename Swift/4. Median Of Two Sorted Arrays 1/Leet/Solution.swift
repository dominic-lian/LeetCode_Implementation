//
//  Solution.swift
//  Leet
//
//  Created by dominic_lian on 2018/4/1.
//  Copyright © 2018年 dominic_lian. All rights reserved.
//


class Solution {
    func findMedianSortedArrays(_ nums1: [Int], _ nums2: [Int]) -> Double {
        let m = nums1.count
        let n = nums2.count
        
        let sortedArray = (nums1 + nums2).sorted()
        
        if (m+n)%2 == 1 {
            return Double(sortedArray[(m+n+1)/2 - 1])
        } else {
            return Double(sortedArray[(m+n)/2 - 1] + sortedArray[(m+n)/2]) / 2
        }
    }
}




