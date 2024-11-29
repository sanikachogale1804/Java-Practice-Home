package Project1;

import java.util.ArrayList;

public class Member {

	private String name;
    private int memberId;
    private ArrayList<Book> borrowedBooks;  // List of books borrowed by the member

    // Constructor to initialize a member object
    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    // Method to borrow a book
    public void borrowBook(Book book) {
        if (borrowedBooks.contains(book)) {
            System.out.println(book.getTitle() + " has already been borrowed.");
        } else {
            borrowedBooks.add(book);
            System.out.println(name + " borrowed " + book.getTitle());
        }
    }

    // Method to return a book
    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            System.out.println(name + " returned " + book.getTitle());
        } else {
            System.out.println(name + " didn't borrow " + book.getTitle());
        }
    }

	
}
