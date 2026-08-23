// Title: Single Number
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/single-number/

       }
        else
        {
            map.put(nums[i], 1);
        }
       for(int num:nums)
       {
        if(map.get(num)==1)
        {
            return num;
        }
       }
       return -1;
    }
}
