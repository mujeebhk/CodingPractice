package com.example.demo.instance;

public class WeightedInstance extends Instance {


	public WeightedInstance(String name, String port, String hostname) {
		super(name, port, hostname);
	}
	private int weight;
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
}
