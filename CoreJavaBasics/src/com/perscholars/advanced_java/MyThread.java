package com.perscholars.advanced_java;

public class MyThread implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i < 5; i++) {
			System.out.println(i);//"Thread: "+ Thread.currentThread().getName() +" value of i: "+
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				System.out.println("Thread Interrupted");
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new MyThread(), "MyThread-1");
		Thread t2 = new Thread(new MyThread(), "MyThread-2");
		t1.start();
		t2.start();
//		Thread[] threads = new Thread[2];
//		for (int i = 0; i < threads.length; i++) {
//			threads[i] = new Thread(new MyThread(), "MyThread-" + i);
//			threads[i].start();
//		}
		
//		System.out.println("[" + Thread.currentThread().getName() + "] All threads have finished");
	}
	
}
