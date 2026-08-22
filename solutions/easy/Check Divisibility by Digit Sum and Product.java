// Title: Check Divisibility by Digit Sum and Product
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/check-divisibility-by-digit-sum-and-product/

            int digit = n % 10;

            sum = sum + digit;
            product = product * digit;
            n = n / 10;
        }

        int result = sum + product;
        if (original % result == 0) {
            return true;
        }
        return false;
         {
         while (n > 0) 
        int product=1;
        int sum=0;
        int original=n;
    public boolean checkDivisibility(int n) {
class Solution {
