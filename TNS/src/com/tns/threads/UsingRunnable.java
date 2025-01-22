package com.tns.threads;

class C implements Runnable{
	public void run() {
		System.out.println("hello....");
	}
}

public class UsingRunnable {
	
	public static void main(String[] args) {
		
		Runnable a1 = new C();
		
		Thread t1 = new Thread(a1);
		
		t1.start();
	}

}
