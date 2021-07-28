package week08.studentinfo;

public class Test {

	public static void main(String[] args) {
		Service service = new Service();
		service.setAllData();
		service.printAllData("korean");
		service.printAllData("science");
		service.printAllData("math");
	}

}
