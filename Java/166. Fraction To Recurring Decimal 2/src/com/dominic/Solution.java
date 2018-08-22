package com.dominic;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public String fractionToDecimal(int n,int d) {
        return this.fractionToDecimal0(n, d);
    }

    String fractionToDecimal0(long n,long d) {

        if (n==0) return "0";

        StringBuilder result = new StringBuilder();

        if (n<0) {
            n = -n;
            d = -d;
        }

        if (d<0) {
            result.append('-');
            d = -d;
        }
        result.append(n/d);
        n %= d;

        if (n != 0) {
            result.append('.');
            Map<Integer,Integer> rems = new HashMap<Integer,Integer>();

            while (n!=0) {
                Integer p = rems.get((int)n);

                if (p==null) {
                    rems.put((int)n,result.length());
                    n*=10;
                    result.append(n/d);
                    n%=d;

                } else {
                    result.insert(p.intValue(), '(');
                    result.append(')');
                    break;
                }
            }
        }
        return result.toString();
    }

}