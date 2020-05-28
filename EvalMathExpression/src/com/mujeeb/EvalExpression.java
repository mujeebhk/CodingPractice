package com.mujeeb;

import java.util.Stack;

public class EvalExpression {

	private static  Stack<Character> charStack = new Stack<Character>();
	private static  Stack<Integer> intStack = new Stack<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String exp = "3+2*4/2";
		Character[] chArray = new Character[exp.length()]; 
		for(Character item : chArray) {
			if (item == ' ')
				continue;
			else if (Character.isDigit(item)) {
				intStack.push(new Integer(item));
			} else {
				charStack.push(new Character(item));
			}
		}
		System.out.println("Result is :" + eval(exp));
	}

	private static int eval(char exp, int i1, int i2) {
		// TODO Auto-generated method stub
		if (exp == '/') {
			return i1/i2;
		} else if (exp == '*') {
			return i1*i2;
		} else if (exp == '+') {
			return i1+i2;
		} else if (exp == '-') {
			return i1-i2;
		} 
		return 0;
	}

	

}
