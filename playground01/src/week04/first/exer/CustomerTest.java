package week04.first.exer;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		ArrayList<Customer> custmerList = new ArrayList<Customer>();
		Customer coutomerLee = new Customer(1001, "LEE");
		custmerList.add(coutomerLee);
		Customer coutomerKim = new Customer(1002, "KIM");
		custmerList.add(coutomerKim);
		Customer coutomerSong = new Customer(1003, "SONG");
		custmerList.add(coutomerSong);
 		Customer coutomerPark = new GoldCustomer(1004, "Park");
 		custmerList.add(coutomerPark);
		Customer coutomerKang = new VIPCustomer(1005, "Kang", 12345);
		custmerList.add(coutomerKang);

		for (Customer customer : custmerList) {
			customer.showCustomerInfo();
		}
		
	}

}
