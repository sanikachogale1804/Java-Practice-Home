package Project1;

public class Book {
	
	private String title;
    private String author;
    private int bookNumber;
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
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", bookNumber=" + bookNumber + "]";
	}
	public Book(String title, String author, int bookNumber) {
		super();
		this.title = title;
		this.author = author;
		this.bookNumber = bookNumber;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	} 
   
    
}
