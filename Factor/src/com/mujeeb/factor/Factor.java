package com.mujeeb.factor;

public class Factor {

	
	
	public static void main(String[] args) {

		int [] factors = {7,5,3,1};
		int number = 150;
		factorize(number, factors, "");
		
	}
	public static void factorize(int number, int[] factors, String parent) {
		if (number == 0) {
			System.out.println(parent.substring(0, parent.length()-2));
		}
		
		for (int i=0; i< factors.length; i++) {
			if (number >= factors[i])
				factorize(number-factors[i], factors, parent  + factors[i]+ ", ");
		}
	}

}
