package week03.first.creditcardcompany;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CreditCard {
	static private int serialNum = 1000;
	//사용자 객체에는 소유하고 있는 카드 리스트를 저장 
	//카드이름, 카드번호, 유효일자
	private String cardName;
	private int cardNum;
	private SimpleDateFormat dateFormat = new SimpleDateFormat ("MM YY");
	private String endDate;
	
	// 생성자. 카드명, 카드번호, 만료 일자를 초기화하며 인스턴스를 생성한다. 
	protected CreditCard(String cardName) {
		this.cardName = cardName;
		this.cardNum = serialNum++;
		this.endDate = makeExpirtDate();
	}
	
	public String getCardName() {
		return cardName;
	}
	
	// 만료 일자 계산에 필요한 기능을 수행하는 메소드.
	private String makeExpirtDate() {
		Calendar time = Calendar.getInstance();
		time.setTime(new Date());
		time.add(Calendar.YEAR, 5);
		return dateFormat.format(time.getTime());
	}
	
	//카드의 정보를 반환하는 메소드.
	protected String showCardInfo() {
		return cardName + "	" + Integer.toString(cardNum) + "	" + endDate;
	}
}
