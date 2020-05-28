package com.mujeeb;

public class LeetCode1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(checkRecord("LALL"));
	}

	 public static boolean checkRecord(String s) {
	        char[] a = new char[s.length()];
	        s.getChars(0, s.length(), a, 0);
	        
	        int absentCount=0;
	        int late = 0;
	        
	        for (int i =0; i<a.length; i++) {
	        	if(a[i] == 'A') {
	        		late = 0;
	        		absentCount++;
	        		if (absentCount == 2) 
	        			return false;
	        	} else if (a[i] == 'L') {
	        		
	        		if (late == 2)
	        			return false;
	        		late++;
	        	} else {
	        	late = 0;
	        	}
	        }
	        return true;
	    }
}
