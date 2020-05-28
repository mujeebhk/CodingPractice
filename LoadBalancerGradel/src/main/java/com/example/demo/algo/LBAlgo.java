package com.example.demo.algo;

import java.util.List;

import com.example.demo.instance.Instance;

public abstract class LBAlgo {

	private String name;
	
	public LBAlgo(String name) {
		this.name = name;
	}
	
	public abstract void execute (List<Instance> instanceList);

	public String getName() {
		return name;
	}

	
	
	
}
