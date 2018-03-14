package cn.yzlancoder.chapter1.base;

public class E03ThreadPriorityDemo {

	public static void main(String[] args) {
		
		/*
		 * 线程优先级的设置和获取。通常情况下，不建议使用优先级设置。
		 * 跨平台移植性差，由于操作系统的调度器机制不一样，可能会出现线程
		 * "饿死"的情况，即高优先级的一直执行，低优先级的一直得不到执行。
		 */
		
		Runnable r = () -> System.out.println("E03ThreadPriorityDemo thread.");
		Thread t = new Thread(r);
		
		System.out.println(t.getPriority());
		t.setPriority(Thread.MIN_PRIORITY);
		System.out.println(t.getPriority());
		
	}
	
}
