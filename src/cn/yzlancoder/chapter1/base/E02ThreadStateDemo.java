package cn.yzlancoder.chapter1.base;

public class E02ThreadStateDemo {

	public static void main(String[] args) {
		
		//获取一条线程的执行状态,Thread.State getState();
		/**
		 * NEW: 该状态线程还没开始执行;
		 * RUNNABLE: 该状态下线程正在JVM中执行;
		 * BLOCKED: 该状态下线程被阻塞并等待一个监听锁;
		 * WAITING: 该状态下线程无限期地等待另外一条线程执行特定的操作;
		 * TIMED_WAITING: 该状态下线程在特定的时间内等待另外一条线程执行某种操作;
		 * TERMINATED: 该状态下线程已经退出;
		 */
		
		Runnable r = () -> {
			System.out.println("Thread state demo thread run.");
		};
		Thread t = new Thread(r);
		System.out.println("assert NEW:"+ t.getState());
		
		t.start();
		
		System.out.println("assert RUNNABLE:"+ t.getState());
	}
	
}
