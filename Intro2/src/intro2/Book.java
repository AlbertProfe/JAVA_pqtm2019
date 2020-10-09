package intro2;

public class Book {

	private String title;
	private int pages;
	private String ISBN;
	private Author author;

	public Book(String title, int pages, String iSBN, Author author) {
		super();
		this.title = title;
		this.pages = pages;
		ISBN = iSBN;
		this.author = author;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", pages=" + pages + ", ISBN=" + ISBN + "]";
	}

}
