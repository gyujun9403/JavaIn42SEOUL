package week03.first.creditcardcompany;

import java.util.HashMap;
import java.util.Iterator;

public class Customer {
	//Customer 객체에는 고객의 이름과, 해당 고객 객체가 소유한 card맵 프로퍼티가 존재한다. 
	private String customerName;
	private HashMap<String, CreditCard> cardMap = new HashMap<String, CreditCard>();
	
	Customer(String customerName) {
		this.customerName = customerName;
	}
	
	/*
	** cardMap에 카드를 추가하는 메소드 이다.
	** card를 등록하고, 등록되었는지 안되었는지를 출력한다.
	*/
	protected boolean addCard(String newCardName) {
		if (cardMap.isEmpty()) {
			cardMap.put(newCardName, new CreditCard(newCardName));
			System.out.println(">> system : " + customerName + "님의 첫 카드 " + newCardName + "가 발급되었습니다.");
		}
		else {
			CreditCard findedCard = cardMap.get(newCardName);
			if (findedCard == null) {
				cardMap.put(newCardName, new CreditCard(newCardName));
				System.out.println(">> system : " + customerName + "님에게 " + newCardName + "가 발급되었습니다.");
			}
			else {
				System.out.println(">> system : " + customerName + "님은 " + newCardName + "를 이미 소유중입니다.");
				return false;
			}
		}
		return true;
	}
	
	/*
	** 고객이 소유한 카드 정보를 받아오는 메소드이다.
	** 카드정보는 cardMap에 저장되어있는 card객체에서 받아온다.
	*/
	protected void showCustomerCard() {
		Iterator<String> keys = cardMap.keySet().iterator();
		while (keys.hasNext()) {
			String key = keys.next();
			System.out.println(cardMap.get(key).showCardInfo());
		}
	}
}
