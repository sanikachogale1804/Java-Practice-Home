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
		bookNumber = bookNumber;
	}
	
	Book()
	{
		
	}
	
	Book(String title,String author,int bookNumber)
	{
		this.title=title;
		this.author=author;
		this.bookNumber=bookNumber;
	}
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", bookNumber=" + bookNumber + "]";
	}
	
	
}
