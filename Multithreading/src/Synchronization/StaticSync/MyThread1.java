package Synchronization.StaticSync;

public class MyThread1 implements Runnable {
	private BookTheatreSeats bookTheatreSeats;
	private int seats;

	public MyThread1(BookTheatreSeats bookTheatreSeats, int seats) {
		super();
		this.bookTheatreSeats = bookTheatreSeats;
		this.seats = seats;
	}

	@Override
	public void run() {
		bookTheatreSeats.bookSeats(seats);
	}
}
