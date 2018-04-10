//
//  Solution.swift
//  Leet
//
//  Created by dominic_lian on 2018/4/1.
//  Copyright © 2018年 dominic_lian. All rights reserved.
//


class Solution {
    func merge(_ nums1: inout [Int], _ m: Int, _ nums2: [Int], _ n: Int) {
        if nums1.count == 0 || nums2.count == 0 {
            return
        }
        
        var idx1 = m - 1
        var idx2 = n - 1
        var len = m + n - 1
        
        while idx1 >= 0 && idx2 >= 0 {
            if (nums1[idx1] >= nums2[idx2]) {
                nums1[len] = nums1[idx1]
                len -= 1
                idx1 -= 1
            } else {
                nums1[len] = nums2[idx2]
                len -= 1
                idx2 -= 1
            }
        }
        
        while idx2 >= 0 {
            nums1[len] = nums2[idx2]
            len -= 1
            idx2 -= 1
        }
    }
}

