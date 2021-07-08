package week05.first.abstractmethod;

public class Truck extends Car{
	
	Truck(String owner) {
		super(owner);
	}
	
	//The type Truck must implement the inherited abstract method Car.setLoadage(int)
	public void setLoadage(int loadageWeight) {
		if (loadageWeight > 1500)
			System.out.println("과적재입니다.");
		else
			super.loadageWeight = loadageWeight;
	}
}
