package week03.second.kyobo;

import java.util.HashMap;

public class BookStore {
	// 책 재고, 회원 정보, 수익
	private String branchName;
	private HashMap<String, Book> bookMap = new HashMap<String, Book>();
	private int revenue;
	
	BookStore(String branchName) {
		this.branchName = branchName;
	}
	// 책 주문 
	protected void orderBooks(String isbn, String bookName, int price, int bookNum) {
		if (bookMap.isEmpty()) {
			Book tempBook =  new Book(isbn, bookName, price);
			tempBook.addStock(bookNum);
			bookMap.put(isbn, tempBook);
		}
		else {
			Book tempBook = bookMap.get(isbn);
			if (tempBook == null) {
				tempBook =  new Book(isbn, bookName, price);
				tempBook.addStock(bookNum);
				bookMap.put(isbn, tempBook);
			}
			else {
				tempBook.addStock(bookNum);
			}
		}
	}
	// 책 판매 
	protected boolean sellBooks(String isbn, int bookNum) {
		if (bookMap.isEmpty()) {
			System.out.println(">> 해당 책은 없습니다.");
		}
		else {
			Book tempBook = bookMap.get(isbn);
			if (tempBook == null) {
				System.out.println(">> 해당 책은 없습니다.");
			}
			else {
				if (tempBook.subStock(bookNum) == false)
					System.out.println(">> 해당 책 재고가 모자랍니다.");
				else {
					revenue += tempBook.getPrice() * bookNum;
					System.out.println("\n\n"
							+ "  ________                __                           __   __\n"
							+ " /_  __/ /_  ____ _____  / /__   __  ______  __  __   / /  / /\n"
							+ "  / / / __ \\/ __ `/ __ \\/ //_/  / / / / __ \\/ / / /  / /  / / \n"
							+ " / / / / / / /_/ / / / / ,<    / /_/ / /_/ / /_/ /  /_/  /_/  \n"
							+ "/_/ /_/ /_/\\__,_/_/ /_/_/|_|   \\__, /\\____/\\__,_/  (_)  (_)   \n"
							+ "                              /____/                          ");
					System.out.println(tempBook.getBookName() + " " + bookNum + "권 주문 감사합니다.");
					return true;
				}
			}
		}
		return false;
	}
	protected void showRevenue() {
		System.out.println(branchName + "점 수익은 " + revenue + "원 입니다.");
	}
}
