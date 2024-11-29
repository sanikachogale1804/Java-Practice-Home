package Project1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library {
	
	  List<Book> books;

	    public Library() {
	        this.books = new ArrayList<>();
	    }

	    // Method to add a book to the library
	    public void addBook(Book book) {
	        books.add(book);
	        System.out.println("Book added: " + book);
	    }

	    // Method to remove a book by ISBN
	    public void removeBook(int bookNumber) {
	    	Iterator<Book> iterator = books.iterator();
	        while (iterator.hasNext()) {
	            Book book = iterator.next();
	            if (book.getBookNumber() == bookNumber) {
	                iterator.remove();
	                System.out.println("Book removed: " + book);
	                return;
	            }
	        }
	        System.out.println("Book with ISBN " + bookNumber + " not found.");
	    }

	    // Method to display all books
	    public void displayBooks() {
	        if (books.isEmpty()) {
	            System.out.println("No books available in the library.");
	        } else {
	            System.out.println("Books in the library:");
	            for (Book book : books) {
	                System.out.println(book);
	            }
	        }
	    }

}
