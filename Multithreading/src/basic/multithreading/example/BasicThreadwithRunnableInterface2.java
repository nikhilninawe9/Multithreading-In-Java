package basic.multithreading.example;

public class BasicThreadwithRunnableInterface2 implements Runnable {
	public void run() {
		for (int i = 0; i <= 7; i++) {
			System.out.println("Thread1");
		}
	}

	public static void main(String[] args) {
		BasicThreadwithRunnableInterface2 b = new BasicThreadwithRunnableInterface2();
		Thread t1 = new Thread(b);
		t1.start();
	}

}
