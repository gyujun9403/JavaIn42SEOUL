package week03.first.creditcardcompany;

import java.util.HashMap;

public class CreditCardCompany {
	//카드사는 싱글톤 패턴으로 선언된다.
	private static CreditCardCompany CardCompany
		= new CreditCardCompany("42Card");
	//프로퍼티는 기업 이름과 고객들을 저장한 맵이 이 있다.
	//map의 경우 고객의 이름을 key로 가지고, value로 고객 객체를 가진다.
	private String companyName;
	private HashMap<String, Customer> customerMap = new HashMap<String, Customer>();
	
	private CreditCardCompany(String companyName) {
		this.companyName = companyName;
	}
	
	//회사명을 받을 수 있는 getter.
	public static CreditCardCompany getCardCompany() {
		return CardCompany;
	}
	
	/*
	** 카드 발급함수.
	** 우선 customerMap이 비었으면 바로 신규고객 및 카드를 추가한다.
	** 아닌 경우 customerMap에서 입력된 고객을 검색하고, 
	** 해당 고객이 없으면 Customer인스턴스를 생성하여 신규 고객 객체를 추가 및 카드도 등록한다.
	** 고객이 있으면 카드만 추가한다.
	*/
	protected void issueCard(String CustomerName, String cardName) {
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
	
	/*
	** 고객의 정보를 출력하는 함수이다.
	** 우성 customerMap 에 고객이 있는지 확인하고 없으면 "잘못된 고객 정보"를 출력한다.
	** (고객이 있는지 없는지 노출하지 않는다..)
	** customerMap에 고객 객체 검색하고, 해당 고객이 없으면 "잘못된 고객 정보"를 출력한다.
	** 있다면 지정된 서식과 함께 카드 정보들을 출력한다.
	*/
	protected void showCustomerInfo(String CustomerName) {
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
						+ "");
				System.out.println("고객님을 먼저 생각하는 " + this.companyName + "입니다.");
				System.out.println(CustomerName + "님의 카드 목록은 아래와 같습니다.");
				System.out.println("카드명	카드번호	만료일자");
				customer.showCustomerCard();
				System.out.println("\n= = = = = = = = = = = = = = = = = = = \n");
			}
		}
		
	} 
}
