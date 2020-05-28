package com.pl.vehicle;

import com.pl.VSize;

public abstract class Vehicle {

	private String number;
	private VSize size;

	public VSize getSize() {
		return size;
	}

	public void setSize(VSize size) {
		this.size = size;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
}
