class Solution
{
    public int maxProfit(int[] prices)
    {
        int buy = 0, sell = 0, profit, maxProfit = 0;
        while(sell < prices.length)
        {
            if(prices[sell] > prices[buy])
            {
                profit = prices[sell] - prices[buy];
                maxProfit = Math.max(profit, maxProfit);
            }
            else
            {
                buy = sell;
            }
            sell ++;
        }
        return maxProfit;
    }
}