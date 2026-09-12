// Title: Sum of Square Numbers
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/sum-of-square-numbers/


        for(long a = 0; a * a <= c; a++)
        {
            long b = (long)Math.sqrt(c - a * a);

            if(a * a + b * b == c)
            {
                return true;
            }
        }

        return false;
    public boolean judgeSquareSum(int c) {

class Solution {
