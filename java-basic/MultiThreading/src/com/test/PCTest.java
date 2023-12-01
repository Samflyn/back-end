package com.test;

class Test {
	int num;
	boolean value = false;

	public synchronized void put(int num) {
		while (value) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Produce : " + num);
		this.num = num;
		value = true;
		notify();
	}

	public synchronized void get() {
		while (!value) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Consume : " + num);
		value = false;
		notify();
	}
}

class Producer implements Runnable {
	Test t;

	public Producer(Test t) {
		this.t = t;
		Thread t1 = new Thread(this, "Producer");
		t1.start();
	}

	public void run() {
		int i = 0;
		while (true) {
			t.put(i++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Consumer implements Runnable {
	Test t;

	public Consumer(Test t) {
		this.t = t;
		Thread t2 = new Thread(this, "Consumer");
		t2.start();
	}

	public void run() {
		while (true) {
			t.get();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class PCTest {
	public static void main(String[] args) throws InterruptedException {
		Test t = new Test();
		new Producer(t);
		new Consumer(t);
	}
}
