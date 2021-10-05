package Synchronization.SyncMethod;

//If we sont synchronize then data inconsistancy happens
public class MovieBookApp implements Runnable {
	private static BookTheatreSeats bookTheatreSeats;
	private int seats;

	@Override
	public void run() {
		bookTheatreSeats.bookSeats(seats);
	}

	public static void main(String[] args) {
		bookTheatreSeats = new BookTheatreSeats();
		MovieBookApp Ansh = new MovieBookApp();
		Ansh.seats = 4;
		Thread t = new Thread(Ansh);
		t.start();

		MovieBookApp Bunty = new MovieBookApp();
		Bunty.seats = 2;
		Thread t1 = new Thread(Bunty);
		t1.start();

		MovieBookApp Guddu = new MovieBookApp();
		Guddu.seats = 8;
		Thread t2 = new Thread(Guddu);
		t2.start();

	}

}
