package ThreadPriorities;

//Priorities are inherited from parent threads
//By default main thread priorities is 5
//If priority is not in between then it will throw an exception Runtime{Illega argument exception}
//Priorities depends on the platform,[Windows doesnt support priorities]
public class Test implements Runnable {

	@Override
	public void run() {
		System.out.println("Child Thread");
		Thread.currentThread().setPriority(10);// priority of main thread [9]
		System.out.println(Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());// priority of mail thread [5]
		Test t = new Test();
		Thread t1 = new Thread(t);
		t1.start();
	}

}
