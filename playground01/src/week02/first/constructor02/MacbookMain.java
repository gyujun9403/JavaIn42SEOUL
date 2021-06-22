package week02.first.constructor02;

public class MacbookMain {

	public static void main(String[] args) {
		//Macbook myMacbook = new Macbook();
		//'The constructor Macbook() is undefined' error occur
		Macbook myMacbook = new Macbook("gyeon");
		Macbook hisMacbook = new Macbook("beakjoon", "hotpink");
		myMacbook.showProperty();
		hisMacbook.showProperty();
	}

}
