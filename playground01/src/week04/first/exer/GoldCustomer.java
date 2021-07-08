package week04.first.exer;

public class GoldCustomer extends Customer{
	private double salesRatio;
	GoldCustomer(int custrmerID, String customerName) {
		super(custrmerID, customerName);
		customerGrade = "gold";
		salesRatio = 0.2;
	}
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= price * salesRatio;
		return price;
	}
}
