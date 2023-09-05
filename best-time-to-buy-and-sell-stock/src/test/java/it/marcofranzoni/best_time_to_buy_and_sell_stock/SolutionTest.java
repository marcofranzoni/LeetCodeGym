package it.marcofranzoni.best_time_to_buy_and_sell_stock;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

	private final Solution bestTimeToBuyAndSellStock = new Solution();

	@Test
	public void buyOnDay2SellOnDay5() {
		int[] prices = new int[]{7, 1, 5, 3, 6, 4};
		int maxProfit = bestTimeToBuyAndSellStock.maxProfit(prices);

		Assertions.assertEquals(5, maxProfit);
	}

	@Test
	public void noTransaction() {
		int[] prices = new int[]{7, 6, 4, 3, 1};
		int maxProfit = bestTimeToBuyAndSellStock.maxProfit(prices);

		Assertions.assertEquals(0, maxProfit);
	}

	@Test
	public void buyAndSell() {
		int[] prices = new int[]{1, 2};
		int maxProfit = bestTimeToBuyAndSellStock.maxProfit(prices);

		Assertions.assertEquals(1, maxProfit);
	}

	@Test
	public void oneTransaction() {
		int[] prices = new int[]{1};
		int maxProfit = bestTimeToBuyAndSellStock.maxProfit(prices);

		Assertions.assertEquals(0, maxProfit);
	}

	@Test
	public void sellInTheMiddle() {
		int[] prices = new int[]{2,4,1};
		int maxProfit = bestTimeToBuyAndSellStock.maxProfit(prices);

		Assertions.assertEquals(2, maxProfit);
	}

	@Test
	public void twoPossibleSells() {
		int[] prices = new int[]{3,2,6,5,0,3};
		int maxProfit = bestTimeToBuyAndSellStock.maxProfit(prices);

		Assertions.assertEquals(4, maxProfit);
	}
}
