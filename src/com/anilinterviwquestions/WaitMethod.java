package com.anilinterviwquestions;

public class WaitMethod implements Runnable {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);}
		}
		public void run1() {
			for (int i = 1; i <= 5; i++) {
				System.out.println(i);}
	}

	public static void main(String[] args) throws InterruptedException {
		WaitMethod w = new WaitMethod();
		WaitMethod w1 = new WaitMethod();

		Thread t1 = new Thread();
		Thread t2 = new Thread();
		t1.start();

		t2.start();
		Thread.sleep(10000);

		//t1.wait();
		w.run();
		w1.run();

	}

}
