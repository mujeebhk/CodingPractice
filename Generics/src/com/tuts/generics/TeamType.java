package com.tuts.generics;

import java.util.ArrayList;

public class TeamType<T> {
	
	private ArrayList<T> teams = new ArrayList<T>();

	public ArrayList<T> getTeams() {
		return teams;
	}

	public void setTeams(ArrayList<T> teams) {
		this.teams = teams;
	}
	
	

}
