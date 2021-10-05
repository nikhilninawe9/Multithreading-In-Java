package basic.multithreading.example;
//java.lang packages has all predefied methods.

public class BasicThreadwithEThreadClass1 extends Thread {
	public void run() {
		for (int i = 0; i <= 7; i++) {
			System.out.println("Thread1");
		}
	}

	public static void main(String[] args) {
		BasicThreadwithEThreadClass1 b = new BasicThreadwithEThreadClass1();
		b.start();// start is to create thread
		// b.start();// we cant create thread again after dead it will create exception
		// java.lang.IllegalThreadStateException
	}

}
