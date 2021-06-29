package week03.second.kyobo;

import java.util.HashMap;
import java.util.Scanner;

public class BookStoreKyobo extends BookStore{
	private HashMap<String, Customer> customerMap
		= new HashMap<String, Customer>();
	BookStoreKyobo(String branchName) {
		super(branchName);
	}
	
	@Override
	protected boolean sellBooks(String isbn, int bookNum) {

		if (super.sellBooks(isbn, bookNum) == true) {
			String customerName;
			Scanner scanner = new Scanner(System.in);
			System.out.print("회원 명을 입력하세요 : ");
			customerName = scanner.next();
			if (customerName.equals(" ") == false) {
				System.out.println(customerName + "고객님의 누적 포인트는 "
						+ checkCustomer(customerName, bookNum) + "점 입니다.");
			}
			return true;
		}
		else
			return false;
	}
	
	private int checkCustomer (String customerName, int bookNum) {
		Customer tempCustomer;
		if (customerMap.isEmpty()) {
			tempCustomer = new Customer();
			customerMap.put(customerName, tempCustomer);
		}
		else {
			tempCustomer = customerMap.get(customerName);
			if (tempCustomer == null) {
				tempCustomer = new Customer();
				customerMap.put(customerName, tempCustomer);
			}
		}
		tempCustomer.addPoint(bookNum);
		return tempCustomer.getPoint();
	}
	
	@Override
	protected void showRevenue() {
		System.out.print("교보문고 ");
		super.showRevenue();
	}
}
