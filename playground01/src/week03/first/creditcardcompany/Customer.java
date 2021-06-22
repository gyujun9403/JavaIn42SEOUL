package week03.first.creditcardcompany;

import java.util.HashMap;
import java.util.Iterator;

public class Customer {
	private String customerName;
	private HashMap<String, CreditCard> cardMap = new HashMap<String, CreditCard>();
	
	Customer(String customerName) {
		this.customerName = customerName;
	}
	
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
				System.out.println(">> system : " + customerName + "님은 " + newCardName + "를 이미 소유중 입니.");
				return false;
			}
		}
		return true;
	}
	
	protected void showCustomerCard() {
		Iterator<String> keys = cardMap.keySet().iterator();
		while (keys.hasNext()) {
			String key = keys.next();
			System.out.println(cardMap.get(key).showCardInfo());
		}
	}
}
