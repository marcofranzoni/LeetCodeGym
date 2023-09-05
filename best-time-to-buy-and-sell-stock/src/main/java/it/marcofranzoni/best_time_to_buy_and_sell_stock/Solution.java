package it.marcofranzoni.best_time_to_buy_and_sell_stock;

public class Solution {
	public int maxProfit(int[] prices) {

		int profit = 0;

		for (int i=0; i < prices.length; i++) {
			for (int j=i+1; j < prices.length; j++) {
				if (prices[j] - prices[i] > profit) {
					profit = prices[j] - prices[i];
				}
			}
		}

		return profit;
	}
}
