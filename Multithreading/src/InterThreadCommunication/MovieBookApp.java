package InterThreadCommunication;

public class MovieBookApp {

	public static void main(String[] args) throws InterruptedException {
//		TotalEarnings te = new TotalEarnings();
//		Thread t1 = new Thread(te);
//		t1.start();
//		System.out.println("Total Earnings: " + te.totalAmount + " Rs.");// here earnings shows 0 coz main thread
		// executed first and then thread 0.

		// to solve this prob
		// we use wait,notify notifyAll
		TotalEarnings te = new TotalEarnings();
		Thread t1 = new Thread(te);
		t1.start();

		synchronized (t1) {
			t1.wait(20);
			System.out.println("Total Earnings: " + te.totalAmount + " Rs.");
		}
	}

}
