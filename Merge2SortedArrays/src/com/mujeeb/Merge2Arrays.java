package com.mujeeb;

import java.util.LinkedList;
import java.util.List;

public class Merge2Arrays {

	public static void main(String[] args, String[] args2) {
		int m = 3;
		int n = 2;
		
		int[] list1 = {1,3,5};
		int[] list2 = {2,4};
		
		int pointer1 = 0, pointer2 = 0;
		for (int i=0; i<m+n; i++) {
			if (list1[pointer1] < list2[pointer2]) {
				pointer1++;
			} else {
				int temp = list2[pointer2];
				list2[pointer2] = list1[pointer1];
				list1[pointer1] = temp;
				pointer1++;
				
			}
		}
		
		
	}
}
