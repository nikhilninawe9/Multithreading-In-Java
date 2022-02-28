package StudentLibraryProjectMultithreaded;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Book {
	private int bookId;
	private Lock lock;

	public Book(int bookId) {
		super();
		this.bookId = bookId;
		this.lock = new ReentrantLock();
	}

	@Override
	public String toString() {
		return "Book # " + bookId;
	}

	public void read(Student student) {
		try {
			lock.tryLock(1, TimeUnit.MINUTES);
			// lock.lock();
			System.out.println(student + " starts reading " + this);
			Thread.sleep(10000);
			lock.unlock();
			System.out.println(student + " finished reading " + this);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
