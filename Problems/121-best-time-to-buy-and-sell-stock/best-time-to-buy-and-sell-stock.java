class Solution
{
    public int maxProfit(int[] prices)
    {
        if(prices.length <= 1)
            return 0;
        int buy = 0, sell = 0, profit, maxProfit = 0;
        while(sell < prices.length)
        {
            if(prices[sell] > prices[buy])
            {
                profit = profit(prices, sell, buy);
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
    public int profit(int[] prices, int sell, int buy)
    {
        return prices[sell] - prices[buy];
    }
}