package Synchronization.StaticSync;

//If we sont synchronize then data inconsistancy happens
public class MovieBookApp {

	public static void main(String[] args) {
		BookTheatreSeats b1 = new BookTheatreSeats();
		MyThread1 t1 = new MyThread1(b1, 7);
		Thread th1 = new Thread(t1);
		th1.start();

		MyThread2 t2 = new MyThread2(b1, 6);
		Thread th2 = new Thread(t2);
		th2.start();

		BookTheatreSeats b2 = new BookTheatreSeats();
		MyThread1 t3 = new MyThread1(b2, 9);
		Thread th3 = new Thread(t3);
		th3.start();

		MyThread2 t4 = new MyThread2(b2, 7);
		Thread th4 = new Thread(t4);
		th4.start();
	}

}
