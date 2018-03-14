package cn.yzlancoder.chapter1.base;

import cn.yzlancoder.chapter1.base.entity.MyThread;

public class E01ThreadCreateDemo {

	public static void main(String[] args) {
		
		//简单线程的创建方式一
		Runnable r= new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Hello from thread.");
			}
		};
		
		Runnable r2 = () -> System.out.println("Hello lambda from thread.");
		
		//简单线程的创建方式二
		MyThread t3 = new MyThread();
		t3.setName("MyThread t3");
		
		//设置线程名称
		Thread t = new Thread(r);
		t.setName("thread name t1");
		System.out.println(t.getName());
		
		Thread t2 = new Thread(r2, "thread name t2");
		System.out.println(t2.getName());
		
		t.start();
		t2.start();
		t3.start();
		System.out.println(t3.getName());
		
	}
	
}
