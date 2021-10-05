package PreventThreadExecutionMethods;

//join()
//Def: If a thread wants to wait for another thread to complete its turn then itfirst will join.
//when 1 thread stops and waits for other thread to complete its work then 1 thread starts executing.
//ex: Licence driving

//Methods:
//public final void join() throws interrupted exception
//public final synchronised void join(long miliseconds) throws interrupted exception
//public final synchronised void join(long miliseconds, int nanosec) throws interrupted exception
public class Test4 extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Child Thread " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Test4 t = new Test4();
		t.start();
		t.join();// means main thread waits to complete test child thread task then it will
		// execute
		for (int i = 1; i <= 5; i++) {
			System.out.println("Main Thread " + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
//conclusion: join method we have to write into that thread who has to wait to complete the given thread.
}
