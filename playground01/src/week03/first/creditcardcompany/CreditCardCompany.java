package week03.first.creditcardcompany;

import java.util.HashMap;

public class CreditCardCompany {
	private static CreditCardCompany CardCompany
		= new CreditCardCompany("42 Card");
	private String companyName;
	private HashMap<String, Customer> customerMap = new HashMap<String, Customer>();
	
	private CreditCardCompany(String companyName) {
		this.companyName = companyName;
	}
	
	public static CreditCardCompany getCardCompany() {
		return CardCompany;
	}
	
	public void issueCard(String CustomerName, String cardName) {
		if (customerMap.isEmpty()) {
			Customer customer = new Customer(CustomerName);
			customer.addCard(cardName);
			customerMap.put(CustomerName, customer);
		}
		else {
			Customer customer = customerMap.get(CustomerName);
			if (customer == null) {
				customer = new Customer(CustomerName);
				customer.addCard(cardName);
				customerMap.put(CustomerName, customer);
			}
			else {
				customer.addCard(cardName);
			}
		}
	}
	
	public void showCustomerInfo(String CustomerName) {
		if (customerMap.isEmpty()) {
			System.out.println("잘못된 고객 정보 입니다.");
		}
		else {
			Customer customer = customerMap.get(CustomerName);
			if (customer == null)
				System.out.println("잘못된 고객 정보 입니다.");
			else {
				System.out.println("\n"
						+ " _  _  ____      ___              _ \n"
						+ "| || ||___ \\    / __\\__ _ _ __ __| |\n"
						+ "| || |_ __) |  / /  / _` | '__/ _` |\n"
						+ "|__   _/ __/  / /__| (_| | | | (_| |\n"
						+ "   |_||_____| \\____/\\__,_|_|  \\__,_|\n"
						+ "                                    \n"
						+ "");
				System.out.println("고객님을 먼저 생각하는 " + this.companyName + "입니다.");
				System.out.println(CustomerName + "님의 카드 목록은 아래와 같습니다.");
				System.out.println("카드명	카드번호	만료일자");
				customer.showCustomerCard();
				System.out.println("\n= = = = = = = = = = = = = = = = = = = \n\n");
			}
		}
		
	} 
}
