// Title: Rotate Array
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/rotate-array/

class Solution {
    public void rotate(int[] nums, int k) {
        int[] r=new int [nums.length];
        for(int i=0;i<nums.length;i++)
        {
            r[(i + k) % nums.length] = nums[i];
        }
        for(int i=0; i<nums.length; i++)
        {
            nums[i]=r[i];
        }
    }
}
