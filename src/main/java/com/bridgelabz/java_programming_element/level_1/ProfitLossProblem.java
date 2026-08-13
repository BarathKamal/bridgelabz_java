package com.bridgelabz.java_programming_element.level_1;

public class ProfitLossProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int selling_price = 191;
		int cost_price = 129;
		if (selling_price >= cost_price) {
			int profit = selling_price - cost_price;
			double profit_percent = ((double) profit/cost_price) * 100;
			System.out.println("Cost Price: " + cost_price + ", Selling Price: " + selling_price + "\nProfit: " + profit +", Profit percentage: " + String.format("%.2f", profit_percent));
		}
		else {
			int loss = cost_price - selling_price;
			double loss_percent = ((double) loss/cost_price) * 100;
			System.out.println("Cost Price: " + cost_price + ", Selling Price: " + selling_price + "\nLoss: " + loss +", Loss percentage: " + String.format("%.2f", loss_percent));
		}

	}

}
