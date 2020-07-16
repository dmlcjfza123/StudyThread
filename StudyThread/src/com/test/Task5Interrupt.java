package com.test;

public class Task5Interrupt extends Thread {

	@Override
	public void run() {
		interrupt();
	}
}
