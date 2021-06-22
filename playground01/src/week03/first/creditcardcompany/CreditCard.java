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
	
	protected CreditCard(String cardName) {
		this.cardName = cardName;
		this.cardNum = serialNum++;
		this.endDate = makeExpirtDate();
	}
	
	public String getCardName() {
		return cardName;
	}
	
	private String makeExpirtDate() {
		Calendar time = Calendar.getInstance();
		time.setTime(new Date());
		time.add(Calendar.YEAR, 5);
		return dateFormat.format(time.getTime());
	}
	
	protected String showCardInfo() {
		return cardName + "	" + Integer.toString(cardNum) + "	" + endDate;
	}
}
