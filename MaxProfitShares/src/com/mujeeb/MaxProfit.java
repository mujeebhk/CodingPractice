package com.mujeeb;

public class MaxProfit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int price[] = { 100,2,5,4,5}; 
int n = price.length; 

System.out.print(maxProfit(price, false, 0, 0)); 

	}

	static int profit = 0; 
	
	static int maxProfit( int[] price, boolean bought, int boughtAt, int currentPointer) {
		
		if (currentPointer == price.length -1) {
			if (!bought) {
				return 0;
			} else {
				return price[currentPointer] - boughtAt;
			}
		}
		//Buy
		int buyProfit =0, sellProfit=0, doNothingProfit = 0;
		if (!bought) {
			boughtAt = price[currentPointer];

			buyProfit = maxProfit(price, true, boughtAt, currentPointer+1);
		}
		//Sell
		else {
			sellProfit = (price[currentPointer]-boughtAt) +maxProfit(price, false, 0, currentPointer+1);
		}
		
		
		
		//Do nothing
		doNothingProfit = maxProfit(price, bought, boughtAt, currentPointer+1);
		
		int temp = Integer.max(buyProfit, sellProfit) ;
		return Integer.max(temp, doNothingProfit);
		
	}
}
