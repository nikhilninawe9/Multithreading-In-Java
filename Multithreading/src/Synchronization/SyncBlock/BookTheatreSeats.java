package Synchronization.SyncBlock;

//we do synchronized whole method leads to slow down the process
//so certain part of code we will take into the sync block helps to fastened the process
public class BookTheatreSeats {
	private int totalSeats = 10;

	public void bookSeats(int seats) {
		System.out.println("My name is: " + Thread.currentThread().getName());
		System.out.println("My name is: " + Thread.currentThread().getName());
		System.out.println("My name is: " + Thread.currentThread().getName());

		synchronized (this) {
			if (totalSeats >= seats) {
				System.out.println("Seats Booked Successfully");
				totalSeats = totalSeats - seats;
				System.out.println("Seats Left: " + (totalSeats));
			} else {
				System.out.println("Seats cant be booked");
				System.out.println("Seats Left: " + (totalSeats));
			}
		}

		System.out.println("My name is: " + Thread.currentThread().getName());
		System.out.println("My name is: " + Thread.currentThread().getName());
		System.out.println("My name is: " + Thread.currentThread().getName());
	}
}
