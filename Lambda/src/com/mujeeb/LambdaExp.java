package com.mujeeb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntPredicate;

public class LambdaExp implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*
		 * new Thread (new LambdaExp()).start(); new Thread();
		 * 
		 * 
		 * appendStr res = (s1,s2) -> {return s1+s2;};
		 * 
		 * System.out.println(res.concat("hello", "world"));
		 */
		
		List < Employee> list = new ArrayList<Employee>();
		list.add(new Employee("Mujeeb", 33));
		list.add(new Employee("Ashrin", 31));
		list.add(new Employee("Inaaya", 1));
		list.add(new Employee("Sara", 9));
		Collections.sort(list);
		list.sort(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getAge()-o2.getAge();
			}
		});
		
		list.forEach(employee -> {
			System.out.print("Name is :" + employee.getName());
			System.out.println("Age is :" + employee.getAge());
		});
		
		IntPredicate intPred = i -> i>25;
		
		if (intPred.test(20)) {
			System.out.println(" Greater");
		}
		
		Function (Employee, String)
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello ");
	}

	interface appendStr  {
		public String concat (String s1, String s2);
	}
}
