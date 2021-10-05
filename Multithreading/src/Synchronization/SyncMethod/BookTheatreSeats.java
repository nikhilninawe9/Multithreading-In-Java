package Synchronization.SyncMethod;

public class BookTheatreSeats {
	private int totalSeats = 10;

	public synchronized void bookSeats(int seats) {
		if (totalSeats >= seats) {
			System.out.println("Seats Booked Successfully");
			totalSeats = totalSeats - seats;
			System.out.println("Seats Left: " + (totalSeats));
		} else {
			System.out.println("Seats cant be booked");
			System.out.println("Seats Left: " + (totalSeats));
		}
	}
}
