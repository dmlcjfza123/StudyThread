package com.test;

public class Task1 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("t1 스레드입니다.");
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				// e.printStackTrace();
//				
//			}
		}
	}

}
