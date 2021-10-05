package InterThreadCommunication;

public class TotalEarnings implements Runnable {
	public int totalAmount = 0;

	@Override
	public void run() {
		synchronized (this) {

			for (int i = 1; i <= 10; i++) {
				totalAmount = totalAmount + 100;
			}
			this.notify();
		}
	}
//here after sync of for loop it will notify for reececuting the main thread
}
