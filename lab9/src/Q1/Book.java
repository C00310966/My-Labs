package Q1;

public class Book extends LibraryItem implements LoanItem { //extends allows book to inherit from library item and implements allows it to use calculatePrice from LoanItem

	private String author;
	private String title;
	private int numPages;
	
	public Book(String ID, String author, String title, int numPages) {
		
		super("Book", ID);
		this.author = author;
		this.title = title;
		this.numPages = numPages;
	}
	
	

	@Override
	public double calculatePrice() {
		
		return numPages * 0.01;
	}



	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumPages() {
		return numPages;
	}

	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}

	@Override
	public String toString() {
		return "Book [author=" + author + ", title=" + title + ", numPages=" + numPages + "]";
	}

	
	
	
	
	
}
