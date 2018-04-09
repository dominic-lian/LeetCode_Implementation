//
//  Solution.swift
//  Leet
//
//  Created by dominic_lian on 2018/4/1.
//  Copyright © 2018年 dominic_lian. All rights reserved.
//


class Solution {
    
    func addBinary(_ a: String, _ b: String) -> String {
        
        var A = a
        var B = b
        
        let lenA = a.count
        let lenB = b.count
        let lenM = a.count >= b.count ? a.count : b.count
        
        var carry = 0
        
        var answer = ""
        
        for i in 0..<lenM {
            if i < lenA && i < lenB {
                
                let aLast = (A.last! == "1" ? 1 : 0)
                let bLast = (B.last! == "1" ? 1 : 0)
                answer.insert(((aLast + bLast + carry) % 2 == 1 ? "1" : "0") , at: String.Index.init(encodedOffset: 0))
                carry = (aLast + bLast + carry) / 2
                A.remove(at: A.index(before: A.endIndex))
                B.remove(at: B.index(before: B.endIndex))
                
            } else if i >= lenA && i < lenB {
                let bLast = (B.last! == "1" ? 1 : 0)
                answer.insert(((bLast + carry) % 2 == 1 ? "1" : "0") , at: String.Index.init(encodedOffset: 0))
                carry = (bLast + carry) / 2
                B.remove(at: B.index(before: B.endIndex))
            } else if i < lenA && i >= lenB {
                let aLast = (A.last! == "1" ? 1 : 0)
                answer.insert(((aLast + carry) % 2 == 1 ? "1" : "0") , at: String.Index.init(encodedOffset: 0))
                carry = (aLast + carry) / 2
                A.remove(at: A.index(before: A.endIndex))
            }
        }
        
        if carry == 1 {
            answer.insert("1" , at: String.Index.init(encodedOffset: 0))
        }
        
        return answer
    }
}




