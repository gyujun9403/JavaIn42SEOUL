package week03.second.kyobo;

public class Book {
	private String isbn;
	private String bookName;
	private int price;
	private int stock;
	
	protected Book(String isbn, String bookName, int price) {
		this.isbn = isbn;
		this.bookName = bookName;
		this.price = price;
	}
	public String getBookName() {
		return bookName;
	}
	public int getPrice() {
		return price;
	}
	protected void addStock(int bookNum) {
		stock += bookNum;
	}
	protected boolean subStock(int bookNum) {
		if (stock >= bookNum) {
			stock -= bookNum;
			return true;
		}
		else
			return false;
	}
	public int getStock() {
		return stock;
	}
}
