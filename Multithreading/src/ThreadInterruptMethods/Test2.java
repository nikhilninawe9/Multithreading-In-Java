package ThreadInterruptMethods;

public class Test2 implements Runnable {

	@Override
	public void run() {
		System.out.println("A1: " + Thread.currentThread().isInterrupted());// true [It wont change the value will
		System.out.println("A2: " + Thread.currentThread().isInterrupted()); // remain true]
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
		Test2 t = new Test2();
		Thread t1 = new Thread(t);
		t1.start();
		t1.interrupt();
	}
}
