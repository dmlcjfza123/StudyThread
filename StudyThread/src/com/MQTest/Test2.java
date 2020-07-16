package com.MQTest;

import java.util.LinkedList;
import java.util.Queue;

public class Test2 {

	public static Queue<TestDto> messageQ = new LinkedList<>();;
	
	public static void main(String[] args) {
		
		messageQ.add(new TestDto());
		messageQ.add(new TestDto("첫번째"));
		messageQ.add(new TestDto("두번째"));
		messageQ.add(new TestDto("세번째"));
		messageQ.add(new TestDto("네번째"));
		messageQ.add(new TestDto("다섯번째"));
		messageQ.add(new TestDto("여섯번째"));
		
		///////////////////////////////////////////////////
		
		Task5Service task5 = new Task5Service();
		Thread t5 = new Thread(task5);
		
		Task6ServiceRe task6_1 = new Task6ServiceRe();
		task6_1.setThreadName("t6_1");
		Thread t6_1 = new Thread(task6_1);
		
		Task6ServiceRe task6_2 = new Task6ServiceRe();
		task6_2.setThreadName("t6_2");
		Thread t6_2 = new Thread(task6_2);
		
		//t5.start();
		//t6_1.start();
		//t6_2.start();
		
		/////////////////동기화 안했을때//////////////////////
		
		Task7NoSync task7_1 = new Task7NoSync();
		task7_1.setThreadName("t7_1");
		Thread t7_1 = new Thread(task7_1);
		
		Task7NoSync task7_2 = new Task7NoSync();
		task7_2.setThreadName("t7_2");
		Thread t7_2 = new Thread(task7_2);
		
		//t7_1.start();
		//t7_2.start();
		
		///////////////////동기화 없이 while 적용 ///////////////
		
		Task8SetWhile task8_1 = new Task8SetWhile();
		task8_1.setThreadName("t8_1");
		Thread t8_1 = new Thread(task8_1);
		
		Task8SetWhile task8_2 = new Task8SetWhile();
		task8_2.setThreadName("t8_2");
		Thread t8_2 = new Thread(task8_2);
		
		t8_1.start();
		t8_2.start();
		
		
		System.out.println("메인 스레드 입니다.");
//		for(int i=0; i<messageQ.size(); i++) {
//			System.out.println("메인스레드에서 읽은  "+ i + "번째 : " + messageQ.peek().getStr());
//		}
	}

}
