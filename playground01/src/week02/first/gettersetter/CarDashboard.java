package week02.first.gettersetter;

public class CarDashboard {
	private int mileage;

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage, String passWord) {
		if (passWord.equals("1q2w3e4r"))
			this.mileage = mileage;
	}
	
}
