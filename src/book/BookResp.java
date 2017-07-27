package book;

public class BookResp {
	private String book_name;
	private String book_tite;
	public BookResp(String n,String t)
	{
		this.book_name=n;
		this.book_tite=t;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getBook_tite() {
		return book_tite;
	}
	public void setBook_tite(String book_tite) {
		this.book_tite = book_tite;
	}

}
