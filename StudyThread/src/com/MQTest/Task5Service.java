package com.MQTest;

public class Task5Service implements Runnable {

	@Override
	public void run() {
		
		TestDto testDto = null;
		
		synchronized (Test2.messageQ) {
			if(Test2.messageQ.size() != 0) {
				testDto = Test2.messageQ.poll();
			}
			else {
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {}
			}
			
			System.out.println("스레드에서 읽은 Dto 값 : " + testDto.getStr());
		}
		
	}

}
