package DaemonThread;

// Daemon threads is those thread which runs in background.
//It provides service to the threads.
//for example, garbage colector, finalizer, attach listner, signal dispatches etc.
//Garbage collector is the thread which executes in background of the main method, if main method doesnt get any memory to execute then garbage collector helps to get it.
//example, in ms word when we type same time spelling checker checks whether it is correct or not otherwise it will underline it. so spelling checker is daemon thread.

//Methods available:
//public final void setDaemon(Boolean b)
//public final boolean isDaemon()

//Rules:
//When we want to make daemon thread then we have to setDaemon before start the particular thread. [Otherwise shows exception{Illegal thread state exception}]
//We cannot create main thread as daemon thread. Coz main thread is the starting point and leads to make different threads.
//Its life depends upon another thread. ex. main thread goes for the dead state then daemon will also die.
//Nature: Daemons thread inherit properties from its parent thread. [ex parent thread: main thread]
//JVM role in daemon thread: JVM doesnt depends upon the daemon thread it depends upon the other threads.
//Normally all threads wxcluding daemon goes into the dead state then JVM shuts down but there daemon thread remains
//then JVM bring that daemon thread into dead state then shuts down.

//Priority of daemon thread must be taken as low coz it executes at background we can give same priority or low but not high. 

public class DaemonT extends Thread {
	public void run() {
		System.out.println("Child thread");// Daemon thread
	}

	public static void main(String[] args) {
		System.out.println("Main Thread");
		DaemonT d1 = new DaemonT();
		d1.setDaemon(true);
		d1.start();
	}

}
