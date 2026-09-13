// Title: Best Time to Buy and Sell Stock
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

            if(prices[i]<min)
            {
                min=prices[i];
            }
            if(prices[i]-min>p)
            {
                p=prices[i]-min;
            }
    }
    return p;
        {
        for (int i = 1; i < prices.length; i++) 
        int min=prices[0];
        int p = 0;
    public int maxProfit(int[] prices) {

