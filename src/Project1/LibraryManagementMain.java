package Project1;

public class LibraryManagementMain {
	
	// Create a library instance
    Library library1 = new Library();

    // Create book instances
    Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 101);
    Book book2 = new Book("1984", "George Orwell", 102);
    Book book3 = new Book("Moby Dick", "Herman Melville", 103);

    // Add books to the library
    library1.addBook(book1);
    library.addBook(book2);
    library.addBook(book3);

    // Create a member
    Member member = new Member("John Doe", 1);

  

    // Member borrows a book
    member.borrowBook(book1);

    // Display borrowed books
    member.displayBorrowedBooks();

    // Member tries to borrow the same book again
    member.borrowBook(book1);

    // Member returns a book
    member.returnBook(book1);

    // Display borrowed books after returning a book
    member.displayBorrowedBooks();

    // Member tries to return a book not borrowed
    member.returnBook(book2);
}

}
