package PreventThreadExecutionMethods;

//Example of join threads
class Medical extends Thread {
	public void run() {
		System.out.println("Medical Test Starts");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Medical Test Completed");

	}
}

class TestDrive extends Thread {
	public void run() {
		System.out.println("Test drive Starts");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Test drive Completed");
	}
}

class OfficerSign extends Thread {
	public void run() {
		System.out.println("Officer Verification Starts");
		try {
			Thread.sleep(1300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Officer Verification Completed");
	}
}

public class LicenceDemo {

	public static void main(String[] args) throws InterruptedException {
		Medical m = new Medical();
		m.start();
		m.join();// main thread will wait to complete the medical task
		TestDrive t = new TestDrive();
		t.start();
		t.join();// main thread will wait to complete the TestDrive task
		OfficerSign o = new OfficerSign();
		o.start();
		o.join();// main thread will wait to complete the OfficerSign task
	}

}
