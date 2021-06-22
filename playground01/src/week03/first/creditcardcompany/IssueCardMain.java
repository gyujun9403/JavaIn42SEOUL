package week03.first.creditcardcompany;

public class IssueCardMain {

	public static void main(String[] args) {
		CreditCardCompany foutyTwoCard = CreditCardCompany.getCardCompany();
		foutyTwoCard.showCustomerInfo("철수");
		foutyTwoCard.issueCard("철수", "A카드");
		foutyTwoCard.issueCard("철수", "A카드");
		foutyTwoCard.issueCard("철수", "B카드");
		foutyTwoCard.issueCard("영희", "A카드");
		foutyTwoCard.issueCard("철수", "C카드");
		foutyTwoCard.showCustomerInfo("철수");
		foutyTwoCard.showCustomerInfo("영희");
		foutyTwoCard.showCustomerInfo("gyeon");
	}

}

/*
** 해쉬 맵 : https://coding-factory.tistory.com/556
** SimpleDateFormat : http://tutorials.jenkov.com/java-internationalization/simpledateformat.html
** Calendar : https://codechacha.com/ko/java-examples-add-two-dates/
*/
