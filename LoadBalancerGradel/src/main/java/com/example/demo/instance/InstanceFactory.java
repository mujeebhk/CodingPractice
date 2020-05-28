package com.example.demo.instance;

public class InstanceFactory {

	private static final String BASIC_TYPE = "basic";
	public static Instance makeFactory (String type, String instanceName, String port, String hostName) {
		if (BASIC_TYPE.equals(type)) {
			return new BasicInstance(instanceName, port, hostName );
		} else 
			return new WeightedInstance(instanceName, port, hostName);
	}
}
