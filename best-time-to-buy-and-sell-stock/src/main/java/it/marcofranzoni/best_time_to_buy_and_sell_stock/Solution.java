package it.marcofranzoni.best_time_to_buy_and_sell_stock;

public class Solution {
	public int maxProfit(int[] prices) {

		int buy = prices[0];
		int sell = prices[0];
		int profit = 0;

		for (int i=1; i < prices.length; i++) {
			if (buy > prices[i]) {
				buy = prices[i];
				sell = 0;
			} else if (sell < prices[i]) {
				profit =  Math.max(profit, prices[i] - buy);
			}
		}

		return profit;
	}
}
