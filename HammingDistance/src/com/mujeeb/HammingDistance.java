package com.mujeeb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HammingDistance {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String name = br.readLine();                // Reading input from STDIN
	        //System.out.println("Hi, " + name + "."); 
	           // Writing output to STDOUT
	        int t = Integer.parseInt(name);
	        //Scanner
	        
	        //for (int i=0; i<t; i++) {
	            //Scanner s = new Scanner(System.in);
	            String temp = br.readLine();   
	            String x[] = temp.split(" ");
	            int n[] = new int[x.length];
	            for (int i=0; i<x.length; i++) {
	            	n[i] = Integer.parseInt(x[i]);
	            }
	            
	        //}
	        
	        for (int i =0 ; i<t;i++) {
	        	for (int j=1; j<=n[i]; j++) {
	        		if (j%3 == 0 && j%5 ==0) {
	        			System.out.println("FizzBuzz");
	        		} else if (j%3 == 0) {
	        			System.out.println("Fizz");
	        		} else if (j%5 == 0) {
	        			System.out.println("Buzz");
	        		} else {
	        			System.out.println(j);
	        		}
	        	}
	        	
	        }
	        
	}

}
