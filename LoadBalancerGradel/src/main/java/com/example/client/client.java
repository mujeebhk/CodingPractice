package com.example.client;

import com.example.demo.NetworkUtil;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i<20; i++) {
			new Thread(()->  {
				for (int j =0 ; j<100; j++) {
					System.out.println("invoked "+j );
					NetworkUtil.makeAPICall("http", "localhost", "8081");
				}
			}).start();
		}
	}

}
