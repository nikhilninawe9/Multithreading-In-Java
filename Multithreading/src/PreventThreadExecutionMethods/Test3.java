package PreventThreadExecutionMethods;

//yield()=>which stops the current executing thread& gives the chance to execute to other thread
// big bazaar example

//java5 internally it worked as sleep()
//java6 thread provide hints to thread schedular to accept or ignore the hint[whose priority is higher or equals to current]
//public static native void yield()
public class Test3 extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}

	public static void main(String[] args) {
		Test3 t1 = new Test3();
		t1.start();
		Thread.yield();
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}

}
