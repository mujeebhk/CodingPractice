package com.example.demo.algo;

public class LBAlgoFactory {

	private static String ROUND_ROBIN_ALGO = "ROUND_ROBIN_ALGO";
	private static String WEIGHTED_ROUND_ROBIN_ALGO = "WEIGHTED_ROUND_ROBIN_ALGO";
	private static String LEAST_CONNECTIONS_ALGO = "LEAST_CONNECTIONS_ALGO";
	private static String LEAST_RESPONSE_TIME_ALGO = "LEAST_RESPONSE_TIME_ALGO";
	private static String SOURCE_IP_HASH_ALGO = "SOURCE_IP_HASH_ALGO";
	private static String URL_HASH_ALGO = "URL_HASH_ALGO";
		
	public static LBAlgo makeLBAlgo (String algo) {
		
		//if (ROUND_ROBIN_ALGO.equalsIgnoreCase(algo)) {
			return new RoundRobinLBAlgo("Round Robin");
		/*
		 * } else { return new WeightedRoundRobinLBAlgo("Weighted Round Robin"); }
		 */
	}
}	
