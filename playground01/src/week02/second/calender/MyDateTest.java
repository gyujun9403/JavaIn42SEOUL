package week02.second.calender;

public class MyDateTest {
	
	public static void main(String[] args) {
		MyDate date1 = new MyDate(30, 2, 2000);
		System.out.println(date1.isValid());
		MyDate date2 = new MyDate(2, 10, 2006);
		System.out.println(date2.isValid());
		MyDate date3 = new MyDate(29, 2, 2021);
		System.out.println(date3.isValid());
		MyDate date4 = new MyDate(29, 2, 2200);
		System.out.println(date4.isValid());
		MyDate date5 = new MyDate(29, 2, 2400);
		System.out.println(date5.isValid());
		MyDate date6 = new MyDate(5, 10, 1582);
		System.out.println(date6.isValid());
		MyDate date7 = new MyDate(14, 10, 1582);
		System.out.println(date7.isValid());
	}
}