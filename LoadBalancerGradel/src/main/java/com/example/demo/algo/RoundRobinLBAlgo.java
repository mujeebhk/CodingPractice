package com.example.demo.algo;

import java.util.Iterator;
import java.util.List;

import com.example.demo.NetworkUtil;
import com.example.demo.instance.Instance;

public class RoundRobinLBAlgo extends LBAlgo {

	public RoundRobinLBAlgo(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(List<Instance> instanceList) {
		// TODO Auto-generated method stub
		int min = Integer.MAX_VALUE;
		Instance targetInstance = null;
		
		/*
		 * instanceList.forEach((item) -> { if (item.getHits().get() < min) instance =
		 * item; });
		 */
		Iterator<Instance> itr = instanceList.iterator();
		while (itr.hasNext()) {
			Instance ins = itr.next();
			if (ins.getHits().get() <min) {
				targetInstance = ins;
				min = ins.getHits().get();
			}
		}
		NetworkUtil.makeAPICall("http", targetInstance.getHostname(), targetInstance.getPort());
		targetInstance.getHits().incrementAndGet();
		
	}

	
}
