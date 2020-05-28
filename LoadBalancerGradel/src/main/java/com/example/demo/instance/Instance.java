package com.example.demo.instance;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class Instance {

	private AtomicInteger hits = new AtomicInteger(0);
	public Instance(String name, String port, String hostname) {
		this.name = name;
		this.port = port;
		this.hostname = hostname;
	}
	private String name;
	private String port;
	private String hostname;
	
	public String getPort() {
		return port;
	}
	public String getHostname() {
		return hostname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public AtomicInteger getHits() {
		return hits;
	}
	public void setHits(AtomicInteger hits) {
		this.hits = hits;
	}
	
	
}
