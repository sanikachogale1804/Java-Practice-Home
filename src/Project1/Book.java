package Project1;

public class Book {
	
	private String title;
    private String author;
    private int bookNumber; 
    private boolean isAvailable;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", bookNumber=" + bookNumber + ", isAvailable="
				+ isAvailable + "]";
	}
	public Book(String title, String author, int bookNumber, boolean isAvailable) {
		super();
		this.title = title;
		this.author = author;
		this.bookNumber = bookNumber;
		this.isAvailable = isAvailable;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}  

    
}
