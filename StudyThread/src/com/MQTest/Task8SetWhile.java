package com.MQTest;

public class Task8SetWhile implements Runnable {

	private String name;

	public void setThreadName(String _name) {
		name = _name;
	}

	@Override
	public void run() {
		TestDto testDto = null;

		while(true) {
			//System.out.println(name + " 스레드입니다.");

			if (Test2.messageQ.size() == 0) {
				System.out.println(name + " 스레드입니다. 메세지큐 사이즈가 0 개입니다.");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
				}

			} else {
				testDto = Test2.messageQ.poll();
			}
			

			if (testDto != null) {
				System.out.println(name + " 스레드에서 읽은 Dto 값 : " + testDto.getStr());
				testDto = null;
			}
		}
		
	}

}
