package com.mujeeb;

public class HouseThief {

	public static final int[] HOUSE_VALUE = {6,7,1,30,8,2,4, 2,5,2,5,7,43,11,4,6,2};
	public static void main(String[] arg) 
	{
		System.out.println(maxvalue(0, HOUSE_VALUE.length-1));
		
	}
	
	public static int maxvalue(int startIndex, int endIndex) {
		if (startIndex == endIndex) {
			return HOUSE_VALUE[startIndex];
		}
		if  (startIndex > endIndex) {
			return 0;
		}
		int result1 = HOUSE_VALUE[startIndex] + maxvalue(startIndex+2, endIndex);
		int result2 = maxvalue(startIndex+1, endIndex);
		
		return max(result1, result2);
	}
	public static int max(int a, int b) {
		if (a>b) 
			return a;
		return b;
	}
}

