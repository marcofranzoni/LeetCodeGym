# 121. Best Time to Buy and Sell Stock
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

## Constraints
1. 1 <= prices.length <= 10<sup>5</sup>
2. 0 <= prices[i] <= 10<sup>4</sup>

## Notes
The first solution found
```java
for (int i=0; i < prices.length; i++) {
    for (int j=i+1; j < prices.length; j++) {
        if (prices[j] - prices[i] > profit) {
            profit = prices[j] - prices[i];
        }
    }
}
```


is not working properly due to the nested loop that leads to a O(n<sup>2</sup>) complexity.