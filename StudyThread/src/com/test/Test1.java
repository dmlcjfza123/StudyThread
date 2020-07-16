package com.test;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task1 task1 = new Task1();
		Thread t1Thread = new Thread(task1);
		
		Task2 task2 = new Task2();
		Thread t2Thread = new Thread(task2);
		
		Task3While task3 = new Task3While();
		Thread t3Thread = new Thread(task3);
		
		Task4FirstSleep task4 = new Task4FirstSleep();
		Thread t4Thread = new Thread(task4);

		//t1Thread.start();
		//t2Thread.start();
		//t3Thread.start();
		t4Thread.start();
		
		for (int i = 0; i < 3; i++) {
			System.out.println("메인 스레드입니다.");
			//System.out.println("t1스레드의 상태 : " + t1Thread.getState());
			//System.out.println("t2스레드의 상태 : " + t1Thread.getState());
			System.out.println("t4스레드의 상태 : " + t4Thread.getState());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				
			}
		}
		
		//System.out.println("t1스레드의 상태 : " + t1Thread.getState());
		//System.out.println("t2스레드의 상태 : " + t1Thread.getState());
	}

}
