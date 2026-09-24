// Title: Majority Element
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/majority-element/

        int n=nums.length;
        HashMap<Integer, Integer> map=new HashMap<>();
    public int majorityElement(int[] nums) {
class Solution {
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i], map.get(nums[i])+1);
            }
            else
            {
                map.put(nums[i], 1);
            }
        }
        for(int key:map.keySet())
        {
            if(map.get(key)>n/2)
            {
                return key;
            }
