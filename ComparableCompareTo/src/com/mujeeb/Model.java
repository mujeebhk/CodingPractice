package com.mujeeb;

public class Model implements Comparable<Model>{

	private String name;
	private int age;
	public Model(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Model o) {
		// TODO Auto-generated method stub
		return this.name.compareTo( o.name);
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (this == obj) {
			return true;
		}
		if (obj instanceof Model) {
			return this.getName().equals(((Model) obj).getName());
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.getName().hashCode() + 57 ;
	}
}
