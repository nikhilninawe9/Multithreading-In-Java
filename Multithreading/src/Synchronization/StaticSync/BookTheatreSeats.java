package Synchronization.StaticSync;

//thread interference can be solved with static synchronization
//Now thread lock concept is for class in this static sync but previously it was separate
public class BookTheatreSeats {
	private static int totalSeats = 20;

	public static synchronized void bookSeats(int seats) {

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
