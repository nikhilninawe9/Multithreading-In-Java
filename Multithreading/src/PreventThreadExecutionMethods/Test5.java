package PreventThreadExecutionMethods;

//join()
//user defined thread has to wait to complete main thread
public class Test5 extends Thread {
	private static Thread mainThread;

	public void run() {
		try {
			mainThread.join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		for (int i = 1; i <= 5; i++) {
			System.out.println("Child Thread: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		mainThread = Thread.currentThread();
		Test5 t = new Test5();
		t.start();

		for (int i = 1; i <= 5; i++) {
			System.out.println("Main Thread: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
