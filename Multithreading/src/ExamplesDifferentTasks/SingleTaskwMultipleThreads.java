package ExamplesDifferentTasks;
//Multiple tasks from single thread is not possible because if we do then first task will 

//start and second will wait for the first to complete so process will be lengthy.

public class SingleTaskwMultipleThreads extends Thread {
	public void run() {
		System.out.println("Thread Starts");
	}

	public static void main(String[] args) {
		SingleTaskwMultipleThreads i = new SingleTaskwMultipleThreads();
		i.start();
		SingleTaskwMultipleThreads i2 = new SingleTaskwMultipleThreads();
		i2.start();

	}
}
