package cn.yzlancoder.chapter1.base.entity;

public class MyThread extends Thread {

	@Override
	public void run() {
		
		System.out.println("Hello from extends thread");
	}

	
}
