package com.mujeeb;

public class Animal {

	private String name;

	private String sound;

	public Flys fly;
	
public String tryToFly(){
		
		return fly.itFlys();
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}


}
