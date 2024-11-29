package Project1;

import java.util.Scanner;

public class LibraryManagementSystem {
	
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("Library Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Display Books");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:  // Add a book
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author name: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter ISBN number: ");
                    int isbn = scanner.nextInt();  // Input ISBN as an integer
                    scanner.nextLine();  // Consume the newline character
                    Book newBook = new Book(title, author, isbn);
                    library.addBook(newBook);
                    break;

                case 2:  // Remove a book
                    System.out.print("Enter ISBN of the book to remove: ");
                    int removeIsbn = scanner.nextInt();  // Input ISBN as an integer
                    library.removeBook(removeIsbn);
                    break;

                case 3:  // Display all books
                    library.displayBooks();
                    break;

                case 4:  // Exit
                    System.out.println("Exiting system...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
		
	}


