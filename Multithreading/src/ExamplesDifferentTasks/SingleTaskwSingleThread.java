package ExamplesDifferentTasks;

public class SingleTaskwSingleThread extends Thread {
	public void run() {
		System.out.println("Thread Starts");
	}

	public static void main(String[] args) {
		SingleTaskwSingleThread i = new SingleTaskwSingleThread();
		i.start();
	}

}
