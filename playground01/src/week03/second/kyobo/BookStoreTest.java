package week03.second.kyobo;

public class BookStoreTest {

	public static void main(String[] args) {
		BookStoreKyobo sejong = new BookStoreKyobo("세종");
		sejong.orderBooks("1313", "미움받을 용기", 15000, 20);
		sejong.sellBooks("2020", 5);
		sejong.sellBooks("1313", 5);
		sejong.sellBooks("1313", 1);
		sejong.showRevenue();
	}
}
