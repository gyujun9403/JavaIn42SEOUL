package week03.second.kyobo;

public class Customer {
	private int point;
	
	protected void addPoint(int bookNum) {
		point += 50 * bookNum;
	}
	protected int getPoint() {
		return point;
	}
}
