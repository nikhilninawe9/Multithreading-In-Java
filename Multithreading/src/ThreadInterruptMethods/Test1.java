package ThreadInterruptMethods;

public class Test1 implements Runnable {

	@Override
	public void run() {
		System.out.println("A: " + Thread.interrupted());// this will change the value from true to false
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
				System.out.println("B: " + Thread.interrupted());

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Test1 t = new Test1();
		Thread t1 = new Thread(t);
		t1.start();
		t1.interrupt();
	}
}
