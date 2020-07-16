package com.test;

public class Task3While implements Runnable {

	@Override
	public void run() {
		while(true) {
			System.out.println("t3 스레드입니다. while 중입니다.");
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				//e.printStackTrace();
//			}
		}

	}

}
