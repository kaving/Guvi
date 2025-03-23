package com.org;

public class stockMarket {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int buyDay = 0;
        int sellDay = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
                buyDay = i+1;
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
                sellDay = i+1;
            }
        }

        System.out.println("Buy on day: " + buyDay + " (price: " + prices[buyDay] + ")");
        System.out.println("Sell on day: " + sellDay + " (price: " + prices[sellDay] + ")");
        System.out.println("Maximum profit: " + maxProfit);
    }
}