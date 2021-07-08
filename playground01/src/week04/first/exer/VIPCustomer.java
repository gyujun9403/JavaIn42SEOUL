package week04.first.exer;

public class VIPCustomer extends Customer{
	private int agentID;
	// static은 pool의 경우에 많이 사용을 한다.
	private double salesRatio;
	
	VIPCustomer(int custrmerID, String customerName, int agentID) {
		super(custrmerID, customerName);
		this.agentID = agentID;
		customerGrade = "VIP";
		bonusRatio = 0.1;
		salesRatio = 0.1;
	}

	@Override
	public void showCustomerInfo() {
		super.showCustomerInfo();
		System.out.println(customerName + "님의 상담원 아이디는 " + agentID + "입니다.");
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= price * salesRatio;
		return price;
	}
	
}
