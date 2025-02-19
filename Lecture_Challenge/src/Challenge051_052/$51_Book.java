package Challenge051_052;

class $51_Book {
	static int totalNoOfBooks;
	String author;
	String title;
	String isbn;
	boolean isBorrowed;

	static {
		totalNoOfBooks = 0;
	}
	{ // Object Init
		totalNoOfBooks++;
	}

	$51_Book(String isbn, String title, String author) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
	}

	$51_Book(String isbn) {
		this(isbn, "No name", "Unknown");
	}

	static int getTotalNoOfBooks() {
		return totalNoOfBooks;
	}

	void borrowBook() {
		if (isBorrowed) {
			System.out.println("Book is already borrowed");
		} else {
			this.isBorrowed = true;
			System.out.println("Enjoy " + this.title);
		}
	}

	void returnBook() {
		if (isBorrowed) {
			this.isBorrowed = false;
			System.out.println("Hope you enjoyed, Please leave a review");
		} else {
			System.out.println("This book is already in the library");
		}
	}

	public static void main(String[] args) {
		$51_Book designOfThings = new $51_Book("1", "Design", "Author");
		$51_Book myBook = new $51_Book("2");
		System.out.println($51_Book.getTotalNoOfBooks());
		myBook.borrowBook();
		designOfThings.borrowBook();
		designOfThings.borrowBook();
		designOfThings.returnBook();
		designOfThings.returnBook();
	}
}
