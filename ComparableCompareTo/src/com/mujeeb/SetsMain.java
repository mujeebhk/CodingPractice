package com.mujeeb;

import java.util.HashSet;
import java.util.Set;

public class SetsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Model a = new Model("Mujeeb", 33);
		Model b = new Model("Ashrin", 31);
		Model c = new Model("Inaaya", 1);
		Model d = new Model("Majid",33);
		Model e = new Model("Majid",33);
		
		
		Set<Model> col = new HashSet<Model>();
		col.add(a);
		col.add(b);
		col.add(c);
		col.add(d);
		col.add(e);
		
		for (Model item: col) {
			System.out.println(item.getName());
		}
	}

}
