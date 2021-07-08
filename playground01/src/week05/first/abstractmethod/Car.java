package week05.first.abstractmethod;

public abstract class Car {
	private String owner;
	protected int loadageWeight;
	private int passengeNumber;
	
	Car(String owner) {
		this.owner = owner;
	}
	
	// 가상 메소드.
	// {}이 있으면 'Abstract methods do not specify a body' 에러 발생.
	public abstract void setLoadage(int loadageWeight);
	
	public void setPassengeNumber(int passengeNumber) {
		if (passengeNumber > 4)
			System.out.println("4명 이상 탈 수 없습니다.");
		else
			this.passengeNumber = passengeNumber;
	}
}
