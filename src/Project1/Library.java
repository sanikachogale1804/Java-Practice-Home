package Project1;

import java.util.ArrayList;

public class Library {
	
	 private ArrayList<Book> books;  // List of books in the library

	    // Constructor to initialize the library
	    public Library() {
	        books = new ArrayList<>();
	    }

	    // Method to add a book to the library
	    public void addBook(Book book) {
	        books.add(book);
	        System.out.println(book.getTitle() + " added to the library.");
	    }

	    // Method to display all books in the library
	    public void displayAllBooks() {
	        if (books.isEmpty()) {
	            System.out.println("No books available in the library.");
	        } 
	        
	    }

	    // Method to search for a book by title
	    public Book searchBookByTitle(String title) {
	        for (Book book : books) {
	            if (book.getTitle().equalsIgnoreCase(title)) {
	                return book;
	            }
	        }
	        return null;  // Return null if the book is not found
	    }

}
