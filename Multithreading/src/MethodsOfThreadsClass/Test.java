package MethodsOfThreadsClass;

public class Test extends Thread {
	public void run() {
		System.out.println("Thread task");
		System.out.println(Thread.currentThread().getName());// Thread-0 name is given by JVM
		Thread.currentThread().setName("User Defined thread..!");
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {// main method is by default a single thread.
		System.out.println("Hello");
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Bunty");
		System.out.println(Thread.currentThread().getName());// Bunty
		System.out.println("=========================");
		Test t = new Test();// this thread is creating by main method as per the instructions
		t.start();

	}

}
