package week03.second.overriding;

public class Car {
	protected int loadageWeight;
	
	public void getLoadageWeight(int loadageWeight) {
		if (loadageWeight > 250) {
			System.out.println("Too heavy!!!");
		}
		else {
			this.loadageWeight = loadageWeight;
			System.out.println(">> set loadage : " + loadageWeight);
		}
	}
}
