package com.mujeeb;

public abstract class ToppingDecorator implements Pizza{

	protected Pizza tempPizza;
	
	public ToppingDecorator(Pizza pizza) {
		tempPizza = pizza;
	}

	public  String getDescription() {
		return tempPizza.getDescription();
	}
	public  int getCost() {
		return tempPizza.getCost();
	}
}
