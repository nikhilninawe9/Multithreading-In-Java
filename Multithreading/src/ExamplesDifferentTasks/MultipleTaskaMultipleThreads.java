package ExamplesDifferentTasks;

// One class can have 1 run method
// Now which thread will run first will decide JVM and thread scheduler by their own algorithm
class Video extends Thread {
	public void run() {
		System.out.println("Video is playing");
	}
}

class Audio extends Thread {
	public void run() {
		System.out.println("Audio is playing");
	}
}

class Volume extends Thread {
	public void run() {
		System.out.println("Volume is working");
	}
}

class OnOff extends Thread {
	public void run() {
		System.out.println("We can make it on/off");
	}
}

public class MultipleTaskaMultipleThreads {

	public static void main(String[] args) {
		Video v1 = new Video();
		v1.start();
		Audio a1 = new Audio();
		a1.start();
		Volume vo1 = new Volume();
		vo1.start();
		Video v2 = new Video();
		v2.start();
		OnOff o1 = new OnOff();
		o1.start();

	}

}
