package PreventThreadExecutionMethods;

//Sleep()
public class Test1 extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Sequence: " + i + " '" + Thread.currentThread().getName() + "'");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.start();

		Test1 t2 = new Test1();
		t2.start();
	}

}
