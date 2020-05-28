package com.mujeeb;

public class ConvertString {

	public static final String str1 = "catch";
	public static final String str2 = "catchzzzzz";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convert(str1,str2));
		
	}

	private static int convert(String a, String b) {
		// TODO Auto-generated method stub
		int i = 0;
		if(b.equals("") && !a.equals(""))
			return 1000;
		
		while (i<a.length() &&
				i<b.length() &&
				a.charAt(i) == b.charAt(i)) {
			i++;
		}
		a = a.substring(i);
		b = b.substring(i);
		
		if (a.equals(b)) {
			return 0;
		}
		int del = 1000;
		int rep = 1000;
		int ins = 1000;
		//System.out.println(a+ "  " +b+"  ");
		if (!b.equals("")) {
			del = 1+ convert(a, b.substring(1));
			
		}
		if(!a.equals("") && !b.equals("")) {
			rep = 1+ convert(a, a.charAt(0) + b.substring(1));
		 
		 ins = 1+ convert(a, a.charAt(0)+b);
		 
		}
		
		return min(del,ins,rep);
	}
	public static int min(int a, int b, int c) {
		if (a<b && a<c)
			return a;
		else if (b<a && b<c)
			return b;
		return c;
	}

}
