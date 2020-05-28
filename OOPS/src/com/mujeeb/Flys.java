package com.mujeeb;

public abstract class Flys {

	public abstract String itFlys();
}

class ItFlys extends Flys {

	@Override
	public String itFlys() {
		// TODO Auto-generated method stub
		return "It flys so high";
	}
	
}

class DoesntFlys extends Flys {

	@Override
	public String itFlys() {
		// TODO Auto-generated method stub
		return "Doesnt fly";
	}
	
}