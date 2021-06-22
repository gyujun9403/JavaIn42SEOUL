package week02.second.calender;

public class MyDate {
	private int date;
	private int month;
	private int year;
	//생성자에서는 "초기화 작업"만 수행해야한다. 메소드를 부를 순 있지만 이것 또한 초기화 작업만 수행하는게 좋다.
	//get set이 없으면 날자를 바꾸고 싶을떄마다 객체를 새로 인스턴스화해야하는 문제가 생긴다.
	// 달 처럼 숫자가 지정된 경우 switch문이 더 좋다.
	//생성자에는 제어문도 잘 넣지 않는다.
	public MyDate(int date, int month, int year) {
		if (year >= 0 && !(year == 1582 && month == 10 && (date > 4 && date < 15))) {
			if (month == 2) {
				if ((date > 0 && date < 29) ||
						(date == 29 && (year % 4 == 0) &&
						!(year % 100 == 0 && year % 400 != 0))) {
					this.date = date;
					this.month = month;
					this.year = year;
				}
			}
			else if (month > 0 && month < 13) {
				if ((date > 0 && date < 31) ||
						(date == 31 && (month == 1 || month == 3 ||
						month == 5 || month == 7 || month == 8 ||
						month == 10 || month == 12))) {
					this.date = date;
					this.month = month;
					this.year = year;
				}
			}
		}
	}
	//isvalid에는 이것이 유효한가에 대한 기능만이 들어가야 한다.
	//각 멤버변수나 메소드의 변화가 다른 멤버 변수들간에 간섭이 덜하게, 즉 의존도가 약하게. 
	public String isValid() {
		if (month == 0 || date == 0)
			return ("유효하지 않은 날짜입니다.");
		else
			return ("유효한 날짜입니다.");
	}
}