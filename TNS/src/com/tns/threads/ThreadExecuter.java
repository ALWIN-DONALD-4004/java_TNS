package com.tns.threads;

class A extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("hello .....");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class B extends Thread{
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println("bye...");
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
	}
}

public class ThreadExecuter {

	public static void main(String[] args) {
		
		A a1 = new A();
		B b1 = new B();
		
		a1.setPriority(10);
		b1.setPriority(2);
		
		a1.start();
		b1.start();

	}

}
