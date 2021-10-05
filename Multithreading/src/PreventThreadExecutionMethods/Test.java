package PreventThreadExecutionMethods;

//sleep(), yield(0, join()
// public static native void sleep(long millis) throws InterruptedException;
//public static void sleep(long millis, int nanos)throws InterruptedException;

//Sleep()
public class Test extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Name: " + i);

		}
	}

	public static void main(String[] args) throws InterruptedException {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			Thread.sleep(1000);
			Test t = new Test();
			t.start();
		}
	}

}
