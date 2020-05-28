package com.mujeeb;

import java.util.HashMap;
import java.util.Map;

public class NimGame {

	
	public static Map<Float, Boolean> aMap= new HashMap<Float, Boolean>(); 
	public static Map<Float, Boolean> bMap= new HashMap<Float, Boolean>();
	public static void main(String[] args) {
		for (int n = 1; n < 100; n++) {
			 //int n=1999;
			//System.out.println(n);
			System.out.println("n = " + n + "   Player A wins :" + canWinNimPlayerA(n));
		}
			 //System.out.println("n = " + n + "   Player A wins :" + canWinNim(n));
				//}
	}
	//Actual answer
	public static boolean canWinNim(int n) {
	    return (n % 4 != 0);
	}

	public static boolean canWinNimPlayerA(float n) {
		if (aMap.containsKey(n)) {
			return aMap.get(n);
		}
		if (n == 1 || n == 2 || n == 3) {
			aMap.put(n, true);
			return true;
		} else if (n == 4) {
			aMap.put(n, false);
			return false;
		} else {
			boolean result = !canWinNimPlayerB(n - 1) || !canWinNimPlayerB(n - 2) || !canWinNimPlayerB(n - 3);
			aMap.put(n, result);
			return result;
		}
	}

	public static boolean canWinNimPlayerB(float n) {
		if (bMap.containsKey(n)) {
			return bMap.get(n);
		}
		if (n == 1 || n == 2 || n == 3) {
			bMap.put(n, true);
			return true;
		} else if (n == 4) {
			bMap.put(n, false);
			return false;
		} else {
			boolean result = !canWinNimPlayerA(n - 1) || !canWinNimPlayerA(n - 2) || !canWinNimPlayerA(n - 3);
			bMap.put(n, result);
			return result;
		}
	}
}
