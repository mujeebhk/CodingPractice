package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.algo.LBAlgo;
import com.example.demo.algo.LBAlgoFactory;
import com.example.demo.config.Configuration;
import com.example.demo.instance.Instance;
import com.example.demo.instance.InstanceFactory;

public class LoadBalancingUtil {

	private static int noOfInstance = 2;
	private static String lbAlgo;// = Configuration.getPropertyValue("LBAlgorithm");
	private static List<Instance> instance = new ArrayList<Instance>();
	private static LBAlgo algo;
	private static int[] weights = {25,75};
	private static String[] port = {"9080","9090"};
	private static String[] hostname = {"localhost" ,"localhost"};
	
	
	public static void init() {
		lbAlgo = "";//Configuration.getLbalgorithm();//Configuration.getPropertyValue("LBAlgorithm");
		initAlgo();
		initInstance();
		
	}
	public static String loadBalance () {
		
		algo.execute(instance);
		return "";
	}
	
	
	private static void initAlgo() {
		algo = LBAlgoFactory.makeLBAlgo(lbAlgo);
	}
	private static void initInstance () {
		for (int i=0;i<noOfInstance; i++) {
			instance.add(InstanceFactory.makeFactory(lbAlgo, lbAlgo+i,port[i], hostname[i]));
		}
		
	}
}
