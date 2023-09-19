# 121. Best Time to Buy and Sell Stock

You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to
sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

## Constraints

1. 1 <= prices.length <= 10<sup>5</sup>
2. 0 <= prices[i] <= 10<sup>4</sup>

## Notes

The first solution found

```
for(int i=0;i<prices.length;i++){
	for(int j=i+1;j<prices.length;j++){
		if(prices[j]-prices[i]>profit){
		    profit=prices[j]-prices[i];
		}
	}
}
```

This approach is not efficient due to the nested loop structure that leads to a O(n<sup>2</sup>) complexity. Given that
the prices length could be up to 10<sup>5</sup>, this algorithm becomes impractical for timely computation.

The final solution takes a different approach.
It loops just once into the input array.
The buy and sell price is initialized with the first element of the array
When the current price (`prices[i]`) is less than the smaller price, the current price becomes the smaller buy price.
It is important to reset the sell price, because the greater sell price could be encountered previously the current
price.
Instead, if the current price is greater than the previous sell price, the profit is updated with the greatest number
between the previous profit and the current one.

This approach significantly improves efficiency,
making it suitable for larger datasets.