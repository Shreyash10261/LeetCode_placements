// Title: Majority Element
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/majority-element/

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
    }
        int n=nums.length/2;
        return nums[n];
}
