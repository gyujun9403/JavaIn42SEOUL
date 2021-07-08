package week04.first.exer;

public class Customer {
	protected int custrmerID;
	protected String customerName;
	protected String customerGrade;
	protected double bonusPoint;
	protected double bonusRatio;
	
	public Customer(int custrmerID, String customerName) {
		this.custrmerID = custrmerID;
		this.customerName = customerName;
		customerGrade = "silver";
		bonusRatio = 0.01;
	}
	public int getCustrmerID() {
		return custrmerID;
	}
	public void setCustrmerID(int custrmerID) {
		this.custrmerID = custrmerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	public void showCustomerInfo() {
		System.out.println(customerName + "님의 등급은 " + customerGrade + ", 보너스 포인트는 " + bonusPoint + " 입니다.");
	}
	public double getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public double getBonusRatio() {
		return bonusRatio;
	}
	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
}
