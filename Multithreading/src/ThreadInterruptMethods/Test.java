package ThreadInterruptMethods;

public class Test implements Runnable {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Test t = new Test();
		Thread t1 = new Thread(t);
		t1.start();
		t1.interrupt();// This will interrupt the thread so [1 and catch block will execute]
	}

}
