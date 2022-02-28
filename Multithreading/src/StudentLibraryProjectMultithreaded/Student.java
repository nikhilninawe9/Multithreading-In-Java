package StudentLibraryProjectMultithreaded;

import java.util.Random;

public class Student implements Runnable {
	private int studentId;
	private Book[] books;

	public Student(int studentId, Book[] books) {
		super();
		this.studentId = studentId;
		this.books = books;
	}

	@Override
	public void run() {
		Random random = new Random();
		while (true) {
			int bookid = random.nextInt(Constants.NUMBER_OF_BOOKS);
			books[bookid].read(this);
		}
	}

	@Override
	public String toString() {
		return "Student # " + studentId;
	}

}
