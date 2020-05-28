package com.mujeeb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Model a = new Model("AAMujeeb", 33);
		Model b = new Model("Ashrin", 31);
		Model c = new Model("Inaaya", 1);
		Model d = new Model("Majid",33);
		
		
		List<Model> col = new ArrayList<Model>();
		col.add(a);
		col.add(b);
		col.add(c);
		col.add(d);
		Collections.sort(col);
		printColelction(col);
		System.out.println();
		Collections.sort(col, new Comparator<Model>() {

			@Override
			public int compare(Model o1, Model o2) {
				// TODO Auto-generated method stub
				return o1.getAge() - o2.getAge();
			}
		});
		printColelction(col);
		
		
	}

	private static void printColelction(List<Model> col) {
		Iterator<Model> itr = col.iterator();
		while (itr.hasNext()) {
			Model x = itr.next();
			System.out.println(x.getName());
		}
	}

}
