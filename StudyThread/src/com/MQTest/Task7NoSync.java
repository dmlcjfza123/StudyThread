package com.MQTest;

public class Task7NoSync implements Runnable {

	private String name;

	public void setThreadName(String _name) {
		name = _name;
	}

	@Override
	public void run() {
		TestDto testDto = null;

		//synchronized (Test2.messageQ) {
			System.out.println(name + " 스레드입니다.");

			if (Test2.messageQ.size() == 0) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}

			} else {
				testDto = Test2.messageQ.poll();
				// System.out.println(name + " 스레드에서 읽은 Dto 값 : " + testDto.getStr());
			}
		//}

		if (testDto != null) {
			System.out.println(name + " 스레드에서 읽은 Dto 값 : " + testDto.getStr());
		}
	}

}
