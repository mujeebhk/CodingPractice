package com.mujeeb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.ByteBuffer;

public class Test {
	
    public static void main(String[] args) throws IOException {
    	KthLargest obj = new KthLargest(k, nums);
    	int param_1 = obj.add(val);
}

class KthLargest {

    private int k;
    private int[] nums;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.nums = bubbleSort(nums);
    }
    
    public int add(int val) {
        return nums[val];
    }
    
     int[] bubbleSort(int[] heights) {
        for (int i=0; i<heights.length; i++) {
        	int max = 0;
        	for (int j=0; j<heights.length-i-1; j++) {
        		if (heights[j]<heights[j+1]) {
        			int temp = heights[j];
        			heights[j] = heights[j+1];
        			heights[j+1] = temp;
        		}
        	}
        }
        return heights;
    }
}