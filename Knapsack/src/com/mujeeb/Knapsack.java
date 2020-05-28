package com.mujeeb;

public class Knapsack {

	
	public static final int[] profit = {31,26,72,17};
	public static final int[] weights = {3,1,5,2};
	public static final int knapsacksize = 1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(profit(knapsacksize,0));
	}

	public static int profit (int size, int index) {
		if (index >= profit.length)
			return 0;
		int a = profit[index]+profit (size-weights[index], index+1);
		int b = profit (size, index+1);
		
		if (a>b) 
			return a;
		return b;
	}
}
