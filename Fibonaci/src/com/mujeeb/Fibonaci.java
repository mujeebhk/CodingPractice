package com.mujeeb;

import java.util.HashMap;
import java.util.Map;

public class Fibonaci {

	public static Map<Integer, Long> STORE = new HashMap<Integer, Long> ();
	public static void main(String[] args) {

		int num = 100;
		System.out.println(fib2(60));
		//System.out.println(fib2(60));
		//fib(num);
		/*
		 * for (int i=2;i<num;i++) { System.out.println(STORE.get(i)); }
		 */
	}

	public static Long fib(int a) {
		if (a == 0 ) {
			return 0l;
		} else if (a==1) {
			return 1l;
		}
		Long minus1 = 0l;
		Long minus2 = 0l;
		if (STORE.containsKey(a-1)) {
			minus1 = STORE.get(a-1);
		} else {
			minus1 = fib(a-1);
			//STORE.put(a-1, minus1);
		}
		if (STORE.containsKey(a-2)) {
			minus2 = STORE.get(a-2);
		} else {
			minus2 = fib(a-2);
			//STORE.put(a-2, minus2);
		}
		long result = minus1+minus2;
		STORE.put(a, result);
		return result;
	}
	
	public static Long fib2 (int a ) {
		if (a == 0 ) {
			return 0l;
		} else if (a==1) {
			return 1l;
		}
		return fib2(a-1) + fib2(a-2);
	}
}
