package day03;

import java.util.ArrayList;
import java.util.List;

public class Stock {
	private List<Double> stockList = new ArrayList<Double>();

	public List<Double> getStockList() {
		return stockList;
	}

	public Stock(List<Double> stockList) {
		this.stockList = stockList;
	}
//1.23,4.35,0.23,4.0,8.4  -- 8.17
//12.0,2.0,8.0,4.0  -- 6
	public double maxProfit() {
		double maxProfit = 0.0;
		int counter = 0;

		for (counter = 0; counter < stockList.size()-1; counter++) {
			System.out.println("Checking how much profit I make if I sell");
			System.out.println("the stock I bought on day " + (counter+1));
			for (int i = counter; i < stockList.size(); i++) {

				System.out.println("\nI buy stock for: " + stockList.get(counter));
				System.out.println("I sell the stock for: " + stockList.get(i));
				double profit = stockList.get(i) - stockList.get(counter);
				System.out.println("profit = " + profit);
				if (profit > maxProfit) maxProfit = profit;
				System.out.println(" The maximum profit achievable so far: " + maxProfit);
			}
		}
		System.out.println("\nAfter checking all possibilities, we can see that the");
		System.out.println("highest achievable profit would be: " + maxProfit + "\n");

	return maxProfit;
	}
}
