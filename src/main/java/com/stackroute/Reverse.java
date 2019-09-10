package com.stackroute;

public class Reverse {

    public int reverse(int n){
        int rev = 0;
        int remainder;
        int orig;
        orig = n;


        while (n!= 0){
            remainder = n% 10;
            rev = rev * 10 + remainder;
            n = n/10;
        }
        return rev;
    }
}
