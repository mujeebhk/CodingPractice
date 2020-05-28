package com.mujeeb;

public class ThreadEx extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0 ; i<10; i++) 
			new ThreadEx().start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		
		for (int i =0 ;i < 10; i++) {
			System.out.println("Hello " + i);
			/*
			 * try { Thread.sleep(1); } catch (InterruptedException e) { // TODO
			 * Auto-generated catch block e.printStackTrace(); }
			 */
		}
	}

}
